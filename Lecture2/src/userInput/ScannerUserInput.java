package userInput;
import java.util.Scanner;
public class ScannerUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sellingPrice = sc.nextFloat();
		float costPrice = sc.nextFloat();
		float profit = sellingPrice-costPrice;
		System.out.println("The Profit = $ "+profit);
	}

}


