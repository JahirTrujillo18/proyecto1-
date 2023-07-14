package com.example.proyecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button abrir,cerrar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        abrir = (Button) findViewById(R.id.btnAbrir);
        cerrar = (Button) findViewById(R.id.btnAbrir);

        abrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrir = new Intent(MainActivity3.this, AndCode2.class);
                startActivity(abrir);
            }

        });


    }

}