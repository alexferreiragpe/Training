package com.alex.treino_mulher;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import com.alex.trainning.R;

public class TreinoMulherAvancado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.treinomulheravancado);

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(TreinoMulherAvancado.this);
        alertDialog.setTitle("Training - Mulher - Avançado");
        alertDialog.setMessage("Todos os Exercícios: \n\n3 Séries de 12 \n\nDescansar 15\"  entre Séries\nDescansar 30\" entre Exercícios\nTreino Bisset - Fazer 2 em Sequência, depois descansa");
        alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.setIcon(R.drawable.img_icone);
        alertDialog.show();

    }
}
