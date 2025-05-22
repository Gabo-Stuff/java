package org.gaboCompany.myproject.ejercicios_POO;

public class GestorCotactosImpl {
    
    public static void main(String args[]) {
        GestorCotactos gesting = new GestorCotactos("hola",3,"caracola@tuenti.es");
        System.out.println(gesting.toString());
        System.out.println();

        GestorCotactos gesting2 = new GestorCotactos("jonnhy",4,"melavo@tuenti.es");
        System.out.println(gesting2.toString());
        System.out.println();

    }
}
