package lista04;

import java.util.Scanner;

public class exc07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] n = new int[10];
		boolean identificado = false;
		
		for(int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		
		int boglers = sc.nextInt();
		
		for(int i = 0; i < n.length; i++) {
			if(n[i] == boglers) {
				identificado = true;
			}
		}
		System.out.println(identificado);
	}

}
