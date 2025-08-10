package projects;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		double area, r, e, pi = 3.14; 
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Radius: ");
		r = input.nextDouble();
		area = pi * (r*r);
		System.out.printf("\nArea of circle: " + area);
		e = (4.0/3) * pi * (r*r*r);
		System.out.printf("\nVolume of the Sphere: " + e);
		
		input.close();

	}

}
