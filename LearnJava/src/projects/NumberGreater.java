package projects;

import java.util.Scanner;

/*
 * a > b > c or a > c > b
 * b > a > c or b > c > a
 * c > a > b or c > b > a
 */
public class NumberGreater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a > b && a > c){
            if(b > c){
                System.out.println("a > b > c");
            }
            else{
                System.out.println("a > c > b");
            }
        } else if(b > a && b > c){
            if(a > c){
                System.out.println("b > a > c");
            }else{
                System.out.println("b > c > a");
            }
        } else if(c > a && c > b){
            if(a > b){
                System.out.println("c > a > b");
            }else{
                System.out.println("c > b > a");
            }
        }
    }
}