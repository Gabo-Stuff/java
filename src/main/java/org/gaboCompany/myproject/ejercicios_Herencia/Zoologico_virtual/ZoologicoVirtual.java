package org.gaboCompany.myproject.ejercicios_Herencia.Zoologico_virtual;

import java.util.ArrayList;
import java.util.List;
public class ZoologicoVirtual {
    public static void main(String args[]) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Perro(10, "Óscar"));
        animals.add(new Gato(10, "Òscar"));
        animals.add(new Pajaro(10, "Oscár"));

        animals.forEach(Animal::hacerSonido);
    }
}
