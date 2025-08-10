package projects;

import java.util.Scanner;

/*
 * What to get? (A bit more advanced little project for myself!)
 * -> Get 4 different scores from the user: (Mental Exercises, Math, Logic-Conclusion, Detection)
 * -> Have any obstacles been placed in your way? (Yes/No)
 * -> Have you received disciplinary action from teachers? (If 3 or more than 3, not eligible)
 * -> Results: The user must have a score greater than 50. If there was an obstacle, but the score is still greater than 50, the user will be directed to a 
 * different school. If the user's score is greater than 90, they will be directed to schools for gifted students. 
 * Schools will be different for the score ranges of 50-75, 75-90, and 90-100. If the user has received more than 3 punishments from teachers, they will be 
 * automatically disqualified from everything.
 */

public class PassingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ME, Math, LC, Det;
        System.out.println("Welcome to Future School Finder (FSF) tool. You should enter the things wanted from you and we will find your school.");
        System.out.println("Please start by entering your scores (0-100).");
        
        do {
        System.out.print("Mental Exercises Score: ");
        ME = input.nextDouble();
        if(ME < 0 || ME > 100 ){
            System.out.println("Invalid input. The score must be between 0 and 100. Please try again.");
        }
        } while (ME < 0 || ME > 100);
    
        do {
            System.out.print("\nMath Score: ");
            Math = input.nextDouble();
            if (Math < 0 || Math > 100) {
                System.out.println("Invalid input. The score must be between 0 and 100. Please try again.");
            }
        } while (Math < 0 || Math > 100);

        do {
            System.out.print("\nLogic-Conclusion Score: ");
            LC = input.nextDouble();
            if (LC < 0 || LC > 100) {
                System.out.println("Invalid input. The score must be between 0 and 100. Please try again.");
            }
        } while (LC < 0 || LC > 100);

        do {
            System.out.print("\nDetection Score: ");
            Det = input.nextDouble();
            if (Det < 0 || Det > 100) {
                System.out.println("Invalid input. The score must be between 0 and 100. Please try again.");
            }
        } while (Det < 0 || Det > 100);
        double Average = (Det + LC + Math + ME) / 4;

        System.out.println("Any obstacles been placed in your way? (Yes or No)");
        String yn = input.next();

        System.out.println("Have you received disciplinary action from teachers? (Please use numbers)");
        int dis = input.nextInt();

        System.out.println("\nYour average score is: " + Average);
        System.out.println("Obstacles: " + yn);
        System.out.println("Disciplinary Actions: " + dis);

        if(dis >= 3){
            System.out.println("You are automatically disqualified due to receiving 3 or more disciplinary actions.");
        }
        else if(Average < 50){
            System.out.println("You are not eligible for any schools as your average score is below 50.");
        } else{
            if(Average >= 90){
                System.out.println("Congratulations! You are directed to schools for gifted students.");
            } else if(Average >= 75 && Average < 90){
                System.out.println("You are directed to top-tier schools.");
            } else if(Average >= 50 && Average < 75){
                if (yn.equalsIgnoreCase("Yes")) {
                    System.out.println("You are directed to a special support school due to having obstacles, despite your good scores.");
                } else{
                    System.out.println("You are directed to an average school.");
                }
            } else{
                System.out.println("Your scores and conditions do not meet the criteria for a specific school.");
            }
        }
                input.close();
    }
}
