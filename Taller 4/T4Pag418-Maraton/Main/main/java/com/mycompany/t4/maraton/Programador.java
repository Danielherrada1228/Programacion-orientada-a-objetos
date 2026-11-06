package com.mycompany.t4.maraton;

public class Programador {
    private String nombre;
    private String apellidos;

    public Programador(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos;
    }
}
