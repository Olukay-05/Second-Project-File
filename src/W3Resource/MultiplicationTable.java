package W3Resource;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(number + "*" + i + "=" + (number * i));
        }
    }
}
