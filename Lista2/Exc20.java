package lista;

import java.util.Scanner;

public class Exc20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("insira um valor: ");
		double valor = sc.nextDouble();
		double imposto;
		
		if(valor <= 2000) {
			System.out.println("Isento deimposto");
		}
		else if(valor > 2000 && valor <+ 5000) {
			imposto = (valor/100) * 10;
			System.out.println("Imposto: "+ imposto);
			System.out.println("Renda total: "+ (valor - imposto));
		}
		else {
			imposto = (valor/100)*20;
			System.out.println("imposto: "+imposto);
			System.out.println("Renda total: "+(valor - imposto));
		}
		
		sc.close();

	}

}
