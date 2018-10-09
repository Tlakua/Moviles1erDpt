/* Tlakua es tu dios, a el me rindire */
package com.codequark.www.moviles1erdpt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codequark.www.moviles1erdpt.menus.Dpt_1;
import com.codequark.www.moviles1erdpt.menus.Dpt_2;

public class MainActivity extends AppCompatActivity {

    Button btn_men1;
    Button btn_men2;
    Button btn_men3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVariables();
        accionButtons();
    }

    private void inicializarVariables(){
        btn_men1 = (Button) findViewById(R.id.btn_men1);
        btn_men2 = (Button) findViewById(R.id.btn_men2);
        btn_men3 = (Button) findViewById(R.id.btn_men3);
    }

    private void accionButtons(){
        btn_men1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Dpt_1.class));
            }
        });
        btn_men2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Dpt_2.class));
            }
        });
        btn_men3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getApplicationContext(), Dpt_1.class));
            }
        });
    }
}
