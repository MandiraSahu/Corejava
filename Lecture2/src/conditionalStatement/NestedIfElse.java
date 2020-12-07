package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		int a=14, b=12, c=20;
		int result = 0;
//		if(a>b) {
//			if(a>c) {
//				result = a;
//			}else {
//				result=c;
//			}
//		}else {
//			if(b>c) {
//				result = b;
//			}else {
//				result = c;
//			}
//		}
//		 System.out.println("The largest number is "+ result);
		
		result = a>b ? a>c ? a : c : b>c ? b : c ;
		System.out.println("the largest no is "+ result);
	}

}