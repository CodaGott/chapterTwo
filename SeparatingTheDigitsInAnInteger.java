
import java.util.Scanner;

public class SeparatingTheDigitsInAnInteger {

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter number");
        int number = getInput.nextInt();

        if (number <10000 || number > 99999){
            System.out.println("Enter Number with 5 digits");
            return;
        }

        int lastNumber = number % 10;
        number = number / 10;

       int fourthNumber = number % 10;
        number = number / 10;

      int thirdNumber = number % 10;
        number = number / 10;

        int secondNumber = number % 10;
        number = number / 10;

        int firstNumber = number % 10;
        number = number / 10;

        System.out.printf("%d %d %d %d %d%n", firstNumber, secondNumber, thirdNumber, fourthNumber,lastNumber);
    }
}

