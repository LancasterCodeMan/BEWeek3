package week03;

public class MethodsApp {

	 static int returnSum(int x, int y, int z){
	        int answer = x + y + z;
	        return answer;
	    }
	    public static void main(String[] args) {
	        int a = 10, b = 10, c = 10;
	        System.out.println(returnSum(a,b,c));
	    }

}
