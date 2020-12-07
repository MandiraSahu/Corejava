package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		int grade = 10;
		if(!(grade == 10 || grade == 12)) {
			System.out.println("you cannot give exams now");
		}
	}
}