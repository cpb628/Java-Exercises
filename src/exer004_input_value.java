import java.io.*;

public class exer004_input_value {
	public static void main(String args[]) throws Exception {
		int num1, num2, output;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Num1: ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Num2: ");
		num2 = Integer.parseInt(br.readLine());
		
		output = num1 + num2;
		System.out.println("The result is " + output);
	}
}
