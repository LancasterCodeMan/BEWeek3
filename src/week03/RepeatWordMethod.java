package week03;

public class RepeatWordMethod {

	static String repeatWord(String userWord, int numTimes) {
		
		String repeatedWord = userWord.repeat(numTimes);
		return repeatedWord;	
		}
	
	public static void main(String[] args) {

		int numTimes = 3;
		String userWord = "stop";
		System.out.println(repeatWord(userWord,numTimes));
	}

}
