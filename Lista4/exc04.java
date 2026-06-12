package lista04;

import java.util.Scanner;

public class exc04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] n = new int[6];
		int soma = 0;
		double media;
		
		for(int i = 0; i < n.length; i++) {
			System.out.println("Informe um número");
			n[i] = sc.nextInt();
			soma += n[i];
		}
		media = soma/6;
		System.out.println("média = "+soma);

	}

}
