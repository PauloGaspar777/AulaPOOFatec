package lista;

import java.util.Scanner;

public class Exc17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String userCerto = "admin";
		String senhaCerta = "12345";
		
		boolean acessoLiberado = false;
		
		for (int tentativa = 1; tentativa <= 3; tentativa ++) {
			System.out.println("Usuário: ");
			String user = sc.nextLine();
			
			System.out.println("Senha: ");
			String senha = sc.nextLine();
			
			if(userCerto.equals(user) && senhaCerta.equals(senha)) {
				acessoLiberado = true;
				System.out.println("Acesso liberado: ");
				break;
			}
			else {
				System.out.println("Dados incorretos.");
			}
		}
			if(!acessoLiberado) {
				System.out.println("Conta bloqueada.");
			}
			sc.close();
	}

}
