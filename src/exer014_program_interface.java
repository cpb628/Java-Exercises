import java.io.*;

class Employee {
	int Reg_No, Rt1, Rt2, Rt3;
	String Name;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	void GetInput() throws Exception {
		System.out.println("Please Enter Employee Number:");
		Reg_No = Integer.parseInt(br.readLine());
				
		System.out.println("Please Enter Employee Name:");
		Name = br.readLine();

		System.out.println("Please Enter Java Skillset:");
		Rt1 = Integer.parseInt(br.readLine());

		System.out.println("Please Enter Python Skillset:");
		Rt2 = Integer.parseInt(br.readLine());

		System.out.println("Please Enter PHP Skillset:");
		Rt3 = Integer.parseInt(br.readLine());	
	}
	
	void display() {
		System.out.println("Employee No:" + Reg_No);
		System.out.println("Employee Name:" + Name);
		System.out.println("Java Skillset:" + Rt1);
		System.out.println("Python Skillset:" + Rt2);
		System.out.println("PHP Skillset:" + Rt3);		
	}
}


class Output extends Employee {
	
	int total; 
	float average;
	
	void evaluate() throws Exception {
		GetInput();
		total = (Rt1 + Rt2 + Rt3);
		average = (float)total / 3;

	}
	
	void ScreenShow( ) {
		System.out.println("Overall Skillset Rating: " + total);
		System.out.println("Average Skillset Rating: " + average);
	}		
}


class exer014_program_interface {
	public static void main(String arges[]) throws Exception {
		Output ot = new Output();
		ot.evaluate();
		ot.ScreenShow();
		
			
	}
}



