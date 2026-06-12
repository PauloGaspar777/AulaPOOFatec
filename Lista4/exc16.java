package lista04;

import java.util.Scanner;

public class exc16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = matriz[j][i];
				System.out.println(matriz[i][j] + " ");
			}
		}

	}

}
