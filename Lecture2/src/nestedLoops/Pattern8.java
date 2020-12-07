package nestedLoops;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
		for(int i=1; i<=n; i++) {
			for(int j=n-1;j>=i;j--) { 
				System.out.print("  ");
			} for(int m=1; m<=i;m++) {
				System.out.print(" *");
			} for(int k=2; k<=i; k++) {
				System.out.print(" *");
			}
				
			System.out.println();
		}
	}

}
