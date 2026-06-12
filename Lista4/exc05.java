package lista04;

import java.util.Scanner;

public class exc05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] n = new int[10];
		
		for(int i = 0; i < n.length; i++) {
			System.out.println("Informe um número: ");
			n[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n.length; i++) {
			
			if(n[i] % 2 == 0) {
				System.out.println(n[i] + " é par");
			}
			else {
				System.out.println(n[i]+ " é ímpar");
			}
		}

	}

}
