package W3Resource;

import java.util.Scanner;

public class Evaluation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input number1: ");
        int number1 = input.nextInt();

        System.out.println("Input number2: ");
        int number2 = input.nextInt();

        int multiplication = number1 * number2;

        System.out.println("25 * 5 = " + multiplication);

    }
}
