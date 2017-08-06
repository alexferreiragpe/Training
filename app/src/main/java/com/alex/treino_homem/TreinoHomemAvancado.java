package com.alex.treino_homem;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alex.exercicios.Agachamento_Livre_Barra;
import com.alex.trainning.R;

public class TreinoHomemAvancado extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.treinohomemavancado);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(TreinoHomemAvancado.this);
        alertDialog.setTitle("Training - Homem - Avançado");
        alertDialog.setMessage("Todos os Exercícios: \n\n3 Séries de 10 \n\nDescansar 15\"  entre Séries\nDescansar 15\" entre Exercícios");
        alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.setIcon(R.drawable.img_icone);
        alertDialog.show();

        Button btnAgachaLivreBarra = (Button) findViewById(R.id.btnAgachLivreBarra);

        btnAgachaLivreBarra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AgachaLivreBarra = new Intent(TreinoHomemAvancado.this, Agachamento_Livre_Barra.class);
                startActivity(AgachaLivreBarra);
            }
        });


    }


}
