package lista04;

import java.util.Scanner;

public class exc24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[5][5];
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				matriz[i][j] = sc.nextInt();
			}			
			
		}
		
		int n = sc.nextInt();
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(matriz[i][j] == n) {
					System.out.println("localizado: " + i + ", "+j);
				}
			}			
			
		}
	}

}
