package com.codequark.www.moviles1erdpt.Practicas1;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Pct_4_1 extends AppCompatActivity {

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar.LayoutParams params = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.FILL_PARENT);
        ScrollView view = new ScrollView(this);
        view.setLayoutParams(params);

        LinearLayout capa = new LinearLayout(this);
        capa.setOrientation(LinearLayout.VERTICAL);
        capa.setLayoutParams(params);

        TextView tv_pct4_1 = new TextView(this);
        tv_pct4_1.setText("Practica 4.1: 100 botones programaticos");
        capa.addView(tv_pct4_1);

        final Button [] btn_pct4_1 = new Button[100];
        for (i = 0; i < 100; i++){
            btn_pct4_1[i] = new Button(this);
            btn_pct4_1[i].setText("boton " + (i+1) );

            capa.addView(btn_pct4_1[i]);
        }

        view.addView(capa);
        setContentView(view);

    }
}
