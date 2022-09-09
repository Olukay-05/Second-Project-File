package W3Resource;

import java.util.Scanner;

public class ComputeTheSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input an Integer: ");
        int number = input.nextInt();

        System.out.println("The sum of the digits is: " + sumDigits(number));

    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number /= 10;
        }
        return sum;
    }

}
