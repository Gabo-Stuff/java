package org.gaboCompany.myproject;

import java.util.Scanner;

public class SumaDosNumeros {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Añade un número:");
        int num1 = myObj.nextInt();
        System.out.println("Añade otro número:");
        int num2 = myObj.nextInt();
        myObj.close();

        System.out.print("Su suma: ");
        System.out.println(num1 + num2);

    }
}
