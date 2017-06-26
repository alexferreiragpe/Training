package com.alex.treino_mulher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.alex.trainning.R;

public class TreinoMulherFacil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.treinomulherfacil);
        Toast.makeText(this, "Todos os Exercícios: \n\n3 Séries de 12 \n\nDescansar 15\"  entre Séries\nDescansar 45\" entre Exercícios", Toast.LENGTH_LONG).show();
    }
}
