package com.alex.treino_homem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alex.exercicios.Agachamento_Livre_Barra;
import com.alex.trainning.R;

public class TreinoHomemAvancado extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.treinohomemavancado);
        Toast.makeText(this, "Todos os Exercícios: \n\n3 Séries de 10 \n\nDescansar 15\"  entre Séries\nDescansar 15\" entre Exercícios", Toast.LENGTH_LONG).show();
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