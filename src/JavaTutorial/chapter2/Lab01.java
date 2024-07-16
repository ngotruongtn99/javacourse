package JavaTutorial.chapter2;

import java.util.Scanner;

public class Lab01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Nhập số a: ");
		int a = s.nextInt();
		System.out.print("Nhập số b: ");
		int b = s.nextInt();
		System.out.printf("-------> Tính nghiệm của phương trình đơn giản bậc 1 (y = %dx + %d)<-----------", a,
				b);
		if (a == 0 && b == 0) {
			System.out.println("\nPhương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("\nPhương trình vô nghiệm");
		} else {
			float x = (float) -(b) / a;
			System.out.printf("\nPhương trình có nghiệm x = %.2f", x);
		}

		s.close();
	}
}
