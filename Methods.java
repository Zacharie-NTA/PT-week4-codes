import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner (System.in);
		 
		 String word = "";
		 int n = 5;
		 System.out.println("enter a word : ");
		 
		 word =sc.next();
		 
		 String myWord = multiplyWord(word,n);
		 System.out.println(myWord);
		
	}
		
	// 7. 
	
	public static String multiplyWord(String a, int x) {
		
		if (x==0) return "";
			String return_a= "";
		
				for (int i=0; i<x; i++) {
			
				return_a +=a;
		
		}
		
				return return_a;
	}
}
