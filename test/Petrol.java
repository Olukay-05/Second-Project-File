import HeadFirstJavaChapterOne.PetrolPurchase;

import java.util.Scanner;

public class Petrol {

    public static void main(String[] args) {

        PetrolPurchase petrol = new PetrolPurchase("SemiColon", "Diesel", 50, 165.45, 5);
        PetrolPurchase petrol2 = new PetrolPurchase();
        System.out.printf("Location: %s%nFuel: %s%nAmount Purchased: %d litres%nPrice per Litre: %.2f litres%nDiscount: %.2f%s%n", petrol.getLocation(), petrol.getTypeOfPetrol(), petrol.getQuantity(), petrol.getPricePerLitre(), petrol.getPercentageDiscount(), "%");

        System.out.println("*****************************");

        Scanner netAmount = new Scanner(System.in);
        System.out.println("How much fuel are you buying:  ");

    }
}
