package week03;

public class ReturnSumMethod {

	public static void main(String[] args) {

		System.out.println("------ 1) returnSum Method ------");
		int num1, num2, num3;
		num1 = 1;
		num2 = 1;
		num3 = 1;
		System.out.println(returnSum(num1, num2, num3));

	} //end main method

	static int returnSum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
}// end class
