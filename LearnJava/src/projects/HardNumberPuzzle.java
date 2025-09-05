package projects;

import java.util.Random;
import java.util.Scanner;

public class HardNumberPuzzle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome! The number changes with every guess!");

        while (true) {
            int number = rand.nextInt(10) + 1;
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();
            if (guess == number) {
                System.out.println("Congratulations! Correct guess.");
                break;
            } else {
                System.out.println("Incorrect! The number has changed. Try again.");
            }
        }

        input.close();
    }
}
