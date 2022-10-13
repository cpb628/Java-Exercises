

class KeyFirst {
	int x;
	public KeyFirst(int x) {
		this.x = x;
	}
	
	protected void finalize() throws Throwable {
		System.out.println("Your Final Grade in Java Programming is: " + x);
	}
}



public class exer012_final_keyword2 {
	public static void main(String args[]) {
		KeyFirst f1 = new KeyFirst(100);
		KeyFirst f2 = new KeyFirst(250);

		f1 = f2;
		System.gc();
		System.out.println("Hi Hello");
		
	}
}
