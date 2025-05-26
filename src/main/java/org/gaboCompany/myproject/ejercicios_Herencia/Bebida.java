package org.gaboCompany.myproject.ejercicios_Herencia;

public class Bebida {
    protected String nombre;
    protected String tamaño;

    public Bebida(String nombre, String tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void getDescripcion() {};
}
