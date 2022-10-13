
public class exer010_final_keyword {
	final int Reg_No;
	
	exer010_final_keyword(int num) {
		Reg_No = num;
	}
	
	void display() {
		System.out.println("Employee Number is: " + Reg_No);
	}
	
	
	
	public static void main(String args[]) {
		exer010_final_keyword emp = new exer010_final_keyword(602);
		emp.display();
		
	}
}
