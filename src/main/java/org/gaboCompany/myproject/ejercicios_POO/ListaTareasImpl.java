package org.gaboCompany.myproject.ejercicios_POO;

import java.util.ArrayList;
import java.util.List;

public class ListaTareasImpl {
    
    public static void main(String args[]) {
        List<ListaTareas> listaTareas = new ArrayList<>();

        ListaTareas gesting = new ListaTareas("hacer","pendiente","croquetas");
        System.out.println(gesting.toString());
        gesting.setEstado("taco");
        listaTareas.add(gesting);
        System.out.println("\n");

        ListaTareas gesting2 = new ListaTareas("gamba","completada","taco");
        System.out.println(gesting2.toString());
        gesting2.setEstado("gamba");
        listaTareas.add(gesting2);
        System.out.println("\n");

        System.out.println("Lista tareas: ");
        System.out.println(listaTareas);
        System.out.println(" ");
        
        int count = 0;
        System.out.println("Número tareas completadas: ");
        for (ListaTareas lista : listaTareas) {
            if (lista.getEstado().equals("completada")) count++;
        }
        System.out.println(count);

        System.out.println(" ");
        System.out.println("Lista tareas pendientes: ");
        for (ListaTareas lista : listaTareas) {
            if (lista.getEstado().equals("pendiente")) System.out.println(lista);
        }
    }
}
