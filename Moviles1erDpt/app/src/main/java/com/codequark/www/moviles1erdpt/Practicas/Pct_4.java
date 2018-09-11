package com.codequark.www.moviles1erdpt.Practicas;

import android.app.ActionBar;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.codequark.www.moviles1erdpt.R;

public class Pct_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Definimos Layout
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.FILL_PARENT);

        //Vistas
        ScrollView view = new ScrollView(this);
        view.setLayoutParams(params);

        //Capa
        LinearLayout capa = new LinearLayout(this);
        capa.setOrientation(LinearLayout.VERTICAL);
        capa.setLayoutParams(params);
        capa.setBackgroundColor(Color.GREEN);

        //Artilugios que hiran dentro del Layout
            //WidgwtsDinamicos
            TextView tv_tituloPCT = new TextView(this);
            tv_tituloPCT.setText("Practica 4: Widgets Dinamicos");
            capa.addView(tv_tituloPCT);
            //TextView NOMBRE
            TextView tv_nom = new TextView(this);
            tv_nom.setText("Nombre");
            capa.addView(tv_nom);
            //EditText NOMBRE
            final EditText et_nom = new EditText(this);
            et_nom.setHint("Escriba su nombre");
            capa.addView(et_nom);
            //Button SALUDAR
            Button btn_sal = new Button(this);
            btn_sal.setText("SALUDAR");
            btn_sal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String nom = et_nom.getText().toString();
                    Toast.makeText(getApplicationContext(), "Hola " + nom , Toast.LENGTH_SHORT).show();
                }
            });
            capa.addView(btn_sal);

        //Añadir a la vista los componentes (artilugios)
        view.addView(capa);
        setContentView(view);
    }
}
