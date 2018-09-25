package com.codequark.www.moviles1erdpt.menus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codequark.www.moviles1erdpt.Practicas1.Pct_1;
import com.codequark.www.moviles1erdpt.Practicas1.Pct_2;
import com.codequark.www.moviles1erdpt.Practicas1.Pct_3;
import com.codequark.www.moviles1erdpt.Practicas1.Pct_4;
import com.codequark.www.moviles1erdpt.Practicas1.Pct_4_1;
import com.codequark.www.moviles1erdpt.R;

public class Dpt_1 extends AppCompatActivity {

    Button p1;
    Button p2;
    Button p3;
    Button p4;
    Button p4_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dpt_1);
        inicializarVariables();
        accionButton();
    }

    private void inicializarVariables(){
        p1 = (Button) findViewById(R.id.btn_pct1);
        p2 = (Button) findViewById(R.id.btn_pct2);
        p3 = (Button) findViewById(R.id.btn_pct3);
        p4 = (Button) findViewById(R.id.btn_pct4);
        p4_1 = (Button) findViewById(R.id.btn_pct4_2);
    }

    private void accionButton(){
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Pct_1.class));
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Pct_2.class));
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Pct_3.class));
            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Pct_4.class));
            }
        });
        p4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Pct_4_1.class));
            }
        });
    }
}
