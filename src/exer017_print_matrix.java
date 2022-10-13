import java.io.*;

public class exer017_print_matrix {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1[][] = new int[3][3];
		int x = 0, y = 0;
		
		System.out.println("Enter 9 Integer value: ");
		for (x = 0; x < 3; x++) {
			for (y = 0; y < 3; y++) {
				num1[x][y] = Integer.parseInt(br.readLine());
			}
		}
		
		
		for (x = 0; x < num1.length; x++) {
			for (y = 0; y < 3; y++) {
				System.out.print(" " + num1[x][y]);
			}
			
			System.out.println();
		}
	
	}
}
