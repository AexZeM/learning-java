package projects.whileprojects;

import java.util.Scanner;

public class InW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0;

        while(true){
            System.out.println("Enter number");
            int y = input.nextInt();

            if(y <= 0){
                System.out.println("Program End");
                System.out.println("The sum of the numbers entered: " + x);
                break;
            }
                x += y;
            }
        }
    }

