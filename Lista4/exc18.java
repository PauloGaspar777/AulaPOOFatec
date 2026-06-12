package lista04;

import java.util.Scanner;

public class exc18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[][] matriz = new int[3][3];
		int[][] matriz2 = new int[3][3];
		int[][] matrizSoma = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("==== Matriz 2 ====");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz2[i][j] = sc.nextInt();
				matrizSoma[i][j] = matriz[i][j] + matriz2[i][j];
			}
		}
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(matrizSoma[i][j] + " ");
			}
		}
	}
}
