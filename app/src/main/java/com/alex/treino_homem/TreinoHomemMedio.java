package com.alex.treino_homem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.alex.trainning.R;

public class TreinoHomemMedio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.treinohomemmedio);

        Toast.makeText(this, "Todos os Exercícios: \n\n3 Séries de 10 \n\nDescansar 15\"  entre Séries\nDescansar 30\" entre Exercícios", Toast.LENGTH_LONG).show();
    }
}
