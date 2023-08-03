package week03;

import java.util.Arrays;

public class ArraysAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------1) Add Them up------");
		
		int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
        	sum += numbers[i];
        } System.out.println(sum);
        	
        System.out.println("------3) Print the Values In An Array Twice ORGINAL------");
        
        int [] arr = {5, 10, 44, -4, 10};
        int x = 10;
        
        for(int i = 0; i < arr.length; i++) {
        	System.out.println(arr[i]);
        	arr[i] = arr[i] + x;
        }	
        
        System.out.println("------3) Print the Values In An Array Twice NEW ARRAY------");
        
        for(int j = 0; j < arr.length; j++) {
        	System.out.println(arr[j]);
        }
        
        String[] firstNames = {"Mike", "Joe", "Brian", "Nick", "Carl"};
        String [] lastNames = {"Jones", "Thompson", "Walton", "Bird", "Jordan"};
        System.out.println(firstNames[1] + " " + lastNames[3]);
        
        System.out.println("------5) Modifying Elements in an Array ------");
        
        int a = 5;
        int b = 10;
        int[] arrtest = { 3, 7, 0, 4, -6, 10, 55 };
        arrtest [0] +=  a;
        arrtest[arrtest.length -1] +=  b;
        
        for (int i = 0; i < arrtest.length; i++)
        	System.out.println(arrtest[i]);
   
        System.out.println("------5) Build & Print an Array of Characters ------"); 
       
        String word = "Hello";
        char [] charArray = new char[word.length()];
        
        for (int t = 0; t < word.length(); t++) {
        charArray[t] = word.charAt(t);
        System.out.println(charArray[t]);
        }
        
        char [] charArray1 = word.toCharArray(); // another way
        for (int i = 0; i < charArray1.length; i++) {
        	System.out.println(charArray1[i]);	
        }
        
        System.out.println("------9) Create & Return an Array of Characters ------"); 
       
        String userWord = "hello!";
        System.out.println("Your array is: ");
        System.out.println(Arrays.toString(wordToArray(userWord)));
  
        System.out.println("------ 11) Build and Return an Array ------"); 
       
        int num;
		num = 8;
		System.out.println("Your array is: ");
		System.out.println(Arrays.toString(buildArray(num)));
		
		System.out.println("------ 12) Create An Array of Integer ------"); 
		
		int num1, num2, num3, num4, num5, num6; 
		num1 = 1;
		num2 = 2;
		num3 = 3;
		num4 = 4;
		num5 = 5;
		num6 = 6;
		int returnedInt = createInt(num1, num2, num3, num4, num5, num6);
		System.out.println("The last number of the array is " + returnedInt + ".");
		
		//15) Build a New Array
		
		String[] arrt = {"Astros", "Reds", "Phillies", "Dodgers", "Angels"};
		String word1, word2, word3;
		word1 = "Yankees";
		word2 = "Orioles";
		word3 = "Mariners";
		newArray(word1, word2, word3, arrt);	
		
		//17) Reverse An Array
	
		int a1,b1,c1,d1,e1;
		a1 = 60;
		b1 = 50;
		c1 = 40;
		d1 = 30;
		e1 = 20;
		reverseArray(a1, b1, c1, d1, e1);
		
	} // end method

		
	// 9) Create & Return an Array of Characters
	static char[] wordToArray(String userWord) {
		    char[] charArray = new char[userWord.length()];
			for (int i = 0; i < userWord.length(); i++) {
			    charArray[i] = userWord.charAt(i);
			}		
			return charArray; 
		} // end method

	//11) Build and Return an Array
	static int[] buildArray(int num) {
		int [] numArray = new int [num];
		for (int i = 0; i < num; i++ ) {
			numArray[i] = i;		
		}
		return numArray;
	} //end method
		
	
	//12) Create an Array of Integer
	static int createInt(int num1, int num2, int num3, int num4, int num5, int num6) {
		int [] arrayInt = {num1, num2, num3, num4, num5, num6};
		return arrayInt[arrayInt.length - 1];	
	} // end method
	

	static void newArray(String word1, String word2, String word3, String[] arr) {
		System.out.println("------ 15) Build a New Array ------"); 
		
		String[] newArr = { word1, word2, word3 };
		String[] combinedArr = new String[arr.length + newArr.length];
		int counter = 0;
		
		for ( String str : arr ) {
		    combinedArr[counter] = str;
		    counter++;
		}
		
		for ( String str2 : newArr ) {
		    combinedArr[counter] = str2;
		    counter++;
		}
		
		for (String str3 : combinedArr) {
			System.out.println(str3);
//		for ( int i = 0; i < combinedArr.length; i++ ) {
//		    System.out.println(combinedArr[i]);
		}	// end last for loop
	} // end method
	
	static void reverseArray(int a, int b, int c, int d, int e) {	
		System.out.println("------ 17) Reverse an Array ------");
		int[] originalArray = {a, b, c, d, e};
		int[] reversedArray = new int[originalArray.length];
		for (int num: originalArray) {
			System.out.println(num);
		}
		for (int i = 0; i < originalArray.length; i++) {
		    reversedArray[i] = originalArray[originalArray.length - 1 - i];
		    System.out.println(reversedArray[i]);
		}			
	} // end method

} // end class
