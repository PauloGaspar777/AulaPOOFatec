package lista03_lacos;

import java.util.Scanner;

public class Exc11 {

	public static void main(String[] args) {
		
		int n;
		boolean valido = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite um númer de 1 a 10");
			n = sc.nextInt();
			if(n >= 1 && n <= 10) {
				valido = true;
				System.out.println("número válido");
			}
			else {
				valido = false;
				System.out.println("Número inválido");
			}
		} while (valido == false);

	}

}
