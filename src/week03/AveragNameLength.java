package week03;

public class AveragNameLength {

	public static void main(String[] args) {
		String[] names;
		names = new String[5];
		names[0] = "Jose";
		names[1] = "James";
		names[2] = "Roberto";
		names[3] = "Theodore";
		names[4] = "Fred";
		
		int avgLength = avgNameLength(names);
		System.out.println("The average name length is " + avgLength + ".");
	} // end main method
	
	static int avgNameLength(String[] names) {
		int totalLength = 0;
		for (String name : names) {
			totalLength += name.length();
		}
			return totalLength / names.length;
	}
	
} // end class
		