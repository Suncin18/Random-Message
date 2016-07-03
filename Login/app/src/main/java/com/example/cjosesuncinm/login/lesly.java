package com.example.cjosesuncinm.login;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.MessageFormat;
import java.util.Random;

/**
 * Created by CJosesuncinM on 07/04/2016.
 */
public class lesly extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.lesly);
        Button Salir = (Button)findViewById(R.id.button4);
        Salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Salir = new Intent(Intent.ACTION_MAIN);
                startActivity(Salir);
            }
        });
    }

    public void CrearMensaje(View view) {
        String[] razon = new String[]{"Today is a good day!","You should reed a book","Write your goals", "Helps someone",
                                      "Be kind!", "You can change the future", "Planting a tree", "Do exercise!",
                                      "All is possible!", "What is impossible?", "You can become a profesional!", "Your dream is completely possible!",
                                      "Thnaks for using this app", "You have a big heart!", "You have a small body, but a big heart", "Women talk too much",
                                      "All women are beautiful", "Do you have children?","Why did I say that?","I hope to get a job!"};
        Random Aleatorio = new Random();
        int Array = Aleatorio.nextInt(20);
        AlertDialog.Builder Mensaje = new AlertDialog.Builder(this);
        Mensaje.setMessage(razon[Array])
                .setPositiveButton("Volver al Generador", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setTitle("Piensa en: ")
                .create();
        Mensaje.show();

    }
}
