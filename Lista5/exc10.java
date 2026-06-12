package lista05;

import java.util.Scanner;

public class exc10 {
	
	public static String lerUsuario(Scanner sc) {
		System.out.println("usuário: ");
		return sc.nextLine();
	}
	
	public static String lerSenha(Scanner sc) {
		System.out.println("Senha: ");
		return sc.nextLine();
	}
	
	public static boolean validarLogin(String usuario, String senha) {
		return usuario.equals("lord games") && senha.contentEquals("senha123");
	}
	
	public static void mostrarResultado(boolean valido) {
		if(valido) {
			System.out.println("entrando...");
		}
		else {
			System.out.println("login ou senha incorretos");
		}
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String usuario = lerUsuario(sc);
		String senha = lerSenha(sc);
		
		boolean loginCorreto = validarLogin(usuario, senha);
		
		mostrarResultado(loginCorreto);
	}

}
