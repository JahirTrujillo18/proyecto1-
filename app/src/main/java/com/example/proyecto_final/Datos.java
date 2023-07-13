package com.example.proyecto_final;
import java.io.Serializable;


public class Datos implements Serializable {

    private String nombre,lugar, edad;


    Datos(String nombre,String lugar,String edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.lugar = lugar;
    }


    String getNombre() {
        return nombre;
    }

    String getLugar() {
        return lugar;
    }

    String getEdad() {
        return edad;
    }
}