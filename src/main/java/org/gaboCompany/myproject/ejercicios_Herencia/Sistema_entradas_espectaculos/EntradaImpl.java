package org.gaboCompany.myproject.ejercicios_Herencia.Sistema_entradas_espectaculos;

import java.util.ArrayList;
import java.util.List;

public class EntradaImpl {
    public static void main(String[] args) {
        EntradaEstandar entrada1 = new EntradaEstandar("Melendi (época con porro)", 35.0);
        EntradaEstandar entrada2 = new EntradaEstandar("Melendi (época sin porro)", -5.0);
        EntradaVIP entradaVIP1 = new EntradaVIP(1.0, "Juan Magan", -8.0);
        EntradaVIP entradaVIP2 = new EntradaVIP(-1.0, "Juan Magan x Melendi: The Experience", 800.0);
        EntradaConDescuento entradaDesc1 = new EntradaConDescuento(0.3, "El Rubius Docs", 800.0);
        EntradaConDescuento entradaDesc2 = new EntradaConDescuento(0.3, "La Vaneh x Ted The Bear", 8000000.0);

        List<Entrada> entradas = new ArrayList<>();
        entradas.add(entrada1);
        entradas.add(entrada2);
        entradas.add(entradaVIP1);
        entradas.add(entradaVIP2);
        entradas.add(entradaDesc1);
        entradas.add(entradaDesc2);

        entradas.forEach(e -> System.out.println(e.resumen()));
    }
}
