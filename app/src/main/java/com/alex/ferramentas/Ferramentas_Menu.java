package com.alex.ferramentas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alex.trainning.R;

public class Ferramentas_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ferramentas_menu);
        Button btnCalcula_IMC = (Button) findViewById(R.id.btn_CalculoIMC);
        btnCalcula_IMC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent IMC = new Intent(Ferramentas_Menu.this, Calculo_IMC.class);
                startActivity(IMC);
            }
        });

        Button btnTabelaPeso = (Button) findViewById(R.id.btn_Tabela_Peso);
        btnTabelaPeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TbPeso = new Intent(Ferramentas_Menu.this, CadastroPeso.class);
                startActivity(TbPeso);
            }
        });


    }


}
