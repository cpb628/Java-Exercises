import java.io.*;


public class exer007_method_overloading {
	int sum(int num1, int num2) {
		return (num1 + num2);
	}
	
}


class MethodCall {
										 //throws NumberFormatException, IOException 
	public static void main(String args[]) throws IOException {
		int x, y;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter 2 Integer Values: ");
		x = Integer.parseInt(br.readLine());
		y = Integer.parseInt(br.readLine());
		
		exer007_method_overloading ol = new exer007_method_overloading();
		System.out.println("The result of 2 numbers " + ol.sum(x, y));
	}
}
	


