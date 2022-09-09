package HeadFirstJavaChapterOne;

import java.util.Scanner;

public class PrintListOfNumbers {

    public static void main(String[] args) {

//        printNumbers();
//        calculateTheSum();
//        multiplicationTable();
        factorialValue();

    }

    static void printNumbers() {

        int counter;

        for (counter = 1; counter <= 10; counter++) {
            System.out.println(counter);
        }
    }

    static void calculateTheSum(){

        int sum = 0;

        for(int i = 1; i <= 10; i++){

            sum = sum + 1;
        }
        System.out.println("sum is " + sum);
    }

    static  void multiplicationTable(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");

        int num = input.nextInt();

        int multiply = 0;
        for(int i = 1; i <= 12; i++){

             //multiply = num * i;
           // System.out.println(num +" x " + i + " = " + (num*i) );

            multiply = num * i;
            System.out.println(multiply);
        }
    }

    static void factorialValue(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number: ");

        int number = 0;
        number = input.nextInt();

        int factorial = 1;
        for(int i = 1; i <= number; i++){

             factorial = factorial * i;

        }


        System.out.println(factorial);


    }
}
