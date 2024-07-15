package JavaTutorial;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println(Math.pow(2, 4));
		Scanner scanner = new Scanner(System.in);
		System.out.println("First number: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Second number: ");
		int secondNumber = scanner.nextInt();
		System.out.println("Min =  " + Math.min(firstNumber, secondNumber));

		int a = 6;
		int b = 9;

		int c = Math.max(a, b);

		System.out.println(c);
	}

}