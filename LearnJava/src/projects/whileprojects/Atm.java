package projects.whileprojects;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int credit = 1000, x;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Bank ATM!");
        System.out.println("Your current balance: $" + credit);

        while (credit > 0) {
            System.out.println();
            System.out.println("===== Main Menu =====");
            System.out.println("1 - Deposit Money");
            System.out.println("2 - Withdraw Money");
            System.out.println("3 - Balance Inquiry");
            System.out.println("4 - Exit");
            System.out.print("Please select an option (1-4): ");
            x = input.nextInt();

            switch (x) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    x = input.nextInt();
                    credit += x;
                    System.out.println("You have deposited $" + x);
                    System.out.println("New balance: $" + credit);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    x = input.nextInt();
                    if (x > credit) {
                        System.out.println("Insufficient balance! You cannot withdraw more than you have.");
                        break;
                    } else {
                        credit -= x;
                        System.out.println("You have withdrawn $" + x);
                        System.out.println("New balance: $" + credit);
                        break;
                    }

                case 3:
                    System.out.println("Your current balance: $" + credit);
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option! Please select between 1 and 4.");
            }

            if (x == 4) {
                break;
            }
        }
        input.close();
    }
}
