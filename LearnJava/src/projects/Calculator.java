package projects;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Calculator! Please only use numbers!");
        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble();
        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char x = input.next().charAt(0);
        
        switch(x){
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                if(secondNumber != 0){
                    System.out.println(firstNumber / secondNumber);
                }
                else{
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Please use valid operator.");
                break;
        }
        input.close();
    }
}
