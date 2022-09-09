package HeadFirstJavaChapterOne;
import java.util.Scanner;

public class Arithmetic {

    private static int number1;
    private static int number2;

    public static void main(String[] args) {

        Integers();
        Squares();

        System.out.print("1 2 3 4");
        System.out.print("1,2,3,4");
        System.out.print("1,2,3,4");
        System.out.print("1,2,3,4");


    }

    public static void Integers(){

        Scanner input = new Scanner(System.in);
            System.out.println("Enter First Digit:   ");
                  number1 = input.nextInt();

            System.out.println("Enter Second Digit:  ");
                  number2 = input.nextInt();
    }

    public static void Squares(){

        int numberSquared1 = (number1 * number1);
        int numberSquared2 = (number2 * number2);

       int total = numberSquared1 * numberSquared2;

        System.out.printf("The total of %d and %d is: %d%n", numberSquared1, numberSquared2,  total);
    }
}
