package org.gaboCompany.myproject.ejercicios_dia_2;

import java.util.ArrayList;
import java.util.List;

public class buscarPalabraEnUnaFrase14 {

    // verifica si un numero es primo
    private static boolean esPrimo(int i) {
        for (int j = 2; j < i; j++) {
            if (i%j==0) {
                return false;
            }
        }
        return true;
    }
    //numerosPrimosRango itera entre el rango (de num1 a num2) de i en i,  e itera entre 2 e i.
    private static List<Integer> numerosPrimosRango(int num1, int num2) {
        List<Integer> res = new ArrayList<>();
        for (int i = num1; i <= num2; i++) {
            if (esPrimo(i)) res.add(i);
        }
        return res;
    }

    private static boolean assertEquals(List<Integer> exp, List<Integer> act) {
        System.out.println(exp+" = "+act);
        return exp.equals(act);
    }

    private static void testReemplazarLetras() {
        List<Integer> test1 = new ArrayList<>();
        test1.add(11);
        test1.add(13);
        test1.add(17);
        test1.add(19);
        if (assertEquals(numerosPrimosRango(10, 20), test1)) {
            System.out.println("bieeen");
        } else System.err.println("Noo");

        List<Integer> test2 = new ArrayList<>();
        test2.add(2);
        test2.add(3);
        test2.add(5);
        test2.add(7);
        test2.add(11);
        test2.add(13);
        test2.add(17);
        test2.add(19);
        if (assertEquals(numerosPrimosRango(2, 20), test2)) {
            System.out.println("bieeen");
        } else System.err.println("Noo");
    }
    
    public static void main(String args[]) {
        testReemplazarLetras();
    }
}
