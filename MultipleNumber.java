import java.util.Scanner;

public class MultipleNumber {

    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter First Number");
        long num = getInput.nextLong();

        System.out.println("Enter Second Number");
        long number = getInput.nextLong();

        if (num % number == num){
            System.out.println("First Number is a multiple of Second Number");
        }else{
            System.out.println("First Number is not a multiple of second Number");
        }

    }
}
