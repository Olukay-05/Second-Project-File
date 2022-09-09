package HeadFirstJavaChapterOne;


import java.util.Scanner;

public class PyramidOfGiza {



    public static void main(String[] args) {

        double numberOfStones;
        double weightOfStones;
        int numberOfYears;


        Scanner input = new Scanner (System.in);
        System.out.println("Estimated Number Of Stones Used:  ");
         numberOfStones = input.nextDouble();
             if (numberOfStones != 2_300_000){
                 System.out.println("Wrong input");
             }


        Scanner weight = new Scanner (System.in);
        System.out.println("Average weight of each stones used:  ");
         weightOfStones = input.nextDouble();


        Scanner years = new Scanner(System.in);
        System.out.println("Number of years taken to build the pyramids:  ");
        numberOfYears = input.nextInt();


        double averageWeight = (double)  weightOfStones / numberOfYears;

        System.out.printf("Number of Pyramids Built by Weight per Year is %.2f%n", averageWeight);

        double numberOfYearsInHours = 236_520;
        double averageWeightByHours = weightOfStones / numberOfYearsInHours;

        System.out.printf("Number of Pyramids Built by Weight each Hour is %f%n", averageWeightByHours);


        double numberOfYearsInMinutes =  14_191_200;

        double averageWeightByMinute = weightOfStones / numberOfYearsInMinutes;

        System.out.printf("Number of Pyramids Built by Weight each Minute is %f%n", averageWeightByMinute);

    }
}
