package org.gaboCompany.myproject.ejercicios_dia_2;

public class factorial1 {

    private static int factorial(int num) {
        if (num == 1) return 1;
        return num * factorial(num - 1);
    }

    private static boolean assertEquals(int exp, int act) {
        System.out.println(exp+" = "+act);
        return exp == act;
    }

    private static void testFactorial() {
        if (assertEquals(factorial(5), 120)) {
            System.out.println("bieeen");
        } else System.err.println("Noo");

        if (assertEquals(factorial(10), 3628800)) {
            System.out.println("bieeen");
        } else System.err.println("Noo");
    }
    
    public static void main(String args[]) {
        testFactorial();
    }
}
