package lista;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nomeCorreto = "admin";
		String senhaCorreta = "12345";
		
		double saldo = 1000;
		
		boolean acessoLiberado = false;
		
		
		do {
		System.out.println("Nome: ");
		String nome = sc.nextLine();

		System.out.println("Senha: ");
		String senha = sc.nextLine();
		
		if(nome.equals(nomeCorreto) && senha.equals(senhaCorreta)) {
			System.out.println("Acesso concedido");
			break;
		} 
		else {
			System.out.println("Dados incorretos");
		}
		
		} while(acessoLiberado == false);
		
		int opcao;
		do {
		
		System.out.println("\n=====[MENU]=====");
		System.out.println("1. Saldo");
		System.out.println("2. Depósito");
		System.out.println("3. Saque");
		System.out.println("4. Sair");
		
		opcao = sc.nextInt();
		
		switch (opcao) {
		
		case 1:
			System.out.println("Saldo: "+saldo);
			break;
			
		case 2:
			System.out.println("Quanto gostaria de depositar? ");
			double deposito = sc.nextDouble();
			saldo = saldo + deposito;
			break;
			
		case 3:
			if(saldo > 0) {
				System.out.println("Quanto gostaria de sacar? ");
				double saque = sc.nextDouble();
				
				if(saque > saldo) {
					System.out.println("saldo insuficiente");
				}
				else {
					System.out.println("Saque concluído");
					saldo = saldo - saque;
					break;
				}
			}
			else {
				System.out.println("Saldo insuficiente");
				break;
			}
			
		case 4: 
			System.out.println("Saindo...");
			break;
		}
		
		} while (opcao != 4);
		
		sc.close();
		
		


	}

}
