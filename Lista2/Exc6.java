package lista;

import java.util.Scanner;

public class Exc6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade = sc.nextInt();
		
		if (idade >= 0 && idade <= 12) {
			System.out.println("você é criança");
		}
		else if (idade > 12 && idade <= 17) {
			System.out.println("você é adolescente");
		}
		else if(idade > 17 && idade <= 59) {
			System.out.println("você é adulto");
		}
		else if (idade >= 60) {
			System.out.println("Você é idoso7");
		}

	}

}
