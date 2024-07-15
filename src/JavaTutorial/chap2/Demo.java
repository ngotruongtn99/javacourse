package JavaTutorial.chap2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
//		- dưới 10M: không đóng thuế
//		- từ 10M tới 15M: thuế 10%
//		- từ 15 tới 30M : thuế 20%
//		- trên 30M: thuế 50%
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập ");
		int tax = s.nextInt();
		if (tax < 10) {
			System.out.println("không đóng thuế");
		} else if (tax <= 15) {
			System.out.println("Đóng thuế 10%");
		} else if (tax <= 30) {
			System.out.println("Đóng thuế 20%");
		} else {
			System.out.println("Đóng thuế 50%");
		}
		s.close();
	}

}
