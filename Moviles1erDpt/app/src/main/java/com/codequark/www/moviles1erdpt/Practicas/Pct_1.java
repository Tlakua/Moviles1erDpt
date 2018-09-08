package com.codequark.www.moviles1erdpt.Practicas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.codequark.www.moviles1erdpt.R;

public class Pct_1 extends AppCompatActivity {

    Button btn_1;
    EditText et_1;
    EditText et_2;
    TextView tv_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pct_1);

        btn_1 = (Button) findViewById(R.id.btn_1PCT1);
        et_1 = (EditText) findViewById(R.id.et_1PCT1);
        et_2 = (EditText) findViewById(R.id.et_2PCT1);
        tv_1 = (TextView) findViewById(R.id.tv_1PCT1);

    }

    public void btn_1(View v){
        int a = Integer.parseInt(et_1.getText().toString());
        int b = Integer.parseInt(et_2.getText().toString());

        int c = a + b;
        String resul = "Resultado: " + c;
        tv_1.setText(resul);
    }
}
