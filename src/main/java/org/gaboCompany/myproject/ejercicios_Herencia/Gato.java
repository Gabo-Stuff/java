package org.gaboCompany.myproject.ejercicios_Herencia;

public class Gato extends Animal {

    public Gato(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public void hacerSonido(){
        System.out.println( "¡Miau!");
    }
}
