package lista03_lacos;

import java.util.Scanner;

public class exc09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fatorial = 1;
		System.out.println("informe um número");
		int n = sc.nextInt();
		
		for(int i = n; i >= 1; i--) {
			fatorial *= i;
		}
		
		System.out.println(n+"! = "+ fatorial);

	}

}
