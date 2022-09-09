package ChapterFourTest;

import ChapterFour.HeartRates;

import java.util.Scanner;

public class HeartRatesTest {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);



        System.out.println("Enter Your First Name: ");
        String firstName = input.nextLine();


        System.out.println("Enter Your Last Name: ");
        String lastName = input.nextLine();

        System.out.println("Enter Current Year: ");
        int currentYear = input.nextInt();

        System.out.println("What Year Where You Born: ");
        int dateOfBirthYear = input.nextInt();

        System.out.println("What Month Where You Born: ");
        int dateOfBirthMonth = input.nextInt();

        System.out.println("What Day of the Month Where You Born: ");
        int dateOfBirthDay = input.nextInt();


        HeartRates heartRates = new HeartRates(firstName, lastName, dateOfBirthDay, dateOfBirthMonth, dateOfBirthYear,currentYear);



        System.out.println();
        System.out.println("**********************************************************");
        System.out.println();

        System.out.println("Maximum Heart Rate and Target Heart Rate Range");
        System.out.println();
        System.out.println("View Result: ");
        System.out.println("Your Date of Birth is: " + dateOfBirthDay +":" + dateOfBirthMonth + ":" + dateOfBirthYear);
        System.out.println("Your Current Age is: " + heartRates.getAge() + " Years");
        System.out.println("Your Maximum Heart Rate is: " + heartRates.getMaximumHeartRate() + " Beats per Minutes");
        System.out.println("Your Target Heart Rate is: " + heartRates.getTargetHeartRate(85, 50) + "%");


        HeartRates heartRates2 = new HeartRates("Temidayo", "Ogunnowo", 9, 3, 1991, 2022 );

        System.out.println("View Your Bio Information: " + heartRates2.getFirstName() + " " + heartRates2.getLastName() + " Born: " + heartRates2.getDateOfBirthDay() + ":" + heartRates2.getDateOfBirthMonth() + ":" + heartRates2.getDateOfBirthYear());


        heartRates2.setFirstName("James");

    }
}
