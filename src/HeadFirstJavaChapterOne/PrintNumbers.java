package HeadFirstJavaChapterOne;

import java.util.Scanner;

public class PrintNumbers {

    public static void main(String[] args) {

//            int a = 1;
//            int b = 2;
//            int c = 3;
//            int d = 4;
//

//        System.out.println("1, 2, 3, 4");
//        System.out.println();
//
//        System.out.print("1, 2, 3, 4");
//        System.out.println();
//        System.out.println();
//        System.out.print("1, 2, 3, 4");
//        System.out.println();
//        System.out.println();
//        System.out.print("1, 2, 3, 4");
//        System.out.println();
//        System.out.println();
//        System.out.print("1, 2, 3, 4");
//        System.out.println();
//        System.out.println();
//        System.out.printf("%d%d%d%d", 1, 2, 3, 4);




        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();

        System.out.println("Enter second number: ");
        int number2 = input.nextInt();


        int squaredNumber1 = number1 * number1;

        int squaredNumber2 = number2 * number2;


        System.out.printf("The square of the first number is %d%n", squaredNumber1);

        System.out.printf("The square of the second number is %d", squaredNumber2);





    }



}
