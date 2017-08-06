package com.alex.ferramentas;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.alex.trainning.R;

public class Calculo_IMC extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculo_imc);

        Button Calcular = (Button) findViewById(R.id.btnCadastrarPeso);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final EditText Altura = (EditText) findViewById(R.id.Atual);
                final EditText Peso = (EditText) findViewById(R.id.txt_Peso);

                String peso, altura;
                altura = Altura.getText().toString();
                peso = Peso.getText().toString();

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Calculo_IMC.this);

                if (altura.trim().isEmpty() || peso.trim().isEmpty()) {

                    Toast.makeText(getApplicationContext(), " Preencha os Campos ", Toast.LENGTH_SHORT).show();

                } else {

                    double alt = Double.parseDouble(Altura.getText().toString());
                    double pe = Double.parseDouble(Peso.getText().toString());

                    double result = (pe / (alt * alt));
                    alertDialog.setTitle("Resultado:");
                    if (result < 20) {
                        alertDialog.setMessage("IMC: " + String.format("%.2f", result) + " \n\nAbaixo do Peso! ");
                    } else if ((result >= 20) && (result < 25)) {
                        alertDialog.setMessage("IMC: " + String.format("%.2f", result) + " \n\nPeso Normal! ");
                    } else if ((result >= 25) && (result < 30)) {
                        alertDialog.setMessage("IMC: " + String.format("%.2f", result) + " \n\nAcima do Peso! ");
                    } else if ((result >= 30) && (result < 34)) {
                        alertDialog.setMessage("IMC: " + String.format("%.2f", result) + " \n\nObeso! ");
                    } else if ((result >= 34)) {
                        alertDialog.setMessage("IMC: " + String.format("%.2f", result) + " \n\nMuito Obeso! ");
                    }

                    alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Peso.setText("");
                            Altura.setText("");
                            dialog.dismiss();
                        }
                    });
                    alertDialog.setIcon(R.drawable.img_icone);
                    alertDialog.show();
                }


            }
        });


    }


}
