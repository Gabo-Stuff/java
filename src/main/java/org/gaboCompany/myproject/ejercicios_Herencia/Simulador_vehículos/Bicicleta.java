package org.gaboCompany.myproject.ejercicios_Herencia.Simulador_vehículos;

public class Bicicleta extends Vehiculo {
    public Bicicleta(int año, String marca) {
        super(año, marca);
    }

    @Override
    public void arrancar() {
        System.out.println("Bicicleta no necesita arrancar.");
    }

    @Override
    public void detener() {
        System.out.println("Bicicleta detenida.");
    }
}