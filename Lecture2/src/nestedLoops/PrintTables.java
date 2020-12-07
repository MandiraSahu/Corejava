package nestedLoops;

public class PrintTables {

	public static void main(String[] args) {
		for(int j=1; j<=20; j++) {
		for(int i=1; i<=10; i++) {
			int result= i*j ;
			System.out.print(result +" ");
		}
		System.out.println();	
		}
		
	}

}
