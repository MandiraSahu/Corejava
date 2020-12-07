package conditionalStatement;

public class Example {

	public static void main(String[] args) {
//		int number = 40;
//		if(number <=10)
//		{System.out.println("The number is in the range 0 to 10 ");
//		}
//		else if (number>10 && number<=20) {
//			System.out.println("The number is in the range of 11 to 20");
//		}else if(number>20 && number<=31) {
//			System.out.println("The number is in the range of 21 to 30");
//		}else {System.out.println("The number is greator than 30");
		
//		} 
		int a = 16;
		int b = 12;
		int maxOfBothNumbers = 33;
		maxOfBothNumbers = a>b ? a:b;
		System.out.println("Max number is "+ maxOfBothNumbers );
	}

}
