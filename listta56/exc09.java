package lista05;

import java.util.Scanner;

public class exc09 {

	public static void menu() {
		System.out.println("===banco zika===");
		System.out.println("1. depoistar");
		System.out.println("2. sacar");
		System.out.println("3. consultar saldo");
	}
	
	public static double depositar(double saldo, double valor) {
		return saldo + valor;
	}
	
	public static double sacar(double saldo, double saque) {
		if(saque > saldo) {
			System.out.println("saldo insuficiente");
			return saldo;
		}
		return saldo - saque;
	}
	
	public static void consultarSaldo(double saldo) {
		System.out.println("saldo: "+saldo);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double saldo = 2000;
		
		menu();
		System.out.println("selecione uma opção: ");
		int op = sc.nextInt();
		
		switch (op) {
		
		case 1:
			System.out.println("depositar: ");
			double valor = sc.nextDouble();
			depositar(saldo, valor);
			break;
			
		case 2:
			System.out.println("Saque: ");
			double saque = sc.nextDouble();
			sacar(saldo, saque);
			
		case 3:
			consultarSaldo(saldo);
		}
	}

}
