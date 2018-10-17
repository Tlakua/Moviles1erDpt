package com.codequark.www.moviles1erdpt.menus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codequark.www.moviles1erdpt.Practicas2.Pct2_1;
import com.codequark.www.moviles1erdpt.Practicas2.Pct2_1_1;
import com.codequark.www.moviles1erdpt.Practicas2.Pct2_2;
import com.codequark.www.moviles1erdpt.Practicas2.Pct2_3;
import com.codequark.www.moviles1erdpt.R;

public class Dpt_2 extends AppCompatActivity {

    Button p1, p1_1, p2, p3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dpt_2);
        initViews();
        accionButtons();
    }

    private void initViews(){
        p1 = findViewById(R.id.btn2_pct1);
        p1_1 = findViewById(R.id.btn2_pct1_1);
        p2 = findViewById(R.id.btn2_pct2);
        p3 = findViewById(R.id.btn2_pct3);
    }

    private void accionButtons(){
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Pct2_1.class));
            }
        });
        p1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Pct2_1_1.class));
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Pct2_2.class));
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Pct2_3.class));
            }
        });
    }
}
