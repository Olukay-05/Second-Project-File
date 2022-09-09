
package HeadFirstJavaChapterOne;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {

        long worldPopulation = 7900000000L;
        double annualGrowthRate;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Current World Population:   ");
        long figure = input.nextLong();

        System.out.println("Enter Annual Growth Rate:    ");
        double rate = input.nextDouble();

        long worldPopulationGrowth = (long) ((figure * rate) / 100);

        System.out.printf("World Population Growth is %d%n", worldPopulationGrowth);

        figure = worldPopulation;

        long nextYear = worldPopulation + worldPopulationGrowth;
        long twoYearsTime = nextYear + worldPopulationGrowth;
        long threeYearsTime = twoYearsTime + worldPopulationGrowth;
        long fourYearsTime = threeYearsTime + worldPopulationGrowth;
        long fiveYearsTime = fourYearsTime + worldPopulationGrowth;


        System.out.printf("Population for the Next 5 Years will be %d%n%d%n%d%n%d%n%d%n", nextYear, twoYearsTime, threeYearsTime, fourYearsTime, fiveYearsTime);
 //       System.out.printf("Estimated Population next Year is %d%n%d%n",  nextYear, twoYearsTime);


    }
}
