package JavaTutorial.chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3_3 {
	public static void main(String[] args) {
//		Bài 3: Viết chương trình nhập vào 1 mảng số nguyên bất kỳ:
//		- Sắp xếp và xuất mảng vừa nhập ra màn hình
//		- Xuất phần tử có giá trị nhỏ nhất
//		- Xuất phần tử có giá trị lớn nhất

		Scanner s = new Scanner(System.in);
		System.out.println("Bài 3 - Lab3 - Viết chương trình nhập vào 1 mảng số nguyên bất kỳ");
		System.out.print("Nhập vào số lượng phần tử: ");
		int size = s.nextInt();

		int[] numberArray = new int[size];

		System.out.println("Nhập vào lần lượt các phần tử trong mảng");

		for (int i = 0; i < size; i++) {
			System.out.print("Phần tử " + i + 1 + ": ");
			numberArray[i] = s.nextInt();
		}

		System.out.println("Mảng số nguyên: " + Arrays.toString(numberArray));

		System.out.print("Sắp xếp: ");

		for (int i = 0; i < numberArray.length - 1; i++) {
			for (int j = i + 1; j < numberArray.length; j++) {
				if (numberArray[i] > numberArray[j]) {
					int tmp = numberArray[i];
					numberArray[i] = numberArray[j];
					numberArray[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(numberArray));

		System.out.print("Phần tử có giá trị lớn nhất: ");

		int maxNumber = numberArray[0];
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] >= maxNumber) {
				maxNumber = numberArray[i];
			}
		}

		System.out.println(maxNumber);

		System.out.print("Phần tử có giá trị nhỏ nhất: ");

		int minNumber = numberArray[0];
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] <= minNumber) {
				minNumber = numberArray[i];
			}
		}

		System.out.println(minNumber);
		s.close();
	}
}
