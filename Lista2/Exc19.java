package lista;

import java.util.Scanner;

public class Exc19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em gruas Celcius: ");
		double tempe = sc.nextDouble();
		
		if(tempe < 15) {
			System.out.println("classificação: frio");
		}
		else if (tempe >= 15 && tempe <=25) {
			System.out.println("classificação: agradável");
		}
		else {
			System.out.println("classificação: quente");
		}

		

	}

}
