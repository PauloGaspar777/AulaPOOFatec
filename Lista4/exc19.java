package lista04;

import java.util.Scanner;

public class exc19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		boolean identidade = true;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == j && matriz[i][j] != 1) identidade = false;
				if(i != j && matriz[i][j] != 0) identidade = false;
			}
		}
		
		System.out.println(identidade);
	}

}
