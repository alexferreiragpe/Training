package com.alex.ferramentas;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.alex.trainning.R;

public class TabelaPeso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabelapeso);

        final SQLiteDatabase db;
        CursorAdapter dataSource;
        db = openOrCreateDatabase("DbTraining", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS tb_Peso(_id INTEGER PRIMARY KEY AUTOINCREMENT, Peso TEXT, Data TEXT)");
        final String campos[] = {"_id", "Data", "Peso"};

        Cursor c = db.query("tb_Peso", campos, null, null, null, null, "_id" + " DESC");

        ListView listou = (ListView) findViewById(R.id.listagem);
        if (c != null && c.getCount() > 0) {
            if (c.moveToFirst()) {
                dataSource = new SimpleCursorAdapter(this, R.layout.tabelapesolayout, c, campos, new int[]{R.id.txtId, R.id.txtData, R.id.txtPeso});
                listou.setAdapter(dataSource);

            }

        } else {

            final AlertDialog.Builder alertDialog = new AlertDialog.Builder(TabelaPeso.this);
            alertDialog.setTitle("Training");
            alertDialog.setMessage("Registro de Peso Vazio! ");
            alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent Main = new Intent(getApplicationContext(), CadastroPeso.class);
                    startActivity(Main);
                    dialog.dismiss();

                }
            });
            alertDialog.setIcon(R.drawable.icone);
            alertDialog.show();

        }
    }
}
