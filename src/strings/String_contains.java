package strings;

public class String_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lev = "Levitica Technologies Pvt Ltd";
		System.out.println(lev.contains("levitica"));
		/* if it is present in string value output will be true or else False on above output
		 * is false because of levitica 'l' should be in capital
		 */
		System.out.println(lev.contains("Levitica"));
		System.out.println(lev.contains("Technologies"));
		System.out.println(lev.contains("Pvt Ltd"));
		System.out.println(lev.contains("LEVITICA"));
		

	}

}
