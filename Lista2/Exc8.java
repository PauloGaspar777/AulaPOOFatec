package lista;

import java.util.Scanner;


public class Exc8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("o primeiro número é o maior");
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("o segundo número é o maior");
		}
		else if(n3 > n1 && n3 > n2) {
			System.out.println("o terceiro número é o maior");
		}
		
		sc.close();

	}

}
