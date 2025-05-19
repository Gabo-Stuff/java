package org.gaboCompany.myproject;

import java.util.Dictionary;
import java.util.Hashtable;

public class contarPalabras11 {

    private static Dictionary<Integer, Integer> contarPalabrasMeth(String phrase) {
        int startWithVowel = 0;
        Dictionary<Integer, Integer> countAndVowels = new Hashtable<>();
        String[] words = phrase.split(" ");
        for (String word: words) {
            if (String.valueOf(word.charAt(0)).matches("^(?i)[aeiou].*")) startWithVowel++;
        }
        countAndVowels.put(words.length, startWithVowel);
        return countAndVowels;
    }

    private static boolean assertEquals(Dictionary<Integer, Integer> exp, Dictionary<Integer, Integer> act) {
        System.out.println(exp+" = "+act);
        return exp.equals(act);
    }

    private static void testContarPalabras() {
        Dictionary<Integer, Integer> test1 = new Hashtable<>();
        test1.put(4,0);
        if (assertEquals(contarPalabrasMeth("Hola mundo desde Java"), test1)) {
            System.out.println("bieeen");
        } else System.err.println("Noo");

        Dictionary<Integer, Integer> test2 = new Hashtable<>();
        test2.put(5,4);
        if (assertEquals(contarPalabrasMeth("a e i e x"), test2)) {
            System.out.println("bieeen");
        } else System.err.println("Noo");
    }
    
    public static void main(String args[]) {
        testContarPalabras();
    }
}
