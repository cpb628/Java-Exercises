
import java.io.*;


public class exer019_matrix_subtraction {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1[][] = new int[2][2];
		int num2[][] = new int[2][2];
		int num3[][] = new int[2][2];		
		int x, y, z;
		
		// 1st Matrix Cube 
		System.out.println("Enter 1st Matrix (4) Integer value: ");
		for (x = 0; x < 2; x++) {
			for (y = 0; y < 2; y++) {
				num1[x][y] = Integer.parseInt(br.readLine());
			}
		}

		// 2nd Matrix Cube 
		System.out.println("Enter 1st Matrix (4) Integer value: ");
		for (x = 0; x < 2; x++) {
			for (y = 0; y < 2; y++) {
				num2[x][y] = Integer.parseInt(br.readLine());
			}
		}
		
	
		// Subtract 2 Matrix Cube
		for (x = 0; x < num1.length; x++) {
			for (y = 0; y < 2; y++) {
				num3[x][y] = num1[x][y] - num2[x][y];  
			}
		}
		
		
		for (x = 0; x < num1.length; x++) {
			for (y = 0; y < 2; y++) {
				System.out.print(" " + num3[x][y]);
			}
			
			System.out.println();
		}
	
		
		
	}
}
