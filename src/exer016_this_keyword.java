

public class exer016_this_keyword {
	int num1, num2;
	exer016_this_keyword(int n1, int n2) {
		this.num1 = n1;
		this.num2 = n2;
	}
	
	void show( ) {
		System.out.println("Value of Num1: " + num1);
		System.out.println("Value of Num2: " + num2);
	}


	public static void main(String args[]) {
		exer016_this_keyword ut = new exer016_this_keyword(100, 200);
		ut.show();
		//System.out.println("Hello Java Programming!");
	}

}


 