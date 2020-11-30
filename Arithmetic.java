// (Arithmetic) Write an application that asks the user to enter two integers, obtains them from the user and prints their sum, product, difference and quotient (division).

import java.util.Scanner;

public class Arithmetic {




    
    public static void main (String [] args) {

    int firstNumber;
    int secondNumber;
    int sum;
    int product;
    int division;

    Scanner collectNumber = new Scanner(System.in);

    System.out.print("Enter first number: ");    
    firstNumber = collectNumber.nextInt();

    System.out.print("Enter second number: ");    
    secondNumber = collectNumber.nextInt();
    
    
   sum = firstNumber + secondNumber;

   product = firstNumber * secondNumber;

   division = firstNumber / secondNumber;

    System.out.println("Sum = " + sum );

    System.out.println("Product = " + product );
    
    System.out.println("Division = "  + division);

    
    }



}
