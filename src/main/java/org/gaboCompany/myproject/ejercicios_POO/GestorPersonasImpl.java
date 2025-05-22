package org.gaboCompany.myproject.ejercicios_POO;

public class GestorPersonasImpl {
    
    public static void main(String args[]) {
        GestorPersonas gesting = new GestorPersonas("hola",3,"caracola@tuenti.es");
        System.out.println(gesting.toString());
        System.out.println(gesting.esMayorDeEdad());
        System.out.println();

        GestorPersonas gesting2 = new GestorPersonas("jonnhy",4,"melavo@tuenti.es");
        System.out.println(gesting2.toString());
        System.out.println(gesting.esMayorDeEdad());
        System.out.println();

        gesting2.setCorreo("smith@educat.net");
        System.out.println(gesting2.toString());
    }
}
