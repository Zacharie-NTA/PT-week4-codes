
public class MethodTwoArraysOfDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double []myArray1= {12,13,0};
		double [] myArray2 = {14,15,16};
		
		System.out.println(isTrue(myArray1, myArray2));
	}
	
	//  11.
	//Write a method that takes two arrays of double and returns true if the average of the 
	//elements in the first array is greater than the average of the elements in the second array.

	public static boolean isTrue(double []array1, double [] array2) {
		
int sum1 = 0; int sum2 = 0;
		
		for(double number1 : array1) {
			
			sum1+=number1;
		}
		
				int average1 = sum1/array1.length;
	
					for(double number2 : array2) {
			
						sum2+=number2;
		}
		
							int average2 = sum2/array2.length;
		
								if(average1<average2)return false;
		
									else {
										return true;
		}
	}
}
