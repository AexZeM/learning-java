package projects;

import java.util.Scanner;

public class NumberGreater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three distinct numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        } else if (c > a && c > b) {
            if (a > b) {
                System.out.println("c > a > b");
            } else {
                System.out.println("c > b > a");
            }
        } else {
            System.out.println("The numbers are not distinct. Please enter three different numbers.");
        }
        input.close();
    }
}