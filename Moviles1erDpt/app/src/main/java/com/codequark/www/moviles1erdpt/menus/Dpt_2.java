package com.codequark.www.moviles1erdpt.menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codequark.www.moviles1erdpt.R;

public class Dpt_2 extends AppCompatActivity {

    Button p1;
    Button p1_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dpt_2);
        inicializarVariables();
        accionButtons();
    }

    private void inicializarVariables(){
        p1 = (Button) findViewById(R.id.btn2_pct1);
        p1_1 = (Button) findViewById(R.id.btn2_pct1_1);
    }

    private void accionButtons(){
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
