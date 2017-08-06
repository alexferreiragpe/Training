package com.alex.treino_homem;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alex.exercicios.Afundo_Smith;
import com.alex.exercicios.Agacha_Smith;
import com.alex.exercicios.CrossOver;
import com.alex.exercicios.Supino_Incli_Halter;
import com.alex.exercicios.Supino_Reto;
import com.alex.exercicios.Triceps_Graviton;
import com.alex.exercicios.Triceps_Supinado;
import com.alex.exercicios.Triceps_UnilateralNeutro;
import com.alex.trainning.R;

public class TreinoHomemMedio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.treinohomemmedio);

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(TreinoHomemMedio.this);
        alertDialog.setTitle("Training - Homem - Médio");
        alertDialog.setMessage("Todos os Exercícios: \n\n3 Séries de 10 \n\nDescansar 15\"  entre Séries\nDescansar 30\" entre Exercícios");
        alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.setIcon(R.drawable.img_icone);
        alertDialog.show();


        Button btnSupinoMaquina = (Button) findViewById(R.id.btnSupinoReto);
        Button btnTricepsGraviton = (Button) findViewById(R.id.btnTricepsGraviton);
        Button btnTricepsUnilNeutro = (Button) findViewById(R.id.btnTricepsUnilNeutro);
        Button btnSupinoIncHalter = (Button) findViewById(R.id.btnSupinoInclHalter);
        Button btnTricepsSupinado = (Button) findViewById(R.id.btnTricepsSupinado);
        Button btnCrossOverPeito = (Button) findViewById(R.id.btnCrossOverPeito);
        Button btnAgachamentoSmith = (Button) findViewById(R.id.btnAgachamentoSmith);
        Button btnAfundoSmith = (Button) findViewById(R.id.btnAfundoSmith);

        btnSupinoMaquina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TreinoHomemMedio.this, Supino_Reto.class));
            }
        });

        btnTricepsGraviton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TreinoHomemMedio.this, Triceps_Graviton.class));
            }
        });


        btnTricepsUnilNeutro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TreinoHomemMedio.this, Triceps_UnilateralNeutro.class));
            }
        });

        btnSupinoIncHalter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TreinoHomemMedio.this, Supino_Incli_Halter.class));
            }
        });

        btnTricepsSupinado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TreinoHomemMedio.this, Triceps_Supinado.class));
            }
        });

        btnCrossOverPeito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TreinoHomemMedio.this, CrossOver.class));
            }
        });

        btnAgachamentoSmith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TreinoHomemMedio.this, Agacha_Smith.class));
            }
        });

        btnAfundoSmith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TreinoHomemMedio.this, Afundo_Smith.class));
            }
        });
    }
}
