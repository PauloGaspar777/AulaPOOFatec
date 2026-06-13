package lista05;

import java.util.Scanner;

public class exc05 {
	
	public static void menu() {
		System.out.println("1. somar");
		System.out.println("2. subtrair");
		System.out.println("3. multiplicar");
		System.out.println("4. Dividir");
	}
	
	public static double lerNumero(Scanner sc) {
		System.out.println("digite um número: ");
		return sc.nextDouble();
	}
	
	public static double soma(double n1, double n2) {
		return n1 + n2;
	}
	
	public static double subtracao(double n1, double n2) {
		return n1 - n2;
	}
	
	public static double multiplicacao(double n1, double n2) {
		return n1 * n2;
	}
	
	public static double divisao(double n1, double n2) {
		
		if(n2 == 0) {
			System.out.println("erro");
			return 0;
		} else
		
		return n1 / n2;
	}
	

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("selecione um apção: ");
		int op = sc.nextInt();
		
		double n1 = lerNumero(sc);
		double n2 = lerNumero(sc);
		
		switch(op) {
		case 1:
			System.out.println(n1 + " + "+ n2 + " = "+soma(n1,n2));
			break;
		
		
		case 2:
			System.out.println(n1 + " - "+ n2 + " = "+subtracao(n1,n2));
			break;
		
		case 3:
			System.out.println(n1 + " * "+ n2 + " = "+multiplicacao(n1,n2));
			break;
			
		case 4:
			System.out.println(n1 + " / "+ n2 + " = "+divisao(n1,n2));
			break;
		}
		

	}

}
