package lista04;

import java.util.Scanner;

public class exc22 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		boolean valido = true;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}			
			
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				for(int f = 0; f < 3; f++) {
					for(int n = 0; n < 3; n++) {
						if((i != f || j != n) && matriz[i][j] == matriz[f][n]) {
							valido = false;
						}
					}
				}
			}
		}
		System.out.println(valido);
	}

}
