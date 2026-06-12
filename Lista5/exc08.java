package lista05;

import java.util.Scanner;

public class exc08 {

	
	public static String lerNome(Scanner sc) {
		System.out.println("Digite seu nome: ");
		return sc.nextLine();
	}
	
	public static int lerIdade(Scanner sc) {
		System.out.println("Digite sua idade: ");
		return sc.nextInt();
	}
	
	public static String lerCidade(Scanner sc) {
		System.out.println("digite sua cidade: ");
		return sc.nextLine();
	}
	
	public static void mostrarResumo(String nome, int idade, String cidade) {
		System.out.println("nome: "+nome);
		System.out.println("idade: "+idade);
		System.out.println("cidade: "+cidade);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome = lerNome(sc);
		int idade = lerIdade(sc);
		String cidade = lerCidade(sc);
		
		mostrarResumo(nome, idade, cidade);

	}

}
