package com.example.cjosesuncinm.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button CerrarApp = (Button)findViewById(R.id.button5);
        Button Boton = (Button)findViewById(R.id.button);
        Boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = ((EditText)findViewById(R.id.editText)).getText().toString();
                String contraseña = ((EditText)findViewById(R.id.editText2)).getText().toString();
                if (usuario.equals("User") && contraseña.equals("1234"))
                {
                    Intent GoToPrincipal = new Intent(LoginActivity.this,Principal.class);
                    startActivity(GoToPrincipal);
                }else{
                    Toast.makeText(getApplicationContext(),"Usuario y/o contraseña incorrectos",Toast.LENGTH_SHORT).show();
                    contraseña = "";
                }
            }
        });
        CerrarApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
}
