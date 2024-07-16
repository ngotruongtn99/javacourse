package JavaTutorial.chapter3;

import java.util.Scanner;

public class Lab3_2 {

	public static void main(String[] args) {
//		Bài 2: Viết bảng cửu chương của 1 số nguyên bất kỳ

		Scanner s = new Scanner(System.in);
		System.out.println("Bài 2 - Lab3 - Viết bảng cửu chương của 1 số nguyên bất kỳ");
		System.out.print("Nhập vào số nguyên bất kỳ");

		int number = s.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", number, i, number * i);
		}
		s.close();
	}

}
