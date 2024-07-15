package JavaTutorial;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài: ");
		int d = scanner.nextInt();
		System.out.println("Nhập chiều rộng");
		int r = scanner.nextInt();

		System.out.println("Chu vi của hình chữ nhật là: " + (d + r) * 2);
		System.out.println("Diện tích của hình chữ nhật là: " + d * r);
		System.out.println("Cạnh nhỏ nhật là: " + Math.min(d, r));
	}

}
