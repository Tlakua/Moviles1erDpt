package com.codequark.www.moviles1erdpt.Practicas2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.codequark.www.moviles1erdpt.R;

import java.util.ArrayList;

public class Pct2_1_1 extends AppCompatActivity {
    private ListView listV;
    private EditText edt;
    private Button btnAgre, btnbsel, btnbtodo;
    private ArrayList<String> listArray;
    private ArrayAdapter adapter;
    private int positioToDelete = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pct2_1_1);

        initView();
        prepareComponents();
    }

    private void initView() {
        listV = findViewById(R.id.listV_pct2_1_1);
        edt = findViewById(R.id.edt_pct2_1_1);
        btnAgre = findViewById(R.id.btn_pct2_1_1);
        btnbsel = findViewById(R.id.btnb1_pct2_1_1);
        btnbtodo = findViewById(R.id.btnbt_pct2_1_1);
    }

    private void prepareComponents() {
        cargarDatos();

        btnAgre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickBTN();
            }
        });

        btnbsel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickBseleccion();
            }
        });

        btnbtodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickBtodo();
            }
        });

        listV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                positioToDelete = position;
            }
        });
    }

    private void clickBTN() {
        String dato = edt.getText().toString();
        adapter.add(dato);
        edt.setText("");
    }

    private void cargarDatos() {
        listArray = new ArrayList<>();
        listArray.add("Luis");
        listArray.add("David");
        listArray.add("Tlalpachito");
        listArray.add("Anguiano");

        adapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, listArray);
        listV.setAdapter(adapter);
    }

    private void clickBseleccion() {
        if(positioToDelete != -1) {
            listArray.remove(positioToDelete);
            adapter.notifyDataSetChanged();
            positioToDelete = -1;
        }
    }

    private void clickBtodo() {
        adapter.clear();
    }
}
