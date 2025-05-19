package org.gaboCompany.myproject.ejercicios_dia_2;

public class factorial1 {
    private static int res;

    private static int factorial(int calc, int num) {
        calc*= num;
        if (num != 1) factorial(calc, num - 1); else res = calc;
        return res;
    }

    private static boolean assertEquals(int exp, int act) {
        System.out.println(exp+" = "+act);
        return exp == act;
    }

    private static void testFactorial() {
        if (assertEquals(factorial(1, 5), 120)) {
            System.out.println("bieeen");
        } else System.err.println("Noo");

        if (assertEquals(factorial(1, 10), 3628800)) {
            System.out.println("bieeen");
        } else System.err.println("Noo");
    }
    
    public static void main(String args[]) {
        testFactorial();
    }
}
