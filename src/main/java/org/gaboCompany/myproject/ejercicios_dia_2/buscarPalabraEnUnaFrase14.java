package org.gaboCompany.myproject.ejercicios_dia_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class buscarPalabraEnUnaFrase14 {

    private static boolean buscarPalabraEnUnaFrase(String phrase, String regex) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(phrase);
        boolean found = matcher.find();
        System.out.printf("Found '%s' in position %d",regex, matcher.start());
        System.out.println();
        return found;
    }

    private static boolean assertEquals(boolean exp, boolean act) {
        System.out.println(exp+" = "+act);
        return exp == act;
    }

    private static void testBuscarPalabraEnUnaFrase() {
        if (assertEquals(buscarPalabraEnUnaFrase("Me gusta Java", "Java"), true)) {
            System.out.println("bieeen");
        } else System.err.println("Noo");

        System.out.println();
        if (assertEquals(buscarPalabraEnUnaFrase("Hola caracoLa", "l"), true)) {
            System.out.println("bieeen");
        } else System.err.println("Noo");
    }
    
    public static void main(String args[]) {
        testBuscarPalabraEnUnaFrase();
    }
}
