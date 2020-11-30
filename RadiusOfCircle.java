import java.util.Scanner;

public class RadiusOfCircle {

    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter the radius of the circle you want to calculate");
        double num = getInput.nextLong();

        double diameter = 2 * num;
        System.out.println("The diameter of the circle is = " + diameter);

        double circumference = 2 * 3.14159 * num;
        System.out.println("The circumference of the circle is " + circumference);

        double area = 3.14159 * num * num;
        System.out.println("Area of the circle = " + area);
    }
}
