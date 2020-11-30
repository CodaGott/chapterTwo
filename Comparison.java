import java.util.Scanner;


public class Comparison {

    public static void main (String [] args) {

    int num1;
    int num2;
    int temp;

    Scanner getNum = new Scanner(System.in);


    System.out.print("Enter first Num >>>");
    num1 = getNum.nextInt();

    System.out.print("Enter second Num >>>");
    num2 = getNum.nextInt();    

    System.out.print("Enter third Num >>>");
    temp = getNum.nextInt();

    if (num1 <= temp){
    num1 = temp;
    }if (num2 <= temp){
    num2 = temp;    
    }

    if (num1 >= temp) {

    num1 = temp;
    }if (num2 >= temp){

    num2 = temp;
    }
    
    System.out.print("Max num is " + num1);
    System.out.print("Min num is " + num2);



    }

}
