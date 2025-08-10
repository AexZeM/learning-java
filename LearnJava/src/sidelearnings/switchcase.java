package sidelearnings;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number that valid: ");
       int x = input.nextInt();
        switch(x){
            case 1:
                System.out.println("Valid.");
                break;
            case 2:
                System.out.println("Valid.");
                break;
            case 3:
                System.out.println("Valid.");
                break;
            default:
                System.out.println("null");

            input.close();
        }
    }
}
