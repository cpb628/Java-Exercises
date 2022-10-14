

import java.io.*;


public class exer020_matrix_multiplication {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1[][] = new int[4][4];
		int num2[][] = new int[4][4];
		int num3[][] = new int[4][4];		
		int x, y, z;
		
		// 1st Matrix Cube 
		System.out.println("Enter 1st Matrix (8) Integer value: ");
		for (x = 0; x < 4; x++) {
			for (y = 0; y < 4; y++) {
				num1[x][y] = Integer.parseInt(br.readLine());
			}
		}

		// 2nd Matrix Cube 
		System.out.println("Enter 1st Matrix (8) Integer value: ");
		for (x = 0; x < 4; x++) {
			for (y = 0; y < 4; y++) {
				num2[x][y] = Integer.parseInt(br.readLine());
			}
		}
		
	
		// Multiply 2 Matrix Cube
		for (x = 0; x < num1.length; x++) {
			for (y = 0; y < 4; y++) {
				num3[x][y] = 0;
				for (z = 0; z < 4; z++) {
					num3[x][y] = num3[x][y] + (num1[x][z] * num2[z][y]);
				}
			}
		}
		
		
		for (x = 0; x < num1.length; x++) {
			for (y = 0; y < 4; y++) {
				System.out.print(" " + num3[x][y]);
			}
			
			System.out.println();
		}
	
		
		
	}
}
