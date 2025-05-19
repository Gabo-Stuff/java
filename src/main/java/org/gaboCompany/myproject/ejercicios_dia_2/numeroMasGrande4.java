package org.gaboCompany.myproject.ejercicios_dia_2;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class numeroMasGrande4 {
    private static Dictionary<Integer, Integer> numeroMasGrandeMeth(List<Integer> list) {
        Integer bigger = list.get(0);
        Integer idx = 0;
        Dictionary<Integer, Integer> maxAndIndex = new Hashtable<>();

        for (Integer i = 0; i < list.size(); i++) {
            if (list.get(i) > bigger) bigger = list.get(i);
            idx = i;
        }
        maxAndIndex.put(bigger, idx);
        return maxAndIndex;
    }

    private static boolean assertEquals(Dictionary<Integer, Integer> exp, Integer act) {
        return exp.keys().nextElement().equals(act);
    }

    private static void testNumeroMasGrandeMeth() {
        List<Integer> testList = new ArrayList<>();
        testList.add(4);
        testList.add(2);
        testList.add(7);
        testList.add(1);
        testList.add(3);

        System.out.println(numeroMasGrandeMeth(testList));
        if (assertEquals(numeroMasGrandeMeth(testList), 7)) {
            System.out.println("bieeen");
        } else System.err.println("Noo");

        testList.add(17);
        testList.add(16);
        
        System.out.println(numeroMasGrandeMeth(testList));
        if (assertEquals(numeroMasGrandeMeth(testList), 17)) {
            System.out.println("bieeen");
        } else System.err.println("Noo");
    }
    
    public static void main(String args[]) {
        testNumeroMasGrandeMeth();
    }
}
