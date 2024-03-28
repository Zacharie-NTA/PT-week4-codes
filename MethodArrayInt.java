
public class MethodArrayInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a method that takes an array of int
		//and returns true if the sum of all the ints in the array is greater than 100.
	
		int []array = {50,40,5,5};
		
		System.out.println(isMoreThan100(array));
		
	}
		// 9.
	
	public static boolean isMoreThan100(int [] myArray) {
		
		int sum = 0;
		
		for (int number : myArray) {
			
				sum +=number;
			}
					if(sum>100) {
			
							return true;
			}
							if (sum<100) return false;
											return false;
		
	}
	
}
