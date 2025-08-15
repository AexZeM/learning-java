package projects;

import java.util.Scanner;

/*
 * Swimming = >30
 * Cinema = >20-<30
 * Concert = >10-<20
 * Museum = >5-<10 
 * Skiing = <5
 */

public class EventSuggestor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Event Suggestor!");
        System.out.print("What is the current temperature?: ");
        int temperature = input.nextInt();
        
        if(temperature >= 30){
            System.out.println("We suggest you go swimming.");
        }else if(temperature >= 20 && temperature < 30){
            System.out.println("We suggest you go to the cinema.");
        }else if(temperature >= 10 && temperature < 20){
            System.out.println("We suggest you go to a concert.");
        }else if(temperature >= 5 && temperature < 10){
            System.out.println("We suggest you visit a museum.");
        }else if(temperature < 5){
            System.out.println("We suggest you go skiing.");
        }else{
            System.out.println("Error: Invalid temperature input.");
            return;
        }
                input.close();  
    }
}
