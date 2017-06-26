package com.alex.treino_mulher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alex.trainning.R;

public class Treino_Mulher_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.treino_mulher_menu);

        Button btnMulherFacil = (Button) findViewById(R.id.btnFacilMulher);
        Button btnMulherMedio = (Button) findViewById(R.id.btnMedioMulher);
        Button btnMulherAvancado = (Button) findViewById(R.id.btnAvancadoMulher);

        btnMulherFacil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MulherFacil = new Intent(Treino_Mulher_Menu.this, TreinoMulherFacil.class);
                startActivity(MulherFacil);
            }
        });
        btnMulherMedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MulherMedio = new Intent(Treino_Mulher_Menu.this, TreinoMulherMedio.class);
                startActivity(MulherMedio);
            }
        });

        btnMulherAvancado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MulherAvanca = new Intent(Treino_Mulher_Menu.this, TreinoMulherAvancado.class);
                startActivity(MulherAvanca);
            }
        });
    }
}
