import java.util.Scanner;

public class MethodFullName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter first name: ");
		  
		  String firstName; 
		  firstName = scanner.next(); 
		  String lastName;
		  System.out.print("enter last name: "); 
		  lastName = scanner.next();
		  
		  String fullName = makeFullname(firstName, lastName);
		  System.out.println("first name is : " +fullName);
		 
		 
		  
		String a = "hello";
		String b = "world";

		String full = makeFullname(a, b);
		System.out.println(full);
	}
	
	// 8.

public static String makeFullname(String a, String b) {

	return a + " " + b;
}

}
