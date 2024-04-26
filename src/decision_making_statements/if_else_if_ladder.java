package decision_making_statements;

public class if_else_if_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		if (a+b > 25) {
			System.out.println("greaterthan 25");
			
		}
		else if (a+b < 25) {
			System.out.println("lessthan 25");
		}
		else if (a+b > 28) {
			System.out.println("greaterthan 25");
		}
		else {
			System.out.println("None of the above");
			/*if 1st statement is satisfy then the first one is going to print
			 * rest are ignored. if 1st one is not satisfied go with else if statement 
			 * if any of them is satisfy then it is going to print .
			 * if all are false and not satisfying then else statement going to print.
			 */
		}

	}

}
