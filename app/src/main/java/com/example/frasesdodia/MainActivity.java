package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// classe mainActivity
public class MainActivity extends AppCompatActivity {
    // Criar Atributo com array de strings
    String[] frases ={
        "Frase 01",
        "Frase 02",
        "Frase 03",
    };
    // metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //criando metodo
    public void gerarFrase(View view){

    }

    public void exibirTodas(View view){
        TextView texto = findViewById(R.id.textResultado);

        String textoResultado="";
        // loop for pra exibir todas as frases
        for(String frase : frases){
            textoResultado = textoResultado + frase + "\n";
        }
        texto.setText(textoResultado);
    }
}