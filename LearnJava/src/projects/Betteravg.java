package projects;

import java.util.Scanner;

public class Betteravg {

	public static void main(String[] args) {

		/* ft = Teacher Note, y1 = Your Note, tx = Performance*/
		
		Scanner input = new Scanner(System.in);
		
		double ft, y1, tx, avg;
		
		System.out.println("Welcome to the xXSuper-School~~ System! Please only use numbers.");
		System.out.print("What is your note: ");
		y1 = input.nextDouble();
		System.out.print("\nWhat is Performance: ");
		tx = input.nextDouble();
		System.out.print("\nWhat is Teacher Note: ");
		ft = input.nextDouble();
		
		avg = (y1 * 0.35) + (tx * 0.15) + (ft * 0.5);
		System.out.println("Your score: " + avg);
		String x = (avg >= 50) ? "You passed" : "You failed";
		System.out.println(x);

		input.close();
		
	}

}
