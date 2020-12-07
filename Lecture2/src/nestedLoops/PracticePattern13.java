package nestedLoops;

import java.util.Scanner;

public class PracticePattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
		for(int j=n-1; j>=i; j--) {
			System.out.print("* ");
		}for(int k=1; k<=i; k++) {
			System.out.print("  ");
		}for(int m=2; m<=i; m++) {
			System.out.print("  ");
		}for(int l=n-1; l>=i; l--) {
			System.out.print("* ");
		}System.out.println();
	}
		for(int i=1; i<n; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print("* ");
		}for(int k=n-1; k>=i; k--) {
			System.out.print("  ");
		}for(int m=n-2; m>=i; m--) {
			System.out.print("  ");
		}for(int l=1; l<=i; l++) {
			System.out.print("* ");
		}
		
		System.out.println();
		}
	}

}
