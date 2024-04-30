package strings;

public class String_compareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "levitica";
		String b = "LEVITICA";
		String c = "levitica";
		String d = "Technologies";
		String e = "Levitica";
		String f = "Pvt Ltd";
		System.out.println(a.compareTo(d));
//here when we compare with ato something if the values are same then output will be zero
		//other wise out put will give some no
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));
		System.out.println(a.compareTo(e));
		System.out.println(a.compareTo(f));

	}

}
