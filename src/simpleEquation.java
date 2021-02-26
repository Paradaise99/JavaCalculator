import java.util.*;
import java.text.DecimalFormat;
public class simpleEquation {
	
	static double result;
	
	public static void insertNumber() {
		//insert A in the equation
		Scanner firstInput = new Scanner(System.in);
		System.out.println("Insert A:");
		double a = firstInput.nextInt();
		
		//insert B in the equation
		Scanner secondInput = new Scanner(System.in);
		System.out.println("Insert B:");
		double b = secondInput.nextInt();
		
		//insert C in the equation
		Scanner thirdInput = new Scanner(System.in);
		System.out.println("Insert C:");
		double c = thirdInput.nextInt();
		if ( a == 0 ) {
			System.out.println("Equation is impossible");
		}
		else {
			result = (( c - b ) / a );
		}
		
		Scanner Decimals = new Scanner(System.in);
		System.out.println("1 Decimal \n2 Decimals \n3 Decimals \n4 Decimals \n5 Decimals");
		int decimals = Decimals.nextInt();
		
		switch (decimals) {
		case 1 :
			System.out.println(String.format("%.1f", result));
			break;
		case 2 :
			System.out.println(String.format("%.2f", result));
			break;
		case 3 :
			System.out.println(String.format("%.3f", result));
			break;
		case 4 :
			System.out.println(String.format("%.4f", result));
			break;
		case 5 :
			System.out.println(String.format("%.5f", result));
			break;
		}
		
		
		//String day = null;
		//int numberDecimals = 1;
		//switch (numberDecimals) {
		//case 1:
			
		}
		
		
		
	
	
	

	public static void main(String[] args) {
		insertNumber();

	}

}
