import java.util.Scanner;

public class FizzBuzz {

    public static void fizzBuzz(int n) {
        System.out.print(n);
        for (int i=0;i==n;i++) {
            System.out.print("Fizz 2");
            if(n%3==0) {
                System.out.print("Fizz ");
            } else if(n%5==0) {
                System.out.print("Buzz ");
            }  else if (n%3==0 && n%5==0) {
                System.out.print("FizzBuzz ");
            } else System.out.print(n + " ");
        }
    }

    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Añade un número; a ver ese FizzBuzz:");
        int num1 = myObj.nextInt();
        myObj.close();
        
        fizzBuzz(num1);
    }
}

