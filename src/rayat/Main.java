package rayat;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MyCalculator myCalculator =new MyCalculator();

        System.out.print("Enter the number : ");
        int a = input.nextInt();
        int sum = myCalculator.divisorSum(a);
        System.out.println("The sum of divisors of the number " + a + " is: " + sum + "\n");

        System.out.print("Enter the number for factorial : ");
        int b = input.nextInt();
        BigInteger factorial = myCalculator.findFactorial(b);
        System.out.println("The factorial of the number " + b + " is: " + factorial);
    }

    /*
    Name: Abu Shalehin MD.Rayat
    ID: 2012020162
    Section: D
    Email: cse_2012020162@lus.ac.bd
    Date: 15-10-2021

    */

}
