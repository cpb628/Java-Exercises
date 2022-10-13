



class SwapFirst {
	int num1, num2;
	SwapFirst(int a, int b) {
		num1 = a;
		num2 = b;
	}
	
}


class SwapSecond {
	void swap(SwapFirst s) {
		int output = s.num1;
		s.num1 = s.num2;
		s.num2 = output;
	}
}


public class exer006_swap_value {
	public static void main(String args[]) {
		SwapFirst ov = new SwapFirst(20, 10);
		System.out.println("Before Swaping: " + ov.num1 + "\t" + ov.num2);
		
		SwapSecond nv = new SwapSecond();
		nv.swap(ov);
		System.out.println("After  Swaping: " + ov.num1 + "\t" + ov.num2);
		
	}
}
