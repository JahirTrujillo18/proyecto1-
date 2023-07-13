package com.example.proyecto_final;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AndCode2 extends AppCompatActivity {


    List<Datos> listaDatos = new ArrayList<>();

    List<String> listaNombres = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_and_code2);
    }


    public void GuardaEnLista(View v) {

        EditText txtNombre = findViewById(R.id.nombreCurso);
        EditText txtDias = findViewById(R.id.dias);
        EditText txtHoras = findViewById(R.id.hora);
        Spinner lstNombres = findViewById(R.id.lstNombres);


        listaDatos.add(new Datos(txtNombre.getText().toString(),
                txtDias.getText().toString(),
                txtHoras.getText().toString()));


        Toast.makeText(this,"Agregado a la lista",Toast.LENGTH_SHORT).show();


        listaNombres.add(txtNombre.getText().toString());
        ArrayAdapter<String> llenaSpinner = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,listaNombres);
        llenaSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lstNombres.setAdapter(llenaSpinner);


        txtNombre.setText("");
        txtDias.setText("");
        txtHoras.setText("");
    }



    public void MuestraDatos(View v) {

        Spinner lstNombres = findViewById(R.id.lstNombres);


        AlertDialog.Builder constructor = new AlertDialog.Builder(this);
        constructor.setTitle("Horario");
        constructor.setPositiveButton("Aceptar",null);


        long index = lstNombres.getSelectedItemId();
        if (index > -1) {

            constructor.setMessage("Curso: " + listaDatos.get((int) index).getNombre()
                    + " - Dias: " + listaDatos.get((int) index).getLugar()
                    + " - Horas: " + listaDatos.get((int) index).getEdad());
        } else {
            constructor.setMessage("Debe seleccionar un nombre de la lista");
        }

        AlertDialog ventanaMensaje = constructor.create();
        ventanaMensaje.show();
    }
}