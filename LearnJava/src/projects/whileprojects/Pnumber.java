package projects.whileprojects;

import java.util.Scanner;

public class Pnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number:");
        int numbent = input.nextInt();
        int a = 1;
        while(a <= numbent){
            System.out.println(a);
            a *= 2;
        }
    }
}
