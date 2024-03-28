import java.util.Scanner;

public class agesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
	//1.a	
		String lineEnd = "-------------------------------------------";
		int[] ages = {3,9,23,64,2,8,28,93};
		
		 int age1= ages.length;
		 int age0=ages[0];
		 int result= (ages[age1-1] - age0);
	
	//1.b
		
		int[] ages2 = {25,5,12,45,61,32,13,40,36};
		
		 int age= ages2.length;
		 int age00=ages2[0];
		 int result2= (ages2[age-1] - age00);

		//1.c array 1 average
	
		int sum=0;
		for ( int i=0; i<ages.length; i++) {
			
			sum= sum + ages[i];	
			}
		System.out.println("sum of the array is : " + sum);
		double average = sum/age1;
		System.out.println("average for array 1 : " + average);
	
	System.out.println();
	
	// 1.c. array 2 average
		int sum2=0;	
for ( int i=0; i<age; i++) {
			
			sum2= sum2 + ages2[i];	
			}
		System.out.println("sum of the array is : " + sum2);
		double average1 = sum2/age;
		System.out.println("average for array 2 : " + average1);
		
		System.out.println(lineEnd);	 
	// 2.a Sting array
		/*
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int length = names.length;
		
		for (int i=0; i< length; i++) {
			
			System.out.println(names[i] + ":" + names[i].length());
	
			}
		//2.b concatenation
		for (int i=0; i< length; i++) {
			
			System.out.print(names[i]+ " ");
			
			}
		System.out.println();
		System.out.println(lineEnd);
		
			*/
		//3. accessing first element of an array
		
		int []numbers = {4,6,8,10};
		int lengthOfTheArray = numbers.length;
		System.out.println(numbers[0]);
		//this will print the first number; which is 4
		
		//4. accessing last element of array
		
		System.out.println(numbers[lengthOfTheArray-1]);
		
		//this will print the last number of the array; which is 10.
		
		System.out.println(lineEnd);
		
		//5. nameLengths array
		
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	/*
		int n = names.length;
		int [] nameLengths = new int [n];
		
		System.out.print("{");
		
		for ( int i=0; i< names.length; i++) {
			n= names[i].length();
			nameLengths [i]= n;
	
			System.out.print(nameLengths[i]+ ",");
			
			}
		System.out.println("}");
		//System.out.println();
		//just to validate the formula
		//System.out.println(nameLengths[3]);
		System.out.println(lineEnd);
		*/
		
	// 6.Sum of array indices
		
		int n = names.length;
		int [] nameLengths = new int [n];
	
		int add=0;
			for ( int i=0; i< names.length; i++) {
					n= names[i].length();
						nameLengths [i]= n;
							//System.out.print(nameLengths[i]+ ",");
							add = add + nameLengths[i];
					}
		System.out.println();
		System.out.println("sum is : " + add);
		
		System.out.println(lineEnd);
		
	// 7.	hello + 3= hellohellohelloo
		/*
		String word = "hello";
		int z;
		System.out.print("enter a word: ");
		word=scanner.next();
		
		System.out.print("enter a number: ");
		z = scanner.nextInt();
		
		for (int i=0; i<z; i++) {
			
			System.out.print(word);
		}
		System.out.println();
		System.out.println(lineEnd);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
