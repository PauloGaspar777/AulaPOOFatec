package lista04;

import java.util.Scanner;

public class exc09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] matriz = new int[10];
		
		for(int i = 1; i < matriz.length; i++) {
			System.out.println("digiter um número: ");
			matriz[i] = sc.nextInt();		
			}
		
		for(int i = 1; i < matriz.length - 1; i++) {
			for(int j = 1; j <= matriz.length - 1; i++) {
				if(matriz[j] > matriz[j + 1]) {
					int temp = matriz[j];
					matriz[j] = matriz[j+1];
					matriz[j + 1] = temp;
				}
			}
		}
		
		for(int i = 1; i < matriz.length; i ++) {
			System.out.println(matriz[i]);
		}
		
		sc.close();
		

	}

}
