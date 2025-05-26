package org.gaboCompany.myproject.ejercicios_Herencia.Simulador_vehículos;

import java.util.ArrayList;
import java.util.List;

public class VehiculoImpl {
    public static void main(String args[]) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Coche(2010, "Brum brum"));
        vehiculos.add(new Moto(2010, "Negra"));
        vehiculos.add(new Bicicleta(2010, ""));

        vehiculos.forEach(Vehiculo::arrancar);
        System.out.println("");
        vehiculos.forEach(Vehiculo::detener);
    }
}
