package ChapterFourTest;

import ChapterFour.GasMileage;

import java.util.Scanner;

public class GasMileageTest {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double totalNumberOfMilesDriven = 0;
        int milesDrivenCounter = 0;

        System.out.println("Enter Miles Driven or -1 to quit: ");

        double milesDriven = input.nextDouble();
        while (milesDriven != -1){

            totalNumberOfMilesDriven = (double) (totalNumberOfMilesDriven + milesDriven);
            milesDrivenCounter = milesDrivenCounter + 1;

            System.out.println("Enter Miles Driven or -1 to quit: ");
            milesDriven = input.nextDouble();
        }

        if (milesDrivenCounter != 0) {

            double totalMilesDriven = totalNumberOfMilesDriven + milesDrivenCounter;

            System.out.printf("Total number of Miles Driven is: %f%n", totalMilesDriven);

        }


        GasMileage gasMileage = new GasMileage();



//        System.out.println("Enter number of Gallons Used: ");
//
//        int gallonsUsed = input.nextInt();
//        gasMileage.setGallonsUsed(gallonsUsed);

        System.out.printf("Total miles per gallon obtained for all trips up to this point is: %d%n", gasMileage.calculateTotalMilesPerGallon());




//        System.out.printf("Total number of Gallons Used is: %d%n", gasMileage.getGallonsUsed());

//        System.out.println("Total number of Gallons used is: " + gallonsUsed);



//        System.out.println("Enter Number of Gallons Used: ");
//
//        double gallonsUsed = input.nextDouble();


    }
}
