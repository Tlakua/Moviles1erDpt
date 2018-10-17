package com.codequark.www.moviles1erdpt.Practicas2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.codequark.www.moviles1erdpt.R;

import java.util.Random;

public class Pct2_2 extends AppCompatActivity {

    private Button btn;
    private TextView tv_tit, tv_desc;
    private String[] tit, desc;
    private int[] imgs = new int[]{
            R.drawable.batman,
            R.drawable.pequenios,
            R.drawable.noche,
            R.drawable.starwars,
            R.drawable.harry,
            R.drawable.quedarme,
            R.drawable.whiplash,
            R.drawable.madaga2,
            R.drawable.avengers,
            R.drawable.sinsajo  };
    private Random j;
    private ImageView iv_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pct2_2);

        initView();
        prepareComponents();
    }

    private void initView(){
        tv_tit = findViewById(R.id.tv_Pct2_2_tit);
        tv_desc = findViewById(R.id.tv_Pct2_2_desc);
        btn = findViewById(R.id.btn_Pct2_2_accion);
        iv_img = findViewById(R.id.iv_Pct2_2_img);
    }

    private void prepareComponents(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeNumber();
            }
        });

        tit = getResources().getStringArray(R.array.peli);
        desc = getResources().getStringArray(R.array.descrip);

        j = new Random();
        changeNumber();
    }

    private void changeNumber(){
        int i = j.nextInt(10);
        tv_tit.setText(tit[i]);
        tv_desc.setText(desc[i]);
        iv_img.setImageResource(imgs[i]);
    }

}
