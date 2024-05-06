package Multilevel_inheritance;
class one {
	public void sru() {
		System.out.println("Srujan");
	}
}
class two extends one{
	public void jan() {
		System.out.println("Sunny");
	}
}
class three extends two{
	public void sun() {
		System.out.println("Srujan");
	}
}

public class Multiinhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		three ss = new three();
		ss.sru();
		ss.jan();
		ss.sun(); 

	}

}
