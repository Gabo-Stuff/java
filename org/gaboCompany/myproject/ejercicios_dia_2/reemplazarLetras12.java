package org.gaboCompany.myproject.ejercicios_dia_2;

public class reemplazarLetras12 {

    private static String reemplazarLetras(String phrase) {
        return phrase.replaceAll("a", "@");
    }

    private static boolean assertEquals(String exp, String act) {
        System.out.println(exp+" = "+act);
        return exp.equals(act);
    }

    private static void testReemplazarLetras() {
        if (assertEquals(reemplazarLetras("Hola mundo desde Java"), "Hol@ mundo desde J@v@")) {
            System.out.println("bieeen");
        } else System.err.println("Noo");

        if (assertEquals(reemplazarLetras("a e i e x"), "@ e i e x")) {
            System.out.println("bieeen");
        } else System.err.println("Noo");
    }
    
    public static void main(String args[]) {
        testReemplazarLetras();
    }
}
