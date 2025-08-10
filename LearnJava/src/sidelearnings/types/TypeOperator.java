package sidelearnings.types;

public class TypeOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int x ;
		x = a + b;
		int k = a - b;
		int l = a * b;
		int r = a / b;
		
		int mod = a % b;
		System.out.println("Probly" + x + k + l + r + mod);
		k++;
		System.out.println(k);
		k--;
		System.out.println(k);
		
		
		
		int number1 = 5;
		int number2 = 10;
		
		boolean isIt = (number1 + number2) == 15;
		System.out.println(isIt);
		
		boolean isIt1 = (number1 > number2);
		boolean isIt2 = (number1 < number2);
		
		boolean answer = (isIt1 && isIt2);
		System.out.println(answer);
		
		String answer2 = (isIt1) ? "Yes" : "No";
		System.out.println(answer2);
		
		number1 += 2;
		System.out.println(number1);
	}

}
