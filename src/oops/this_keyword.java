package oops;
class first{
	void method1() {
		System.out.println("first_method");
	}
	void method2() {
		System.out.println("Second_method");
		this.method1();
	}
}

public class this_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first Sru = new first();
		Sru.method2();
		
		

	}

}
