
public class MethodsBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean isHotOutSide = false;
		double moneyInPocket = 1.0;
		
		System.out.println(willBuyDrink( isHotOutSide,  moneyInPocket));
		
		
	}
	
	// 12. 
	
	//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
	//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	
	public static boolean willBuyDrink(boolean isHotOutSide, double moneyInPocket) {
		
		if(isHotOutSide && moneyInPocket>10.5) {
			
			return true;
		}
		else {
			return false;
		}
	}

}
