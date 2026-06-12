package lista;

import java.util.Scanner;

public class Exc15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("informe seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Informe a sua altura: ");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if(imc < 28.5) {
			System.out.println("abaixo do peso");
		}
		else if(imc >= 18.5 && imc <= 24.9) {
			System.out.println("Normal");
		}
		else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Sobrepeso");
		}
		else {
			System.out.println("obesidade");
		}
		
		sc.close();
	}

}
