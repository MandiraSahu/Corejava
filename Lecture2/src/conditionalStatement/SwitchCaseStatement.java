package conditionalStatement;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		int dayOfWeek = 1;
//		if (dayOfWeek==1) {
//	    }
//		if (dayOfWeek==2) {
//		}
//		if (dayOfWeek==3) {
//		}
//		if (dayOfWeek==4) {
//		}
//		if (dayOfWeek==5) {
//		}
//		if (dayOfWeek==6) {
//		}
//		if (dayOfWeek==7) {
//		}
//		switch(dayOfWeek) {
//		case 1 : case 2:
//			System.out.println("I am on leave");
//			break;
//		case 3 :
//			System.out.println("I am playing football");
//			break;
//		
//		default : 
//			System.out.println("I don't know what day it is");
		
		int rating = 7;
		switch (rating) {
		case 1 : case 2 :
			System.out.println("Bad");
			break;
		case 3 :
			System.out.println("Average");
			break;
		case 4 : case 5 :
			System.out.println("Good");
			break;
		default :
			System.out.println("Invalid");
			
			
		}
		

}
}
