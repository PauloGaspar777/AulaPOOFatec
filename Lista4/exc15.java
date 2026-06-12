package lista04;

import java.util.Scanner;

public class exc15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int[][] matriz = new int[3][3];
		int pares = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(matriz[i][j] % 2 == 0) pares++;
					
				
			}
		}
		
		System.out.println(pares + " números pares");
	}

}
