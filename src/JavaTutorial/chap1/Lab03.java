package JavaTutorial.chap1;

import java.util.Scanner;

public class Lab03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Độ dài cạnh của khối lập phương là: ");
		int d = s.nextInt();
		System.out.println("Thể tích của khối lập phương là: " + Math.pow(d, 3));

		s.close();
	}
}