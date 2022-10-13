
public class exer013_finall_all {
	int Reg_No;
	String Name;
	static String Company = "C1-Link Software and Consultancy, Inc.";
	static String URL = "https://c1-link.com";
	
	
	exer013_finall_all(int a, String b) {
		Reg_No = a;
		Name = b;
	}
	
	
	void display( ) {
		System.out.println("Employee No.  : " + Reg_No);
		System.out.println("Employee Name.: " + Name);
		System.out.println("Company Name  : " + Company);
		System.out.println("Website URL   : " + URL);
	}
	
	
	public static void main(String args[]) {
		exer013_finall_all emp = new exer013_finall_all(2801, "Jun-Jin Berdin");
		emp.display();
	}
}
