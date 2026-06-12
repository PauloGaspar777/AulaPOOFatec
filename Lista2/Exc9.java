package lista;

import java.util.Scanner;

public class Exc9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digito o nome de usuário");
		String user = sc.nextLine();
		
		System.out.println("Digite sua senha: ");
		String senha = sc.nextLine();
		 
		if (user.equals("admin") && senha.equals("12345")) {
			System.out.println("Acesso concedido");
		}
		else {
			System.out.println("acesso negado");
		}
		
		sc.close();

	}

}
