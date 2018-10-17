package com.codequark.www.moviles1erdpt.Practicas2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.codequark.www.moviles1erdpt.R;

import java.util.Random;

public class Pct2_3 extends AppCompatActivity {

    private Button btn_accion;
    private TextView tv_preg, tv_int, tv_ultima;
    private RadioButton rb_res1, rb_res2, rb_res3;
    String[] pregs, resCor, resInc1, resInc2;
    private int i = 1, cont = 0,  randRB = 0;
    private Random rand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pct2_3);

        initViews();
        prepareComponents();
    }

    private void initViews(){
        btn_accion = findViewById(R.id.btn_accion_pct2_3);
        tv_int = findViewById(R.id.tv_int_pct2_3);
        tv_ultima = findViewById(R.id.tv_ultima_pct2_3);
        rb_res1 = findViewById(R.id.rb_res1_pct2_3);
        rb_res2 = findViewById(R.id.rb_res2_pct2_3);
        rb_res3 = findViewById(R.id.rb_res3_pct2_3);
        tv_preg = findViewById(R.id.tv_preg_pct2_3);

        pregs = getResources().getStringArray(R.array.pct2_3_pregs);
        resCor = getResources().getStringArray(R.array.pct2_3_respCo);
        resInc1 = getResources().getStringArray(R.array.pct2_3_respInc1);
        resInc2 = getResources().getStringArray(R.array.pct2_3_respInc2);
    }

    private void prepareComponents(){
        btn_accion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_accion();
            }
        });
    }

    private void btn_accion(){
        pregunta();
    }

    private void pregunta(){
        if(i < 6){
            tv_preg.setText(pregs[i]);
            i += 1;
        }else{
            finalEncuesta();
            i = 0;
        }
    }

    private void finalEncuesta(){
        Toast.makeText(this, "termino la encuesta con :" + cont, Toast.LENGTH_SHORT).show();
    }
}
