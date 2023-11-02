package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

// classe mainActivity
public class MainActivity extends AppCompatActivity {
    // Criar Atributo com array de strings
    String[] frases ={
        "Hello Word!!",
        "Foque nos seus objetivos , desistir é pros fracos.",
        "Nunca é tarde pra fazer aquilo que movimenta seus sonhos.",
    };
    // metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //criando metodo
    public void gerarFrase(View view){
    TextView texto = findViewById(R.id.textResultado);
    //instanciar classe random
        int numeroAleatorio = new Random().nextInt(3);
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