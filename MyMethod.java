import java.util.Scanner;

public class MyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number:");
		
		int a = sc.nextInt();
		
		System.out.println("enter a second number:");
		
		int b = sc.nextInt();
		
		if(isPrime(a))
			System.out.println(a + " :is a prime number" );
				else System.out.println(a+ ":not a prime number");
		if(isPrime(b))
			System.out.println(b + " :is a prime number" );
				else System.out.println(b+ ": is not a prime number\n");

//comparing two numbers if they are prime or not.
		System.out.println(" The prime numbers between your two inputs are: ");
		for(int i=a; i<=b ;i++) {
			
			if(isPrime(a) || isPrime(b))
				
				if(isPrime(i))
					
			System.out.println(i);
			
		}
			
		 
	}
	// 13. my code
	
	//Write a method named isPrime, which takes an integer as an argument and 
	//returns true if the argument is a prime number, or false otherwise. 
	
	public static boolean isPrime (int x) {
		
		int count = 0;
		
			for(int i = 1; i <= x; i++) {
			 
			 	if(x % i == 0 )
			    	
			    	 count++;
			}					
			if(count > 2)  
		            {
		                return false;
		            }else {
		        			return true;
		         
			
		        }     
		}
		
	
}
