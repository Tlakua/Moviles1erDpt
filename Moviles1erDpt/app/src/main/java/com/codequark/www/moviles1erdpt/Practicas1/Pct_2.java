package com.codequark.www.moviles1erdpt.Practicas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.codequark.www.moviles1erdpt.R;

public class Pct_2 extends AppCompatActivity {
//TODO testear esta practica con un emulador o telefono
    EditText et_1;
    EditText et_2;
    Button btn_1;
    String usrReg = "admin";
    String passReg = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pct_2);

    }

    public void btn_1_2(View v){
        et_1 = (EditText) findViewById(R.id.et_1_2);
        et_2 = (EditText) findViewById(R.id.et_2_2);
        btn_1 = (Button) findViewById(R.id.btn_1_2);

        String user = et_1.getText().toString();
        String pass = et_2.getText().toString();

        if(usrReg.equals(user)&&(passReg.equals(pass))){
            Toast.makeText(this, "Usuario Válido. Bienvenido", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Usuario no válido", Toast.LENGTH_SHORT).show();
        }
    }
}