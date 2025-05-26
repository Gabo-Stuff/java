package org.gaboCompany.myproject.ejercicios_Herencia.Simulador_vehículos;

public class Coche extends Vehiculo {
    public Coche(int año, String marca) {
        super(año, marca);
    }

    @Override
    public void arrancar() {
        System.out.println("Coche arrancando...");
    }

    @Override
    public void detener() {
        System.out.println("Coche deteniendo...");
    }
}