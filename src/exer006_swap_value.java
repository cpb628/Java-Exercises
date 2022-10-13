



class InitialValue {
	int num1, num2;
	InitialValue(int a, int b) {
		num1 = a;
		num2 = b;
	}
	
}


class SwapValue {
	void swap(InitialValue sf) {
		int tempValue = sf.num1;
		sf.num1 = sf.num2;
		sf.num2 = tempValue;
	}
}


public class exer006_swap_value {
	public static void main(String args[]) {
		InitialValue ov = new InitialValue(20, 10);
		System.out.println("Initial Value:   " + ov.num1 + "\t" + ov.num2);
		
		SwapValue nv = new SwapValue();
		nv.swap(ov);
		System.out.println("After Swaping:   " + ov.num1 + "\t" + ov.num2);
		
	}
}
