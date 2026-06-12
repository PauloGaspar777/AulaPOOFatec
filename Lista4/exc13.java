package lista04;

import java.util.Scanner;

public class exc13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int[][] matriz = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < 3; i++) {
			soma += matriz[i][i];
		}
		
		System.out.println(soma);

	}

}
