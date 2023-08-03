package week03;

public class fizzBuzzMethod {

	public static void main(String[] args) {
		
		int num1;
		num1 = 15;
		fizzBuzz(num1);
	}
	
	static void fizzBuzz(int num1) {
		if ((num1 % 3 == 0) && (num1 % 5 == 0)) {
			System.out.println("FizzBuzz");
		} else if (num1 % 5 == 0) {
			System.out.println("Buzz");
		} else if (num1 % 3 == 0) {
			System.out.println("Fizz");
		} else {
			System.out.println("Hello world!");
		}
	}

}
