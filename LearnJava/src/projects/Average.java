package projects;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double take1,take2;
		System.out.println("Please only use number");
		System.out.print("First: ");
		take1 = input.nextDouble();
		System.out.print("\nSecond: ");
		take2 = input.nextDouble();
		
		double avg;
		avg = (take1 + take2) / 2;
		System.out.printf("Average of the numbers you have entered: %.2f", avg);
		
		input.close();
		
		
	}

}
