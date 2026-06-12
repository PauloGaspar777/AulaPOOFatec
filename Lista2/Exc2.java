package lista;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a %2 == 0) {
			System.out.println("o número é par");
		}
		else {
			System.out.println("o número é ímpar");
		}
	}

}
