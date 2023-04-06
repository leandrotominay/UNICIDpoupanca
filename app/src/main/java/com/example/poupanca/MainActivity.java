package com.example.poupanca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtView1;
    private TextView txtView2;
    private TextView txtView3;

    private EditText input1;
    private EditText input2;
    private EditText input3;
    private EditText input4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = findViewById(R.id.input1); // VALOR INICIAL
        input2 = findViewById(R.id.input2); // APLICAÇÃO MENSAL
        input3 = findViewById(R.id.input3); // TEMPO DA APLICAÇÃO
        input4 = findViewById(R.id.input4); // TAXA
        txtView1 = findViewById(R.id.txtView1); // Resultado investimento
        // FORMULA = APLICAÇÃO MENSAL * ((1 + TAXA) ^APLICAÇÃO - 1 / TAXA

    }

    public void calcular(View view) {
        int valor1 = Integer.parseInt(input1.getText().toString());
        int valor2 = Integer.parseInt(input2.getText().toString());
        int valor3 = Integer.parseInt(input3.getText().toString());
        int valor4 = Integer.parseInt(input4.getText().toString());
        txtView1.setText(String.valueOf(valor2 * ((1 + valor4) ^valor2) / valor4));


    }
}