import java.util.*;


public class mainMenu {
	public static void main(String[] args) {
		Scanner menuInput = new Scanner(System.in);
		System.out.println("1: Simple Equation \n2: Insertion Sort");
		int options = menuInput.nextInt();
		
	switch (options) {
	case 1 :
		simpleEquation equation = new simpleEquation();
		equation.insertNumber();
		break;
	case 2 :
		InsertionSort sort = new InsertionSort();
		int arr[] = {8299745,11885,751548,956314};
		sort.sort(arr);
		sort.printArray( arr );
		break;	
	}
		
	}
}
