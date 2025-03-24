package com.example.maioridadeapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Ex1MaioridadeActivity extends AppCompatActivity {
    private EditText edtNome, edtIdade;
    private Button btnVerificar;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        edtIdade = findViewById(R.id.edtIdade);
        btnVerificar = findViewById(R.id.btnVerificar);
        txtResultado = findViewById(R.id.txtResultado);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = edtNome.getText().toString();
                int idade = Integer.parseInt(edtIdade.getText().toString());

                if (idade >= 18) {
                    txtResultado.setText(nome + " é maior de idade.");
                } else {
                    txtResultado.setText(nome + " é menor de idade.");
                }
            }
        });
    }
}
