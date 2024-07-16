package JavaTutorial.chapter3;

import java.util.Arrays;

public class Lab01 {
	public static void main(String[] args) {
		String[] cars = { "Volvo", "BMW", "Mercedes" };

//		System.out.println(Arrays.toString(cars));
//		System.out.println(cars.length);
//
//		for (String i : cars) {
//			System.out.println(i);
//		}

		int[] number = { 3, 22, 4, 7, 2, 8 };

//		Arrays.sort(number);
//		for (int i : number) {
//			System.out.println(i);
//		}

		for (int i = 0; i < number.length - 1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] > number[j]) {
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(number));
	}
}
