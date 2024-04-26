package decision_making_statements;

public class Switch_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lev = 1;
	switch(lev) {
	case 1:
		System.out.println("first");
		break;
	case 2:
		System.out.println("second");
		break;
	case 3:
		System.out.println("third");
		break;
		default:
			System.out.println("None");// all are printed
			// only one statement wants to print means use break in between cases
	}

	}

}
