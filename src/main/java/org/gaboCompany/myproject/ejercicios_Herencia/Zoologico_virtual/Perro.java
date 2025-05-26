package org.gaboCompany.myproject.ejercicios_Herencia.Zoologico_virtual;

public class Perro extends Animal {

    public Perro(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public void hacerSonido(){
        System.out.println( "¡Guau guau!");
    }
}
