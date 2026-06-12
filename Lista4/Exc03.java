package lista04;

import java.util.Scanner;

public class Exc03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] n = new int[8];
		
		for(int i = 0; i <= n.length; i++) {
			System.out.println("informe um número: ");
			n[i] = sc.nextInt();
		}
		
		int maior = n[0];
		int menor = n[0];
		
		for(int i = 1; i < n.length; i ++) {
			if(n[i] > maior) maior = n[i];
			if(n[i] < menor) menor = n[i];
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);

	}

}
