import java.util.Scanner;


public class BodyMassIndexCalculator {

    public static void main (String [] args) {

    Scanner inputDigits = new Scanner(System.in);

    System.out.println("Enter your weight Kilograms");
    double weight = inputDigits.nextDouble();

    System.out.println("Enter your height in meters");
    double height = inputDigits.nextDouble();

    double BMI = weight / (height * height);

    System.out.println("Your BMI = " + BMI);

    if (BMI < 18.5){
    System.out.println("Underweight You better start eating you skinny wimp");    
    }

    else if (BMI >= 18.5 && BMI <= 24.9){
    System.out.println("Your weight is normal");
    }

    else if (BMI == 25 && BMI <= 29.9){
    System.out.println("Dude your Fucking overweight Start Some exercise");
    }

    else if (BMI >= 30){
    System.out.println("Dude your own is finished YOU ARE OBESE");
    }



    }

}
