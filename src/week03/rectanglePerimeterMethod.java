package week03;

public class rectanglePerimeterMethod {
	
	public static void main(String[] args) {
		
	    int length = 100;
		int width = 22;
		int perimeter = rectanglePerimeter(length, width);
		System.out.println("The rectangle has a perimeter of " + perimeter + ".");
	} //end main method

	static int rectanglePerimeter(int length, int width) {
		int perimeter = (length * 2) +  (width * 2);
		return perimeter;
	}
		
	
}// end class
