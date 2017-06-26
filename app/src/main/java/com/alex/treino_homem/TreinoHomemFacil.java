package com.alex.treino_homem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alex.exercicios.Desenvolvimento;
import com.alex.exercicios.Extensora;
import com.alex.exercicios.Gemeos;
import com.alex.exercicios.LegHorizontal;
import com.alex.exercicios.MaquinaScoth;
import com.alex.exercicios.Mesa_Flexora;
import com.alex.exercicios.Peck_Deck;
import com.alex.exercicios.Puxada_Atras;
import com.alex.exercicios.Remada_Artic_Fechada;
import com.alex.exercicios.Rosca_Invertida;
import com.alex.exercicios.Supino_Maquina;
import com.alex.exercicios.Triceps;
import com.alex.trainning.R;

public class TreinoHomemFacil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.treinohomemfacil);
        Toast.makeText(this, "Todos os Exercícios: \n\n3 Séries de 12 \n\nDescansar 15\"  entre Séries\nDescansar 45\" entre Exercícios", Toast.LENGTH_LONG).show();

        Button btnSupinoMaquina = (Button) findViewById(R.id.btnSupinoMaquina);
        Button btnPeckDeck = (Button) findViewById(R.id.btnPeckDeck);
        Button btnDesenvolvimento = (Button) findViewById(R.id.btnDesenvolvimento);
        Button btnTriceps = (Button) findViewById(R.id.btnTriceps);
        Button btnMaquinaScoth = (Button) findViewById(R.id.btnMaquinaScoth);
        Button btnExtensora = (Button) findViewById(R.id.btnExtensora);
        Button btnLegHorizontal = (Button) findViewById(R.id.btnLegHorizontal);
        Button btnPuxadaAtras = (Button) findViewById(R.id.btnPuxadaAtras);
        Button btnRemadaArtFechada = (Button) findViewById(R.id.btnRemadaArtFechada);
        Button btnRoscaInversa = (Button) findViewById(R.id.btnRoscaInversa);
        Button btnMesaFlexora = (Button) findViewById(R.id.btnMesaFlexora);
        Button btnGemeos = (Button) findViewById(R.id.btnGemeos);

        btnSupinoMaquina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnSupinoMaquina = new Intent(TreinoHomemFacil.this, Supino_Maquina.class);
                startActivity(btnSupinoMaquina);
            }
        });

        btnPeckDeck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnPeckDeck = new Intent(TreinoHomemFacil.this, Peck_Deck.class);
                startActivity(btnPeckDeck);
            }
        });

        btnDesenvolvimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnPeckDeck = new Intent(TreinoHomemFacil.this, Desenvolvimento.class);
                startActivity(btnPeckDeck);
            }
        });

        btnTriceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnTriceps = new Intent(TreinoHomemFacil.this, Triceps.class);
                startActivity(btnTriceps);
            }
        });

        btnMaquinaScoth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnMaquinaScoth = new Intent(TreinoHomemFacil.this, MaquinaScoth.class);
                startActivity(btnMaquinaScoth);
            }
        });

        btnExtensora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnExtensora = new Intent(TreinoHomemFacil.this, Extensora.class);
                startActivity(btnExtensora);
            }
        });

        btnLegHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnLegHorizontal = new Intent(TreinoHomemFacil.this, LegHorizontal.class);
                startActivity(btnLegHorizontal);
            }
        });

        btnPuxadaAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnPuxadaAtras = new Intent(TreinoHomemFacil.this, Puxada_Atras.class);
                startActivity(btnPuxadaAtras);
            }
        });

        btnRemadaArtFechada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnRemadaArtFechada = new Intent(TreinoHomemFacil.this, Remada_Artic_Fechada.class);
                startActivity(btnRemadaArtFechada);
            }
        });

        btnRoscaInversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnRoscaInversa = new Intent(TreinoHomemFacil.this, Rosca_Invertida.class);
                startActivity(btnRoscaInversa);
            }
        });

        btnMesaFlexora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnMesaFlexora = new Intent(TreinoHomemFacil.this, Mesa_Flexora.class);
                startActivity(btnMesaFlexora);
            }
        });

        btnGemeos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnGemeos = new Intent(TreinoHomemFacil.this, Gemeos.class);
                startActivity(btnGemeos);
            }
        });
    }
}
