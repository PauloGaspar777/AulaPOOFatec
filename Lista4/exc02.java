package lista04;

import java.util.Scanner;

public class exc02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] n = new int[10];
		int soma = 0;
		
		for(int i = 0; i < n.length; i++) {
			System.out.println("informe um número");
			n[i] = sc.nextInt();
			soma += n[i];
		}
		
		System.out.println("Soma de todos os números: " +soma);
		sc.close();
	}

}
