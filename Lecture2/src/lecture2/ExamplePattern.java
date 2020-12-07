package lecture2;

import java.util.Scanner;

public class ExamplePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
		int v = 1;
		for(int i=1; i<=n; i++) {
		for(int j=n-1; j>=i; j--) {
			System.out.print("  ");
		}for(int k=1; k<=v; k++)
		 {
			System.out.print(k +" ");
		} v+=2;
		System.out.println();
		
		}
	}

}
