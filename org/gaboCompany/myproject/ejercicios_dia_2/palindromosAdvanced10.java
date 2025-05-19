package org.gaboCompany.myproject.ejercicios_dia_2;

import org.apache.commons.lang3.StringUtils;

public class palindromosAdvanced10 {

    private static String palindromos(String word) {
        String pali = "";
        word = StringUtils.stripAccents(word).toLowerCase().replaceAll(" ", "").replaceAll("\\p{Punct}", "");
        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            pali = x + pali;
        }
        return pali;
    }

    private static boolean assertEquals(String exp, String act) {
        System.out.println(exp+" = "+act);
        return exp.equals(act);
    }

    private static void testPalindromos() {
        if (assertEquals(palindromos("rapÁr!?.;."), "rapar")) {
            System.out.println("bieeen");
        } else System.err.println("Noo");
        
        if (assertEquals(palindromos("pÂn!.,;"), "pan")) {
            System.out.println("bieeen");
        } else System.err.println("Noo");

        if (assertEquals(palindromos("La ruta natural!??.;"), "larutanatural")) {
            System.out.println("bieeen");
        } else System.err.println("Noo");
    }
    
    
    public static void main(String args[]) {
        testPalindromos();
    }
}
