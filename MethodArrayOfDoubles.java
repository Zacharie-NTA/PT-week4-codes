
public class MethodArrayOfDoubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double []array = {12.5,19.01,15.5};	
	System.out.println(averageOfArray(array));
		
	}
	
	//10.
	
	//Write a method that takes an array of double 
	//and returns the average of all the elements in the array.
	
	
	public static double averageOfArray(double [] array) {
		
		int sum = 0;
		
		for(double number : array) {
			
			sum+=number;
		}
		
		return  (sum/array.length);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
