package lista05;

import java.util.Scanner;

public class exc03 {

	public static int ler(Scanner sc) {
		System.out.println("Digite um número: ");
		return sc.nextInt();
	}
	
	public static boolean verPar(int num) {
		return num % 2 == 0;
	}
	
	public static void resultado(boolean par) {
		if (par) {
			System.out.println("número par");
		} else {
			System.out.println("número ímpar");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = ler(sc);
		boolean par = verPar(num);
		resultado(par);

	}

}
