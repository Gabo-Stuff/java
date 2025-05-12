import java.util.Scanner;

public class EsPrimoOno {

    static boolean callPrimos(int n) {
        if (n%2==0) return false;
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Añade un número, a ver si es primo:");
        int num1 = myObj.nextInt();
        myObj.close();

        if (callPrimos(num1)) {
            System.out.print("si es");
        } else {
            System.out.print("no es");
        }
    }
}

