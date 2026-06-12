package lista;

import java.util.Scanner;

public class Exc11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("insira um valor: ");
		double a = sc.nextDouble();
		
		System.out.println("insira um segundo valor: ");
		double b = sc.nextDouble();
		
		System.out.println("Escolha uma opreação: (+, -, *, /) ");
		char op = sc.next().charAt(0);
		
		switch (op) {
		
		case '+':
			System.out.println("Resultado: " + (a + b));
			break;
			
		case '-':
			System.out.println("Resultado" + (a - b));
			break;
			
		case '*':
			System.out.println("Resultado: " + (a * b));
			break;
			
		case '/':
			if(b != 0) {
				System.out.println("Resultado "+ (a / b));
			}
			else {
				System.out.println("não é possível dividir por 0, mané");
			}
			break;
			
			default:
				System.out.println("operação inválida, vacilão");
		}
		
		sc.close();

	}

}
