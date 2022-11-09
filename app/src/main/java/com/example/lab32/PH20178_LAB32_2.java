package com.example.lab32;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PH20178_LAB32_2 extends AppCompatActivity {
    TextView tv_ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//
        tv_ketqua=findViewById(R.id.tv_ketqua);
        Intent intent =getIntent();
        Bundle bundle =intent.getExtras();
//
        int a=Integer.parseInt(intent.getExtras().getString("soa"));
        int b=Integer.parseInt(intent.getExtras().getString("sob"));
        int c=Integer.parseInt(intent.getExtras().getString("soc"));

        double delta =(b*b)-4*a*c;
        double x = -b / 2 * a;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        if(delta <0){
            tv_ketqua.setText("Phương trình vô nghiệm");
        }else if(delta==0){
            tv_ketqua.setText("Phương trình có nghiệm kép x="+x);
        }else if(delta>0){
            tv_ketqua.setText("Phương trình có 2 nghiệm phân biệt");
            tv_ketqua.setText("X1="+x1);
            tv_ketqua.setText("X2="+x2);

        }


    }

}