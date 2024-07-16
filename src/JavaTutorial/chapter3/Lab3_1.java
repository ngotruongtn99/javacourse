package JavaTutorial.chapter3;

import java.util.Scanner;

public class Lab3_1 {

	public static void main(String[] args) {
//		Bài 1: Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả số đấy là số
//		nguyên tố hay không ?

		Scanner s = new Scanner(System.in);
		System.out.println("Run bài 1 Lab 3	");
		System.out.print("Nhập vào một số nguyên bất kì: ");
		int number = s.nextInt();
		int count = 0;
		for (int i = 2; i < number - 1; i++) {
			if (number % i == 0) {
				count++;
				System.out.println("Ước số khác " + i);
				break;
			}
		}
		if (count == 0) {
			System.out.printf("%d là số nguyên tố", number);
		} else {
			System.out.printf("%d không là số nguyên tố", number);
		}
		s.close();
	}

}
