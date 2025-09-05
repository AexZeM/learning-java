package projects;

import java.util.Random;
import java.util.Scanner;

public class NumberPuzzle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(10) + 1;

        System.out.println("Welcome! Guess the number between 1 and 10.");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();
            if (guess == number) {
                System.out.println("Congratulations! Correct guess.");
                break;
            } else {
                System.out.println("Incorrect! Try again.");
            }
        }

        input.close();
    }
}
