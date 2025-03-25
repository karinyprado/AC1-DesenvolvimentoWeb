package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;

public class Ex3CadastroActivity extends AppCompatActivity {
    private EditText edtNome, edtIdade, edtUF, edtCidade, edtTelefone, edtEmail;
    private RadioGroup rgTamanho;
    private CheckBox chkAzul, chkVermelho, chkVerde, chkPreto;
    private Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3_cadastro);

        edtNome = findViewById(R.id.etNome);
        edtIdade = findViewById(R.id.etIdade);
        edtUF = findViewById(R.id.edtUF);
        edtCidade = findViewById(R.id.edtCidade);
        edtTelefone = findViewById(R.id.etTelefone);
        edtEmail = findViewById(R.id.edtEmail);
        rgTamanho = findViewById(R.id.rgTamanho);
        chkAzul = findViewById(R.id.chkAzul);
        chkVermelho = findViewById(R.id.chkVermelho);
        chkPreto = findViewById(R.id.chkPreto);
        btnCadastrar = findViewById(R.id.btnCadastrar);

        btnCadastrar.setOnClickListener(view -> {
            String nome = edtNome.getText().toString();
            int idade = Integer.parseInt(edtIdade.getText().toString());
            String uf = edtUF.getText().toString();
            String cidade = edtCidade.getText().toString();
            String telefone = edtTelefone.getText().toString();
            String email = edtEmail.getText().toString();

            int selectedId = rgTamanho.getCheckedRadioButtonId();
            RadioButton rbSelecionado = findViewById(selectedId);
            String tamanho = rbSelecionado != null ? rbSelecionado.getText().toString() : "";

            String cores = "";
            if (chkAzul.isChecked()) cores += "Azul ";
            if (chkVermelho.isChecked()) cores += "Vermelho ";
            if (chkVerde.isChecked()) cores += "Verde ";
            if (chkPreto.isChecked()) cores += "Preto ";

            String resultado = "Cadastro:\nNome: " + nome + "\nIdade: " + idade + "\nUF: " + uf + "\nCidade: " + cidade +
                    "\nTelefone: " + telefone + "\nEmail: " + email + "\nTamanho: " + tamanho + "\nCores Preferidas: " + cores;

            Toast.makeText(Ex3CadastroActivity.this, resultado, Toast.LENGTH_LONG).show();
        });
    }
}