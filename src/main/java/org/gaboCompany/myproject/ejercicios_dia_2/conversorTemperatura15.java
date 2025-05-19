package org.gaboCompany.myproject.ejercicios_dia_2;

import java.util.Dictionary;
import java.util.Hashtable;

public class conversorTemperatura15 {

    private static Dictionary<Double, Double> conversorTemperatura(Double num) {
        Double f = num * 1.8 + 32;
        Double k = num + 273.15;
        Dictionary<Double, Double> res = new Hashtable<>();
        res.put(f,k);

        System.out.printf("Fahrenheit: %sºF. Kelvin: %sºK", f, k);
        System.out.println();
        return res;
    }

    private static boolean assertEquals(Dictionary<Double, Double> exp, Dictionary<Double, Double> act) {
        System.out.println(exp+" = "+act);
        return exp.equals(act);
    }

    private static void testFactorial() {
        Dictionary<Double, Double> test1 = new Hashtable<>();
        test1.put(41.0,278.15);
        if (assertEquals(conversorTemperatura(5.0), test1)) {
            System.out.println("bieeen");
        } else System.err.println("Noo");
        
        Dictionary<Double, Double> test2 = new Hashtable<>();
        test2.put(50.0,283.15);
        if (assertEquals(conversorTemperatura(10.0), test2)) {
            System.out.println("bieeen");
        } else System.err.println("Noo");
    }
    
    public static void main(String args[]) {
        testFactorial();
    }
}
