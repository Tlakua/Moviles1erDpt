package com.codequark.www.moviles1erdpt.Practicas2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.codequark.www.moviles1erdpt.R;

public class Pct2_1 extends AppCompatActivity {

    private Spinner cbo1;
    private Spinner cbo2;
    private ArrayAdapter adp1, adp2;
    private ListView listView;
    String[] genero;
    String[] scifi;
    String[] comedia;
    String[] terror;
    String[] accion;
    String[] suspenso;
    String[] post_Apoc;
    String[] xxx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pct2_1);

        inicializarComponentes();
        cargarDatos();

        cbo1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String value = (String) parent.getItemAtPosition(position);
                cbo1_itemClick(value);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //aqui lo que quieres que haga cuando no hay nada seleccionado
            }
        });
    }

    private void inicializarComponentes(){
        cbo1 = (Spinner) findViewById(R.id.cbo1_pct2_1);
        cbo2 = (Spinner) findViewById(R.id.cbo2_pct2_1);
        listView = (ListView) findViewById(R.id.listView_pct2_1);
    }

    private void cargarDatos(){
        genero = new String[]{"sci-fi", "comedia", "terror", "accion", "suspenso", "post-Apoc", "xxx"};
        scifi = new String[]{"Total recall", "Running man", "Predator"};
        comedia = new String[]{"Una esposa de mentiras", "Sharnado", "Son como niños"};
        terror = new String[]{"xxx1", "xxx2", "xxx3, el regreso"};
        accion = new String[]{"accion leve", "accion media", "accion fuerte"};
        suspenso = new String[]{"susp1", "susp2", "susp3"};
        post_Apoc = new String[]{"post1", "post2", "post3"};
        xxx = new String[]{"x1", "x2", "x3"};

        adp1 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, genero);
        cbo1.setAdapter(adp1);
        listView.setAdapter(adp1);
    }

    private void cbo1_itemClick(String value){
        String[] lista = null;
        if(value.equals("sci-fi")){
            lista = scifi;
        }else if(value.equals("comedia")){
            lista = comedia;
        }else if(value.equals("terror")){
            lista = terror;
        }else if(value.equals("suspenso")){
            lista = suspenso;
        }else if(value.equals("post-Apoc")){
            lista = post_Apoc;
        }else if(value.equals("xxx")){
            lista = xxx;
        }else if (value.equals("accion")){
            lista = accion;
        }

        adp2 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, lista);
        cbo2.setAdapter(adp2);
    }
}
