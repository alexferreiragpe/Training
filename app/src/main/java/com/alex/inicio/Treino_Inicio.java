package com.alex.inicio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alex.trainning.R;
import com.alex.treino_homem.Treino_Homem_Menu;
import com.alex.treino_mulher.Treino_Mulher_Menu;

public class Treino_Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.treino_inicio);

        Button btn_TreinoHomem = (Button) findViewById(R.id.btn_Homem);
        btn_TreinoHomem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homem = new Intent(Treino_Inicio.this, Treino_Homem_Menu.class);
                startActivity(homem);
            }
        });

        Button btn_TreinoMulher = (Button) findViewById(R.id.btn_Mulher);
        btn_TreinoMulher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mulher = new Intent(Treino_Inicio.this, Treino_Mulher_Menu.class);
                startActivity(Mulher);
            }
        });
    }
}
