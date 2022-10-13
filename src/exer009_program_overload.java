import java.io.*;

class First {
	int x, y;
	
	First(int a, int b) {
		x = a;
		y = b;
	}
	
	void FirstDisplay() {
		System.out.println("Value of X: " + x);
		System.out.println("Value of Y: " + y);
	}
}


class Second extends First {
	int z;
	Second(int a, int b, int c) {
		super(a, b);
		z = c;
		
	}
	
	void SecondDisplay() {
		super.FirstDisplay();
		System.out.println("Value of Z: " + z);
	}
	
}


public class exer009_program_overload {
	public static void main(String args[]) throws IOException {
		Second sc = new Second(10, 20, 30);
		sc.SecondDisplay();
	}
}



