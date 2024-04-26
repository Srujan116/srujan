package decision_making_statements;

public class nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		if (a+b > 25) {
			System.out.println("greaterthan 25");
			
		}else {
			System.out.println("not printed");
		}
		 if (a+b < 25) {
			System.out.println("lessthan 25");
			}else {
				System.out.println("2 not printed");
			}
		 if (a+b > 28) {
			System.out.println("greaterthan 25");
		}
		else {
			System.out.println("None of the above");// all statements are printed here
		}

	}

}
