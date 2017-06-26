package com.alex.inicio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.alex.trainning.R;

import java.util.ArrayList;
import java.util.List;

public class Sobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sobre);

        List<String> opcoes;
        ArrayAdapter<String> adaptador;
        ListView lvOpcoes;

        lvOpcoes = (ListView) findViewById(R.id.Lista);

        opcoes = new ArrayList<>();

        opcoes.add(" Alex Ferreira - Desenvolvedor Android ");
        opcoes.add(" App para Professores e Alunos de Academias ");
        opcoes.add(" Em desenvolvimento... ");
        opcoes.add(" Acessar o Site ");
        opcoes.add(" Ligar ");
        opcoes.add(" E-mail ");


        adaptador = new ArrayAdapter<>(Sobre.this, android.R.layout.simple_list_item_1, opcoes);
        lvOpcoes.setAdapter(adaptador);
        lvOpcoes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 3:
                        navegarInternet();
                        break;
                    case 4:
                        fazerLigacao();
                        break;
                    case 5:
                        enviarEmail();
                        break;

                }
            }
        });
    }

    private void fazerLigacao() {
        Uri uri = Uri.parse("tel:019988030727");
        Intent itNavegar = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(itNavegar);
    }

    private void enviarEmail() {

        String email = "alexferreira@hotmail.com.br";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email));
        startActivity(emailIntent);
    }

    private void navegarInternet() {
        Uri uri = Uri.parse("http://alexferreira.wixsite.com/alex");
        Intent itNavegar = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(itNavegar);
    }
}
