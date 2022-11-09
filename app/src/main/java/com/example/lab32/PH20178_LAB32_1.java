package com.example.lab32;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PH20178_LAB32_1 extends AppCompatActivity {

    // Khai báo
    EditText soA, soB, soC;
    Button giaipt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Ánh xạ
        soA=findViewById(R.id.ed_soa);
        soB=findViewById(R.id.ed_sob);
        soC=findViewById(R.id.ed_soc);
        giaipt=findViewById(R.id.btn_giaipt);
        // Xử lý sự kiện
    }
    public void giaipt(View view){
        Intent intent = new Intent(PH20178_LAB32_1.this, PH20178_LAB32_2.class);
        intent.putExtra("soa",soA.getText().toString());
        intent.putExtra("sob",soB.getText().toString());
        intent.putExtra("soc",soC.getText().toString());
        startActivity(intent);
    }
}