package JavaTutorial.chapter4;

public class Demo {

	int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("Học Java");

		Student st1 = new Student();
		st1.age = 18;
		st1.name = "Trường Ngô";

		System.out.println("Student name: " + st1.name + " and age: " + st1.age);
		st1.learnJava();
	}

}
