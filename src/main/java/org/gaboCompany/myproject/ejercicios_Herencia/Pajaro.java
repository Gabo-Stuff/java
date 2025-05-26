package org.gaboCompany.myproject.ejercicios_Herencia;

public class Pajaro extends Animal {

    public Pajaro(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public void hacerSonido(){
        System.out.println( "¡Pío pío!");
    }
}
