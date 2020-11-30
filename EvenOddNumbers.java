import java.util.Scanner;

public class EvenOddNumbers {

    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter Number");
        long num = getInput.nextLong();

        if (num % 2 == 0){
            System.out.println("Number is an Even number");
        }else{
            System.out.println("Number is an Odd number");
        }
        
    }
}
