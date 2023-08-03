package week03;

public class passwordCheckerMethod {

	public static void main(String[] args) {
		String password = "passwordgggggggggggg";
        boolean meetsRequirement = passwordChecker(password);
		if (meetsRequirement) {
		    System.out.println(password + " meets the requirements.");
		} else {
		    System.out.println(password + " does not meet the requirements.");
		}		
	} //end main method
	
	static boolean passwordChecker(String password) {
		if ((password.length() >= 8) && password.contains("!") || password.contentEquals("$") || password.contains("%") || password.contains("&")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
} //end class
