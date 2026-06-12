package lista;

import java.util.Scanner;

public class Exc18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do {
			System.out.println("\nMenu");
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Sair");
			opcao = sc.nextInt();
			
			switch (opcao) {
			
			case 1:
				System.out.println("Digite um número: ");
				int n1 = sc.nextInt();
				
				System.out.println("Digite outro número: ");
				int n2 = sc.nextInt();
				
				int soma = n1 + n2;
				System.out.println("Soma = "+soma);
				break;
				
			case 2:
				System.out.println("Digite um número: ");
				int a = sc.nextInt();
				
				System.out.println("Digite outro número: ");
				int b = sc.nextInt();
				
				int sub = a - b;
				System.out.println("Subtração = "+sub);
				break;
				
			case 3:
				System.out.println("encerrando: ");
				break;
				
			default:
				System.out.println("Opção inválida");
				
			}
			
			
		} while (opcao != 3);
		
		sc.close();
	}

}
