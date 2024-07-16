package JavaTutorial.chapter3;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numberArray = { 3, 5, 2, 6, 4 };

		int minNumber = numberArray[0];
		for (int i = 0; i < numberArray.length - 1; i++) {
			if (numberArray[i] <= minNumber) {
				minNumber = numberArray[i];
			}
		}

		System.out.println(minNumber);
	}
}
