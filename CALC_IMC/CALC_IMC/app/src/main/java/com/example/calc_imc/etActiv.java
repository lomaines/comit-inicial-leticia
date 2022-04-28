package com.example.calc_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class etActiv extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_et);

        String nome = getIntent().getStringExtra("nome");
        String peso = getIntent().getStringExtra("peso");
        String altura = getIntent().getStringExtra("altura");

        DecimalFormat df = new DecimalFormat();
        df.applyPattern("##.##");

        double ppeso = Double.parseDouble(peso);
        double paltura = Double.parseDouble(altura);

        double imc = ppeso / (paltura * paltura);


            if (imc < 18.5) {
                ((TextView) findViewById(R.id.idResult)).setText(nome + " tem IMC de " + df.format(imc) + " e está classificado(a) com Magreza");
                ((TextView) findViewById(R.id.tvMag)).setTextColor(getResources().getColor(R.color.vermelho));

            } else if (imc < 25.0) {
                ((TextView) findViewById(R.id.idResult)).setText(nome + " tem IMC de " + df.format(imc) + " e está classificado(a) com Peso Normal");
                ((TextView) findViewById(R.id.tvNorm)).setTextColor(getResources().getColor(R.color.verde));

            } else if (imc < 30.0) {
                ((TextView) findViewById(R.id.idResult)).setText(nome + " tem IMC de " + df.format(imc) + " e está classificado(a) com Sobrepeso");
                ((TextView) findViewById(R.id.tvSobre)).setTextColor(getResources().getColor(R.color.amarelo));

            } else if (imc < 35.0) {
                ((TextView) findViewById(R.id.idResult)).setText(nome + " tem IMC de " + df.format(imc) + " e está classificado(a) com Obesidade de grau I");
                ((TextView) findViewById(R.id.tvOb1)).setTextColor(getResources().getColor(R.color.vermelho));

            } else if (imc < 40.0) {
                ((TextView) findViewById(R.id.idResult)).setText(nome + " tem IMC de " + df.format(imc) + " e está classificado(a) com Obesidade de grau II");
                ((TextView) findViewById(R.id.tvOb2)).setTextColor(getResources().getColor(R.color.vermelho));

            } else {
                ((TextView) findViewById(R.id.idResult)).setText(nome + " tem IMC de " + df.format(imc) + " e está classificado(a) com Obesidade de grau III");
                ((TextView) findViewById(R.id.tvOb3)).setTextColor(getResources().getColor(R.color.vermelho));

            }

    }

    public void compartilhar(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, ((TextView) findViewById(R.id.idResult)).getText().toString());
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Compartilhar com ..."));
    }

    public void voltar(View view){
        finish();
    }


}