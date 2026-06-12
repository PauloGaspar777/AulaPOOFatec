package lista03_lacos;

import java.util.Scanner;

public class exc10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int num;
		
		do {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			
			soma += num;
		} while (num != 0);
		
		System.out.println("soma dos número: "+soma);
		sc.close();
	}

}
