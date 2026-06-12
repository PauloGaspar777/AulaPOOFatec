package lista04;

import java.util.Scanner;

public class exc17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[][] matriz = new int[3][3];
		int mult;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("informe um número para multiplicar todos os elementos da matriz");
		mult = sc.nextInt();
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz[i][j] *= mult;
				System.out.println(matriz[i][j]);
			}
		}
	}

}
