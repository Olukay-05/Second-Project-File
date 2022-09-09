import HeadFirstJavaChapterOne.Car;

import java.util.Scanner;

public class CarApplicationTest {

    public static void main(String[] args) {

        Car FirstCar = new Car("Toyota Camry", "2020", 10_000 );
        Car SecondCar = new Car("lexus", "2018", 15_000);
        Car ThirdCar = new Car("Benz");
        System.out.printf("Vehicle Model: %s%nYear of Vehicle: %s%nCost of Vehicle: $%.2f%n", FirstCar.getModel(), FirstCar.getYear(), FirstCar.getPrice());

        System.out.println();

        System.out.printf("Vehicle Model: %s%nYear of Vehicle: %s%nCost of Vehicle: $%.2f%n", SecondCar.getModel(), SecondCar.getYear(), SecondCar.getPrice());

        System.out.println();

        System.out.printf("Congratulations!!! You have a 5 percent Discount on your Toyota vehicle. It will cost you: $%.2f%n", FirstCar.carDiscount() );

        System.out.println();

        System.out.printf("Congratulations!!! You have a 7 percent Discount on your Lexus vehicle. It will cost you: $%.2f%n", SecondCar.carDiscount2());

        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Select Vehicle Model of your choice: ");
        String myCar = input.nextLine();
        ThirdCar.setModel(myCar);

        System.out.printf("Selected Vehicle Model is: ", ThirdCar.getModel());

    }
}
