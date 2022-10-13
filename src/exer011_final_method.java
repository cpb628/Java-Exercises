
public class exer011_final_method {
	final void display( ) {
		System.out.println("This is the Final Method");
	}
}


class Hello extends exer011_final_method {
	public static void main(String args[]) {
		Hello hl = new Hello();
		hl.display();
	}
}
