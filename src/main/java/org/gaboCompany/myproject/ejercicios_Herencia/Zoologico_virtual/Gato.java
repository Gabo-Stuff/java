package org.gaboCompany.myproject.ejercicios_Herencia.Zoologico_virtual;

public class Gato extends Animal {

    public Gato(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public void hacerSonido(){
        System.out.println( "¡Miau!");
    }
}
