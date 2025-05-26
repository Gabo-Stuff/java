package org.gaboCompany.myproject.ejercicios_Herencia;

public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void hacerSonido(){};
}
