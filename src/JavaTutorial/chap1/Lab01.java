package JavaTutorial.chap1;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên của bạn: ");
		String name = scanner.nextLine();
		System.out.println("Nhập điểm của bạn: ");
		float mark = scanner.nextFloat();

		System.out.println("Thông tin: " + name + ", điểm: " + mark);
		scanner.close();
	}

}
