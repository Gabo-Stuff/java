package org.gaboCompany.myproject.ejercicios_dia_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class buscarPalabraEnUnaFrase14 {

    private static boolean buscarPalabraEnUnaFrase(String phrase, String regex) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(phrase);
        return matcher.find();
    }

    private static boolean assertEquals(boolean exp, boolean act) {
        System.out.println(exp+" = "+act);
        return exp == act;
    }

    private static void testReemplazarLetras() {
        if (assertEquals(buscarPalabraEnUnaFrase("Me gusta Java", "Java"), true)) {
            System.out.println("bieeen");
        } else System.err.println("Noo");

        if (assertEquals(buscarPalabraEnUnaFrase("Hola caracoLa", "l"), true)) {
            System.out.println("bieeen");
        } else System.err.println("Noo");
    }
    
    public static void main(String args[]) {
        testReemplazarLetras();
    }
}
