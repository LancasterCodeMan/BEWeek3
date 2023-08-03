package week03;

public class sumOfDigits {
	
	public static int sumDigits(int digits) {
	   
		int sum = 0;
		while (digits > 0 ) {
			sum += digits % 10;
			digits /= 10;
		}
		return sum;
		
		
	}

	public static void main(String[] args) {
		
		int digits = 12;
		int sumAll = sumDigits(digits);
		System.out.println("The sum of all digits for the value " + digits + " is " + sumAll + ".");
	}
}
