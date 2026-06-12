package lista;

import java.util.Scanner;

public class Exc13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um ano: ");
		int ano = sc.nextInt();
		
		if((ano %4 == 0 && ano %100 != 0) || ano %400 == 0) {
			System.out.println("Esse ano é bisexto");
		}
		else {
			System.out.println("esse ano não é bisexto");
		}
		
		sc.close();

	}

}
