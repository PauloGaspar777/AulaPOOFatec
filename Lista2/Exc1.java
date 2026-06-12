package lista;

import java.util.Scanner;

public class Exc1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a < 0) {
		System.out.println("o Número é negativo");
		}
		else if (a >0) {
			System.out.println("o número é positivo");
		}
		else {
			System.out.println("o número é zero");
		}

	}

}
