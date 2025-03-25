package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;

public class Ex5PreferenciasActivity extends AppCompatActivity {
    private CheckBox chkNotificacoes, chkModoEscuro, chkLembrarLogin;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex5_preferencias);

        chkNotificacoes = findViewById(R.id.chkNotificacoes);
        chkModoEscuro = findViewById(R.id.chkModoEscuro);
        chkLembrarLogin = findViewById(R.id.chkLembrarLogin);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder msg = new StringBuilder("Opções escolhidas:\n");

                if (chkNotificacoes.isChecked()) msg.append("- Receber notificações\n");
                if (chkModoEscuro.isChecked()) msg.append("- Modo escuro\n");
                if (chkLembrarLogin.isChecked()) msg.append("- Lembrar login\n");

                if (msg.toString().equals("Opções escolhidas:\n")) {
                    msg = new StringBuilder("Nenhuma preferência foi escolhida.");
                }

                Toast.makeText(Ex5PreferenciasActivity.this, msg.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
