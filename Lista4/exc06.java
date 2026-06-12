package lista04;

import java.util.Scanner;

public class exc06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];
		
		for(int i = 0; i < n.length; i ++) {
			System.out.println("informe um número; ");
			n[i] = sc.nextInt();
		}
		
		for(int i = n.length - 1; i >= 0; i--) {
			System.out.println(n[i]);
		}

	}

}
