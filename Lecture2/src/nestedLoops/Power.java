package nestedLoops;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a = ");
		int a = sc.nextInt();
		System.out.println("b = ");
		int b = sc.nextInt(); 
		int result = 1;
		for(int i=0; i<b; i++) {
		result*=a;
		
		}System.out.println(result);
		
	}

}
