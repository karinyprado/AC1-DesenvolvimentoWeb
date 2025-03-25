package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Ex1MaioridadeActivity;
import com.example.myapplication.Ex2CalculadoraActivity;
import com.example.myapplication.Ex3CadastroActivity;
import com.example.myapplication.Ex4CheckboxNomeActivity;
import com.example.myapplication.Ex5PreferenciasActivity;
import com.example.myapplication.R;


public class Ex6AppCompatActivity extends AppCompatActivity {
    private Button btnEx1, btnEx2, btnEx3, btnEx4, btnEx5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex6_app_compat);

        btnEx1 = findViewById(R.id.btnEx1);
        btnEx2 = findViewById(R.id.btnEx2);
        btnEx3 = findViewById(R.id.btnEx3);
        btnEx4 = findViewById(R.id.btnEx4);
        btnEx5 = findViewById(R.id.btnEx5);

        btnEx1.setOnClickListener(v -> startActivity(new Intent(this, Ex1MaioridadeActivity.class)));
        btnEx2.setOnClickListener(v -> startActivity(new Intent(this, Ex2CalculadoraActivity.class)));
        btnEx3.setOnClickListener(v -> startActivity(new Intent(this, Ex3CadastroActivity.class)));
        btnEx4.setOnClickListener(v -> startActivity(new Intent(this, Ex4CheckboxNomeActivity.class)));
        btnEx5.setOnClickListener(v -> startActivity(new Intent(this, Ex5PreferenciasActivity.class)));
    }
}
