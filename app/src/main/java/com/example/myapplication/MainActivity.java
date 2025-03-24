package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEx1 = findViewById(R.id.btnEx1);
        Button btnEx2 = findViewById(R.id.btnEx2);
        Button btnEx3 = findViewById(R.id.btnEx3);
        Button btnEx4 = findViewById(R.id.btnEx4);
        Button btnEx5 = findViewById(R.id.btnEx5);

        btnEx1.setOnClickListener(v -> startActivity(new Intent(this, com.example.maioridadeapp.Ex1MaioridadeActivity.class)));
        btnEx2.setOnClickListener(v -> startActivity(new Intent(this, com.example.calculadoraapp.Ex2CalculadoraActivity.class)));
        btnEx3.setOnClickListener(v -> startActivity(new Intent(this, com.example.checkboxnomeapp.Ex3CadastroActivity.class)));
        btnEx4.setOnClickListener(v -> startActivity(new Intent(this, com.example.checkboxnomeapp.Ex4CheckboxNomeActivity.class)));
        btnEx5.setOnClickListener(v -> startActivity(new Intent(this, com.example.preferenciasapp.Ex5PreferenciasActivity.class)));
        btnEx5.setOnClickListener(v -> startActivity(new Intent(this, com.example.menuapp.Ex6AppCompactActivity.class)));
    }
}
