package com.example.calc_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nome, peso, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nome = (EditText) findViewById(R.id.etNome);
        peso = (EditText) findViewById(R.id.etPeso);
        altura = (EditText) findViewById(R.id.etAltura);

    }

    public void limpar (View view){
        Intent limpar = new Intent();
        ((EditText) findViewById(R.id.etNome)).setText("");
        ((EditText) findViewById(R.id.etAltura)).setText("");
        ((EditText) findViewById(R.id.etPeso)).setText("");
    }

    public void enviar(View view) {
        Intent intent = new Intent(getApplicationContext(), etActiv.class);
        intent.putExtra("nome", ((EditText) findViewById(R.id.etNome)).getText().toString());
        intent.putExtra("peso", ((EditText) findViewById(R.id.etPeso)).getText().toString());
        intent.putExtra("altura", ((EditText) findViewById(R.id.etAltura)).getText().toString());
        startActivity(intent);

    }

}