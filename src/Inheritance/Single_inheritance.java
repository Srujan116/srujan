package Inheritance;
class first{
	public void method1() {
		System.out.println("levitica");
	}
}
class second extends first{
	public void method2() {
		System.out.println("Technologies pvt ltd");
	}
}

public class Single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		second sru = new second();
		sru.method1();
		sru.method2();

	}

}
