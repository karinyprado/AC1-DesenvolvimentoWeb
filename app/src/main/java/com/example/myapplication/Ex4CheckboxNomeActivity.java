package com.example.checkboxnomeapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.MainActivity;

public class Ex4CheckboxNomeActivity extends AppCompatActivity {
    private EditText edtNome;
    private Button btnGerar;
    private LinearLayout layoutCheckBoxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        btnGerar = findViewById(R.id.btnGerar);
        layoutCheckBoxes = findViewById(R.id.layoutCheckBoxes);

        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutCheckBoxes.removeAllViews();
                String nome = edtNome.getText().toString();

                for (char letra : nome.toCharArray()) {
                    CheckBox checkBox = new CheckBox(MainActivity.this);
                    checkBox.setText(String.valueOf(letra));
                    layoutCheckBoxes.addView(checkBox);
                }
            }
        });
    }
}
