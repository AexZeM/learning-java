package projects.whileprojects;

import java.util.Scanner;

public class Makestar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int star = input.nextInt();
        int i = 1;
        while(i <= star){
            int k = 1;
            while(k <=i){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
