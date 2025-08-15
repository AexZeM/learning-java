package sidelearnings.whileandfor;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Guess Number: ");
        
        while(true){
        int a = input.nextInt();
            if(a != 0){
                System.out.println("Opps! Wrong number, try again.");
            }else{
                System.out.println("You found it!");
                break;
            }
        }
        input.close();
    }

}
