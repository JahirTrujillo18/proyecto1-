package com.example.proyecto_final;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button botonlogin;
    EditText user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usuario_main);

        user=findViewById(R.id.usuario);
        pass=findViewById(R.id.contraseña);
        botonlogin=findViewById(R.id.boton);

        botonlogin=(Button)findViewById(R.id.boton);

        botonlogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (user.getText().toString().equals("jahir@") && pass.getText().toString().equals("73948158")) {

                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);

                    startActivity(intent);

                    //Toast.makeText(MainActivity.this, "Is OK", Toast.LENGTH_LONG).show();

                }
                else {
                    Toast.makeText(MainActivity.this, "Usuario incorrecto", Toast.LENGTH_LONG).show();
                }
            }

        });



    }}
