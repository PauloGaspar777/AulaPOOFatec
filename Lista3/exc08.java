package lista03_lacos;

import java.util.Scanner;

public class exc08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 1;
		double soma = 0;
		double media;
		
		System.out.println("Informe quantos npumeros você gostariad e fazer a média: ");
		int n = sc.nextInt();
		
		do {
			System.out.println("informe o "+contador+"° número");
			int i = sc.nextInt();
			soma += i;
			contador++;
			
		} while (contador <= n);
		
		System.out.println("média = "+ (soma/n));

	}

}
