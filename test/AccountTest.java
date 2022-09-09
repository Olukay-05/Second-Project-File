import HeadFirstJavaChapterOne.Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account myAccount = new Account("Olukayode", 2500.54);
        Account account1 = new Account("John", 5000.25);
        myAccount.getName();

        System.out.println("Please enter the name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);

        System.out.printf("Name and Account Balance in object myAccount is: %s $%.2f%n", myAccount.getName(), myAccount.getBalance());
        System.out.printf("Name in object myAccount is:%n%s%n", account1.getBalance());




    }
}
