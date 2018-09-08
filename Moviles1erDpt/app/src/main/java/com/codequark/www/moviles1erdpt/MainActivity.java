package com.codequark.www.moviles1erdpt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codequark.www.moviles1erdpt.Practicas.Pct_1;
import com.codequark.www.moviles1erdpt.Practicas.Pct_2;
import com.codequark.www.moviles1erdpt.Practicas.Pct_3;
import com.codequark.www.moviles1erdpt.Practicas.Pct_3_1;
import com.codequark.www.moviles1erdpt.Practicas.Pct_4;
import com.codequark.www.moviles1erdpt.Practicas.Pct_4_1;

public class MainActivity extends AppCompatActivity {

    Button p1;
    Button p2;
    Button p3;
    Button p3_1;
    Button p4;
    Button p4_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1 = (Button) findViewById(R.id.btn_pct1);
        p2 = (Button) findViewById(R.id.btn_pct2);
        p3 = (Button) findViewById(R.id.btn_pct3);
        p3_1 = (Button) findViewById(R.id.btn_pct3_1);
        p4 = (Button) findViewById(R.id.btn_pct4);
        p4_1 = (Button) findViewById(R.id.btn_pct4_2);
    }

    public void btn1(View v){
        startActivity(new Intent(this, Pct_1.class));
    }

    public void btn2(View v){
        startActivity(new Intent(this, Pct_2.class));
    }

    public void btn3(View v){
        startActivity(new Intent(this, Pct_3.class));
    }

    public void btn3_1(View v){
        startActivity(new Intent(this, Pct_3_1.class));
    }

    public void btn4(View v){
        startActivity(new Intent(this, Pct_4.class));
    }

    public void btn4_1(View v){
        startActivity(new Intent(this, Pct_4_1.class));
    }
}
