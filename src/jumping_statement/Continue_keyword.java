package jumping_statement;

public class Continue_keyword {

	public static void main(String[] args) {
		// If you declare continue keyword in excute the flow of the execution will skip
		for (int i=0; i<10; i++) {
			if(i==6) {
				continue;			
			}
			System.out.println(i);//6 will skip 
		}

	}

}
