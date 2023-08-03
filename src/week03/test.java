package week03;

public class test {

	public static void main(String[] args) {
		
		int base = 3;
		int exponent = 4;
		System.out.println(power(base, exponent));
		
		
		
	}	// end main method
	
	public static int power(int base, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}	
		return result;
	
	}

	 
}
