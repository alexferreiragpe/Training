package com.alex.ferramentas;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.alex.trainning.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CadastroPeso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastropeso);

        final Button BtCadastra = (Button) findViewById(R.id.AlexCadastrar);
        final Button BtConsulta = (Button) findViewById(R.id.btnConsultaPeso);
        final EditText Peso = (EditText) findViewById(R.id.Atual);


        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        Date data = new Date();

        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        Date data_atual = cal.getTime();

        final String data_completa = dateFormat.format(data_atual);


        BtCadastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (Peso.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), " Insira seu Peso ", Toast.LENGTH_SHORT).show();
                } else {
                    final SQLiteDatabase db;
                    db = openOrCreateDatabase("DbTraining", SQLiteDatabase.CREATE_IF_NECESSARY, null);
                    db.setVersion(1);
                    db.setLocale(Locale.getDefault());
                    db.setLockingEnabled(true);

                    db.execSQL("CREATE TABLE IF NOT EXISTS tb_Peso(_id INTEGER PRIMARY KEY AUTOINCREMENT, Peso TEXT, Data TEXT)");
                    db.execSQL("INSERT INTO tb_Peso(Peso,Data) VALUES('" + Peso.getText() + "', '" + data_completa + "')");


                    Toast.makeText(getApplicationContext(), "Peso Cadastrado com Sucesso!", Toast.LENGTH_SHORT).show();
                    Peso.setText("");
                }

            }
        });

        BtConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ConsultaPeso = new Intent(CadastroPeso.this, TabelaPeso.class);
                startActivity(ConsultaPeso);
            }
        });
    }
}
