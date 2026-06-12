package lista04;

import java.util.Scanner;

public class exc08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] n = new int[10];
		int cont = 0;
		
		for(int i = 1; i < n.length; i++) {
			System.out.println("Informe um número: ");
			n[i] = sc.nextInt();
			
		}
		
		System.out.println("Verificar número: ");
		int x = sc.nextInt();
		
		for(int i = 1; i < n.length; i++) {
			if(n[i] == x) {
				cont++;
			}
			
		}
		System.out.println(x + " apareceu "+cont+" vezes.");
		sc.close();
	}

}
