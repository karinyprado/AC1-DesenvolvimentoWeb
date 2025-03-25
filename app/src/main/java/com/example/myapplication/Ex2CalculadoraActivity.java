package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;


public class Ex2CalculadoraActivity extends AppCompatActivity {
    private EditText edtNum1, edtNum2;
    private Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2_calculadora);

        edtNum1 = findViewById(R.id.etNum1);
        edtNum2 = findViewById(R.id.etNum2);
        btnSomar = findViewById(R.id.btnSoma);
        btnSubtrair = findViewById(R.id.btnSubtracao);
        btnMultiplicar = findViewById(R.id.btnMultiplicacao);
        btnDividir = findViewById(R.id.btnDivisao);
        txtResultado = findViewById(R.id.tvResultado);

        View.OnClickListener operacao = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(edtNum1.getText().toString());
                double num2 = Double.parseDouble(edtNum2.getText().toString());
                double resultado = 0;

                if (v == btnSomar) resultado = num1 + num2;
                else if (v == btnSubtrair) resultado = num1 - num2;
                else if (v == btnMultiplicar) resultado = num1 * num2;
                else if (v == btnDividir) resultado = num1 / num2;

                txtResultado.setText("Resultado: " + resultado);
            }
        };

        btnSomar.setOnClickListener(operacao);
        btnSubtrair.setOnClickListener(operacao);
        btnMultiplicar.setOnClickListener(operacao);
        btnDividir.setOnClickListener(operacao);
    }
}
