package org.gaboCompany.myproject.ejercicios_Herencia.Zoologico_virtual;

public class Pajaro extends Animal {

    public Pajaro(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public void hacerSonido(){
        System.out.println( "¡Pío pío!");
    }
}
