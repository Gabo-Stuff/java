package org.gaboCompany.myproject.ejercicios_Herencia;

import java.util.ArrayList;
import java.util.List;

public class BebidaImpl {
    public static void main(String args[]) {
        List<Bebida> bebidas = new ArrayList<>();
        bebidas.add(new Refresco("DrPepper", "grande", true));
        bebidas.add(new Zumo("Mojito", "grande", "Guayaba"));
        bebidas.add(new Agua("Ribes", "grande", true));

        bebidas.forEach(Bebida::getDescripcion);
    }
}
