package lista03_lacos;

import java.util.Scanner;

public class exc12 {

	public static void main(String[] args) {
		
		int op;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== Sistema ===");
		
		do {
			System.out.println("Escolha um aopção: ");
			System.out.println("1. somar");
			System.out.println("2. subtrair");
			System.out.println("3. sair");
			
			op = sc.nextInt();
			
			if (op == 1) {
				System.out.println("=== Soma ===");
				
				System.out.println("Digite um número: ");
				int n1 = sc.nextInt();
				
				System.out.println("digite outro número: ");
				int n2 = sc.nextInt();
				
				int soma = n1 + n2;
				
				System.out.println(n1 +" + "+ n2 +" = " + soma);
			}
			else if (op == 2) {
				System.out.println("=== Subtração ===");
				
				System.out.println("Digite um número: ");
				int n1 = sc.nextInt();
				
				System.out.println("digite outro número: ");
				int n2 = sc.nextInt();
				
				int subtracao = n1 - n2;
				
				System.out.println(n1 +" + "+ n2 +" = " + subtracao);
			}
			else if(op > 3) {
				System.out.println("Opção inválida");
			}
			
		} while (op != 3);
		
		System.out.println("Encerrando...");
		sc.close();
	}

}
