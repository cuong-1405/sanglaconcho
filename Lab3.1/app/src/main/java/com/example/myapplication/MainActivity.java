package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Khai báo
    EditText username,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ánh xạ
         username = (EditText) findViewById(R.id.ed_user);
         password = (EditText) findViewById(R.id.ed_pass);
         login=findViewById(R.id.btn_login);
         // xử lý sự kiện
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Đăng nhập thành công",Toast.LENGTH_SHORT).show();
                    //correcct password
                } else {
                    Toast.makeText(getApplicationContext(), "đăng nhập thất bại",Toast.LENGTH_SHORT).show();
                    //wrong password
                }
            }
        });
    }


}