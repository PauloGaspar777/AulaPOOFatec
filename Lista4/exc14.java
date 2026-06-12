package lista04;

import java.util.Scanner;

public class exc14 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int[][] matriz = new int[4][4];
		int maior = Integer.MIN_VALUE;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				matriz[i][j] = sc.nextInt();
				
			}
			
		}
		
		maior = matriz[1][1];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(matriz[i][j] > matriz[i][j+1]) {

					maior = matriz[i][j];
				}
				
			}
			
		}
		
		System.out.println(soma);

	}

}
