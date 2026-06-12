package lista;

import java.util.Scanner;

public class Exc7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double media =  (nota1 + nota2)/2;
		
		if (media >= 6) {
			System.out.println("Aprovado");
		}
		else if (media >= 4 && media < 6) {
			System.out.println("recuperação");
		}
		else if (media < 4) {
			System.out.println("Reprovado");
		}
	sc.close();
	
	}

}
