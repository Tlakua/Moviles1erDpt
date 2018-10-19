package com.codequark.www.moviles1erdpt.Practicas2;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.codequark.www.moviles1erdpt.R;


public class Pct2_3 extends AppCompatActivity {

    private Button btn_accion;
    private TextView tv_preg, tv_int, tv_ultima;
    private RadioButton rb_res1, rb_res2, rb_res3;
    String[] pregs, resCor, resInc1, resInc2;
    private int i = 0, cont = 0,  intento = 0;
    private RadioGroup rbGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pct2_3);

        initViews();
        setPregYRb();
        tv_ultima.setText("" + cont);
        tv_int.setText("" + intento);
        btn_accion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador();
                valid();
            }
        });
    }

    private void initViews(){
        btn_accion = findViewById(R.id.btn_accion_pct2_3);
        tv_int = findViewById(R.id.tv_int_pct2_3);
        tv_ultima = findViewById(R.id.tv_ultima_pct2_3);
        rb_res1 = findViewById(R.id.rb_res1_pct2_3);
        rb_res2 = findViewById(R.id.rb_res2_pct2_3);
        rb_res3 = findViewById(R.id.rb_res3_pct2_3);
        tv_preg = findViewById(R.id.tv_preg_pct2_3);
        rbGroup = findViewById(R.id.rbg_pct2_3);

        pregs = getResources().getStringArray(R.array.pct2_3_pregs);
        resCor = getResources().getStringArray(R.array.pct2_3_respCo);
        resInc1 = getResources().getStringArray(R.array.pct2_3_respInc1);
        resInc2 = getResources().getStringArray(R.array.pct2_3_respInc2);
    }

    private void setPregYRb(){
        tv_preg.setText(pregs[i]);
        rb_res1.setText(resCor[i]);
        rb_res2.setText(resInc1[i]);
        rb_res3.setText(resInc2[i]);
    }

    private void valid(){
        boolean cheked1, cheked2, cheked3;
        cheked1 = rb_res1.isChecked();
        cheked2 = rb_res2.isChecked();
        cheked3 = rb_res3.isChecked();
        if ((cheked1)||(cheked2)||(cheked3)){
            if (i < 5){
                i += 1;
                setPregYRb();
                rbGroup.clearCheck();
            }else{
                rbGroup.clearCheck();
                i = 0;
                intento += 1;
                tv_ultima.setText("" + cont);
                tv_int.setText("" + intento);
                Toast.makeText(getApplicationContext(), "Aqui termina el cuestionario", Toast.LENGTH_SHORT).show();
                dialogFinal();
                cont = 0;
                setPregYRb();
            }
        }else{
            Toast.makeText(getApplicationContext(), "Seleccione '1' RadioButton", Toast.LENGTH_SHORT).show();
        }
    }

    private void contador(){
        switch (i){
            case 0:
                if (rb_res1.isChecked()){ cont += 1; } break;
            case 1:
                if (rb_res1.isChecked()){ cont += 1; } break;
            case 2:
                if (rb_res1.isChecked()){ cont += 1; } break;
            case 3:
                if (rb_res1.isChecked()){ cont += 1; } break;
            case 4:
                if (rb_res1.isChecked()){ cont += 1; } break;
            case 5:
                if (rb_res1.isChecked()){ cont += 1; } break;
        }
    }

    private void dialogFinal(){
        final Dialog dialogo = new Dialog (this);
        dialogo.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogo.setCancelable(false);
        dialogo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        dialogo.setContentView(R.layout.dialog_pct2_3);

        TextView tv_dialog_cont = dialogo.findViewById(R.id.tv_dialog_pct2_3_cont);
        Button btn_dialog = dialogo.findViewById(R.id.btn_dialog_pct2_3_1);

        tv_dialog_cont.setText("" + cont);
        btn_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogo.cancel();
            }
        });

        dialogo.dismiss();
        dialogo.show();
    }

    private void setSP(){
        SharedPreferences prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
        
    }

}