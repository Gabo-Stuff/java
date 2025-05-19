package org.gaboCompany.myproject.ejercicios_dia_2;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class analisisDeTexto16 {

    private static boolean palindromos(String word) {
        String pali = "";
        word = StringUtils.stripAccents(word).toLowerCase().replaceAll(" ", "").replaceAll("\\p{Punct}", "");
        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            pali = x + pali;
        }
        return pali.equals(word);
    }

    private static List<Dictionary<String, String>> analisisDeTexto(String phrase) {
        List<Dictionary<String, String>> res = new ArrayList<>();
    
        Dictionary<String, String> numeroCaracteres = new Hashtable<>();
        numeroCaracteres.put("Caracteres: ", String.valueOf(phrase.split("").length));
        res.add(numeroCaracteres);

        Dictionary<String, String> cantidadPalabras = new Hashtable<>();
        cantidadPalabras.put("Palabras: ", String.valueOf(phrase.split(" ").length));
        res.add(cantidadPalabras);

        Dictionary<String, String> palabraMasLarga = new Hashtable<>();
        String largerWord = "";
        for (String word: phrase.split(" ")) {
            if (word.length() > largerWord.length()) largerWord = word;
        }
        palabraMasLarga.put("Palabra mas larga: ", largerWord);
        res.add(palabraMasLarga);

        Dictionary<String, String> cantidadVocales = new Hashtable<>();
        Pattern pattern = Pattern.compile("([aeiou]+)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(phrase);
        cantidadVocales.put("Vocales: ", String.valueOf(matcher.results().count()));
        res.add(cantidadVocales);

        Dictionary<String, String> palindromo = new Hashtable<>();
        palindromo.put("Palíndromo?: ", String.valueOf(palindromos(phrase)));
        res.add(palindromo);
        
        return res;
    }

    private static boolean assertEquals(List<Dictionary<String, String>> exp, List<Dictionary<String, String>> act) {
        System.out.println(exp+"\n==\n"+act);
        return exp.equals(act);
    }

    private static void testAnalisisDeTexto() {
        List<Dictionary<String, String>> test1 = new ArrayList<>();
        
        Dictionary<String, String> numeroCaracteres = new Hashtable<>();
        numeroCaracteres.put("Caracteres: ", "18");
        test1.add(numeroCaracteres);

        Dictionary<String, String> cantidadPalabras = new Hashtable<>();
        cantidadPalabras.put("Palabras: ", "4");
        test1.add(cantidadPalabras);

        Dictionary<String, String> palabraMasLarga = new Hashtable<>();
        palabraMasLarga.put("Palabra mas larga: ", "Anita");
        test1.add(palabraMasLarga);

        Dictionary<String, String> cantidadVocales = new Hashtable<>();
        cantidadVocales.put("Vocales: ", "8");
        test1.add(cantidadVocales);

        Dictionary<String, String> palindromo = new Hashtable<>();
        palindromo.put("Palíndromo?: ", "true");
        test1.add(palindromo);

        if (assertEquals(analisisDeTexto("Anita lava la tina"), test1)) {
            System.out.println("bieeen");
        } else System.err.println("Noo");
    }
    
    public static void main(String args[]) {
        testAnalisisDeTexto();
    }
}
