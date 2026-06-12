package lista;

import java.util.Scanner;

public class Exc10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o valor da sua compra: ");
		double compra = sc.nextDouble();
		
		if (compra >= 100) {
			compra = compra - ((compra/100) * 10);
			System.out.println("Você recebeu um desconto de 10%");
			System.out.println("Valor total: "+compra);
		}
		else {
			System.out.println("Sem desconto, parceiro");
		}
	}

}
