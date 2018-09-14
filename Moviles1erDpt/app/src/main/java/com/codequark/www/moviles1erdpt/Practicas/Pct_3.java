package com.codequark.www.moviles1erdpt.Practicas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.codequark.www.moviles1erdpt.R;

public class Pct_3 extends AppCompatActivity {

    TextView tv_nomNot;
    TextView tv_por;
    TextView tv_fecha;
    TextView tv_noticia;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pct_3);
        tv_nomNot = (TextView) findViewById(R.id.tv_nomNot);
        tv_por = (TextView) findViewById(R.id.tv_por);
        tv_fecha = (TextView) findViewById(R.id.tv_fecha);
        tv_noticia = (TextView) findViewById(R.id.tv_noticia);
        inicializarValores();
    }

    public void inicializarValores(){
        tv_nomNot.setText("Noticia num 1");
        tv_por.setText("publicador num 1");
        tv_fecha.setText("fecha 1");
        tv_noticia.setText("aqui debera ir una noticia 1");
    }

    public void cambiarValores(){

        tv_nomNot.setText("Noticia num 2");
        tv_por.setText("publicador num 2");
        tv_fecha.setText("fecha 2");
        tv_noticia.setText("aqui debera ir una noticia 2");
    }

    public void btn_cambiar(View v){
        if (i == 0){
            cambiarValores();
            i += 1;
        }else{
            inicializarValores();
            i -= 1;
        }
    }
}
