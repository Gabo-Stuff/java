import java.util.Scanner;

public class FizzBuzz {

    public static void fizzBuzz(int n) {
        for (int i=0;i==n;i+=1) {
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
        System.out.println(3%3==0);
        fizzBuzz(num1);
        myObj.close();
    }
}

