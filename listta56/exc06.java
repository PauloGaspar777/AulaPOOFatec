package lista05;

import java.util.Scanner;

public class exc06 {

	public static int lerNum(Scanner sc) {
		System.out.println("digite um número: ");
		return sc.nextInt();
	}
	
	public static void viewLinha(int num, int mult) {
		int resultado = num * mult;
		System.out.println(num + " * "+mult + " = " +resultado);
	}
	
	public static void viewTabuada(int num) {
		for(int i = 1; i <= 10; i++) {
			viewLinha(num, i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = lerNum(sc);
		viewTabuada(num);

	}

}
