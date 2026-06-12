package lista04;

import java.util.Scanner;

public class exc23 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int[][] matriz2 = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}			
			
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz2[j][2 - i] = matriz[i][j];
			}			
			
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(matriz2[i][j] + " ");
			}
		}
		

	}

}
