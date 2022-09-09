package W3Resource;

import java.util.Scanner;

public class Calculations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input First number: ");
        int firstNumber = input.nextInt();
        System.out.println("Input Second Number: ");
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;

        int multiply = secondNumber * firstNumber;
        int subtract = firstNumber - secondNumber;
        int division = firstNumber / secondNumber;
        int modulus = firstNumber % secondNumber;

        System.out.printf("125 + 24 = %d%n" + "125 - 24 = %d%n" + "125 * 24 = %d%n" + "125 / 24 = %d%n" + "125 mod 24 = %d%n", sum, subtract, multiply, division, modulus);

    }
}
