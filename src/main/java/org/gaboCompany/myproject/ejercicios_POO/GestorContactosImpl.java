package org.gaboCompany.myproject.ejercicios_POO;

import java.util.ArrayList;

public class GestorContactosImpl {
    
    public static void main(String args[]) {
        GestorContactos gesting = new GestorContactos("skibidi@yahoo.mx",666333999,"Carol Danvers");
        Agenda agenda = new Agenda(new ArrayList<>());
        agenda.addContacto(gesting);
        GestorContactos gesting2 = new GestorContactos("skibidi@yahoo.mx",666333999,"Carol Danvers");
        agenda.addContacto(gesting2);
        System.out.println();
        System.out.println("Resultado de la búsqueda por nombre 'Carol Danvers':");
        agenda.findByNombre("Carol Danvers");
        System.out.println("Resumen general:");
        System.out.println(agenda.toString());
    }
}
