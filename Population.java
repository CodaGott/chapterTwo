// THIS PROGRAM CALCULATED THE ESTIMATED POPULATION GROWTH FOR THE WORLD BY GETTING INPUT FROM USERS.



import java.util.Scanner;

public class Population{


    public static void main (String [] args){
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter the current world population");
        long worldPopulation = getInput.nextLong();

        System.out.println("Enter the current world projected growth");
        double populationGrowth = getInput.nextDouble();

        System.out.println("How many years calculation do you want to project?");
        double duration = getInput.nextDouble();

        double estimatedWorldPopulation = ( worldPopulation * populationGrowth * duration) / 100;

        System.out.println("The estimates growth is " + estimatedWorldPopulation + " billion");


    }









}
