
import java.util.Scanner;

public class NegativePositiveAndZeroValues {

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter number");
        int number1 = getInput.nextInt();

        System.out.println("Enter number");
        int number2 = getInput.nextInt();

        System.out.println("Enter number");
        int number3 = getInput.nextInt();

        System.out.println("Enter number");
        int number4 = getInput.nextInt();

        System.out.println("Enter number");
        int number5 = getInput.nextInt();

        if (number1 < 0 ){
            System.out.println("Negative number");
        } if (number1 == 0){
            System.out.println("Number is zero");
        } if (number1 > 0){
            System.out.println("Positive");
        }if (number2 < 0 ){
            System.out.println("Negative number");
        } if (number2 == 0){
            System.out.println("Number is zero");
        } if (number2 > 0) {
            System.out.println("Positive");
        }if (number3 < 0 ){
            System.out.println("Negative number");
        } if (number3 == 0){
            System.out.println("Number is zero");
        } if (number3 > 0) {
            System.out.println("Positive");
        }if (number4 < 0 ){
            System.out.println("Negative number");
        } if (number4 == 0){
            System.out.println("Number is zero");
        } if (number4 > 0) {
            System.out.println("Positive");
        }if (number5 < 0 ){
            System.out.println("Negative number");
        } if (number5 == 0){
            System.out.println("Number is zero");
        } if (number5 > 0) {
            System.out.println("Positive");
        }
    }
}
