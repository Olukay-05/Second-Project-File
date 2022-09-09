package HeadFirstJavaChapterOne;

import java.util.Scanner;

public class BmiCalculator {


    public static void main(String[] args) {


        double bmi;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in KG:  ");
                 double weight = input.nextDouble();

                 System.out.println("Enter your height in M:  ");
                double height = input.nextDouble();

                bmi = weight / (height * height);

                System.out.printf("Your BMI is %f%n", bmi);

            if (bmi <= 18.5) {
                System.out.println("You are Underweight");
                }
                else {
                    if (bmi >= 18.5 && bmi <= 24.9){
                        System.out.println("You have a Normal Weight");
                        }
                        else {
                            if(bmi >= 25 && bmi <= 29.9){
                                System.out.println("You are Overweight");
                                }else {
                                    if(bmi >= 30){
                                         System.out.println("You are Obese");
                                    }
                                }
                        }
                }
    }
}
