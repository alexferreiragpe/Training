package com.alex.treino_homem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alex.trainning.R;

public class Treino_Homem_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.treino_homem_menu);

        Button btnHomemFacil = (Button) findViewById(R.id.btnFacilHomem);
        Button btnHomemMedio = (Button) findViewById(R.id.btnMedioHomem);
        Button btnHomemAvancado = (Button) findViewById(R.id.btnAvancadoHomem);

        btnHomemFacil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MulherMedio = new Intent(Treino_Homem_Menu.this, TreinoHomemFacil.class);
                startActivity(MulherMedio);
            }
        });

        btnHomemMedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomemMedio = new Intent(Treino_Homem_Menu.this, TreinoHomemMedio.class);
                startActivity(HomemMedio);
            }
        });

        btnHomemAvancado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomemAvancado = new Intent(Treino_Homem_Menu.this, TreinoHomemAvancado.class);
                startActivity(HomemAvancado);
            }
        });


    }
}
