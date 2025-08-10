package projects;

import java.util.Scanner;

public class Taxation {

	public static void main(String[] args) {

		double x, price, taxprice, tax = 0.14;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to VakVak Store's automatic price tax system! Please use numbers!");
		System.out.print("Enter normal price: ");
		price = input.nextDouble();
		x = price * tax;
		taxprice = x + price;
		System.out.println("Taxed Price: " + taxprice);
		
		input.close();
		
	}

}
