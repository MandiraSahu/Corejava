package nestedLoops;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
		for(int i=1; i<=n; i++) {
			for(int j=2; j<=i; j++) {
				System.out.print("  ");
			}for(int k=n; k>=i; k--) {
				System.out.print(" *");
			}for(int m=n-1; m>=i; m--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
