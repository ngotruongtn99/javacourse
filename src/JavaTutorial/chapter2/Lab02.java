package JavaTutorial.chapter2;

import java.util.Scanner;

public class Lab02 {

	public static void ptbacnhat(int a, int b) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG  1<<");
		Scanner s = new Scanner(System.in);
		System.out.print("Nhập số a: ");
		a = s.nextInt();
		System.out.print("Nhập số b: ");
		b = s.nextInt();
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

	public static void ptbachai(int a, int b, int c) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG  2<<");
		Scanner s = new Scanner(System.in);
		System.out.print("Nhập số a = ");
		a = s.nextInt();
		System.out.print("Nhập số b =  ");
		b = s.nextInt();
		System.out.print("Nhập số c = ");
		c = s.nextInt();
		double delta = Math.pow(b, 2) - 4 * a * c;
		System.out.printf(
				"-------> Tính nghiệm của phương trình đơn giản bậc 1 (%dx^2 + (%d)y + (%d) = 0)<-----------", a,
				b, c);
		if (a == 0) {
			ptbacnhat(b, c);
		} else {
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm!");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.printf("Phương trình có nghiệm kép x = %.3f", x);
			} else {
				float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
				float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("Phương trình có 2 nghiệm phân biệt x1 = %.3f và x2 = %.3f", x1, x2);

			}
		}
		s.close();
	}

	public static void tinhTienDien(int a) {
		System.out.print("Nhập số điện: ");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		if (0 < a && a <= 100) {
			int tienDien = a * 1000;
			System.out.println("Tiền điện là: " + tienDien);
		} else {
			int tienDien = 100 * 1000 + (a - 100) * 1500;
			System.out.println("Tiền điện là: " + tienDien);
		}
		s.close();
	}

	public static void main(String[] args) {
//	Bài 2: Cho phương trình: ax^2 + bx + c = 0
//			Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình
//			trên

		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ --------------------------------------  ++");
		System.out.println("| 1. Giải phương trình bậc 1 			|");
		System.out.println("| 2. Giải phương trình bậc 2 			|");
		System.out.println("| 3. Tính số tiền điện           			|");
		System.out.println("| 4. Kết thúc                       			|");
		System.out.println("++ ---------------------------------		++");
		System.out.println("Lựa chọn của bạn là : ");
		Scanner s = new Scanner(System.in);
		int choose = s.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		switch (choose) {
		case 1: {
			ptbacnhat(a, b);
			break;
		}
		case 2: {
			ptbachai(a, b, c);
			break;
		}
		case 3: {
			tinhTienDien(a);
			break;
		}
		default:
			System.out.println("\nKết thúc chương trình");
			System.exit(0);
		}
		s.close();
	}
}
