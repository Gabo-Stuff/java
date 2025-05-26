package org.gaboCompany.myproject.ejercicios_Herencia.Simulador_vehículos;

public class Moto extends Vehiculo {
    public Moto(int año, String marca) {
        super(año, marca);
    }

    @Override
    public void arrancar() {
        System.out.println("Moto lista para rodar.");
    }

    @Override
    public void detener() {
        System.out.println("Moto detenida.");
    }
}