import java.io.*;

public class exer008_string_overload {
	String add(String a, String b) {
		return (a + " " + b);
	}
}


class StringOverload {
	public static void main(String args[]) throws IOException {
		String x, y;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter 2 String Values: ");
		x = br.readLine();
		y = br.readLine();
		
		exer008_string_overload ol = new exer008_string_overload();
		System.out.println("The result of 2 values " + ol.add(x, y));
		
	}
}
