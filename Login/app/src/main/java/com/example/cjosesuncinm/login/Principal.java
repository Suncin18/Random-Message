package com.example.cjosesuncinm.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by CJosesuncinM on 04/04/2016.
 */
public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.principal);
        Button Boton = (Button)findViewById(R.id.button2);
        Boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sirve = new Intent(Principal.this,lesly.class);
                startActivity(sirve);
            }
        });
    }
}
