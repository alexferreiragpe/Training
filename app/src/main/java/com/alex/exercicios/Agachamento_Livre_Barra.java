package com.alex.exercicios;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alex.inicio.GifImageView;
import com.alex.trainning.R;

public class Agachamento_Livre_Barra extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exe_agacha_livre_barra);

        GifImageView gifImageView = (GifImageView) findViewById(R.id.GifImageView);
        gifImageView.setGifImageResource(R.drawable.agachamentolivrecbarra);


    }
}
