

class FirstSuper {
	int x, y;
	
	FirstSuper(int a, int b) {
		x = a;
		y = b;
	}
	
	void show ( ) {
		System.out.println("Value of X: " + x);
		System.out.println("Value of Y: " + y);
	}
}


class SecondSuper extends FirstSuper {
	int z;
	SecondSuper(int a, int b, int c) {
		super(a, b);
		z = c;
	}
	
	void show() {
		super.show();
		System.out.println("Value of Z: " + z);
		
	}
	
}




public class exer015_super_class {
	public static void main(String args[]) {
		SecondSuper ss = new SecondSuper(100, 200, 300);
		ss.show();
		
	}
}
