package lista04;

import java.util.Scanner;

public class exc10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[10];
		
		for(int i = 0; i < n.length; i ++ ) {
			System.out.println("diga um número: ");
			n[i] = sc.nextInt();
		}
		
		for(int j = 0; j < n.length; j++) {
			boolean repetido = false;
			
			for(int x = 0; x < n.length; x++) {
				if(n[j] == n[x]) repetido = true;
					
				
				
				}
			
			if(!repetido) {
				System.out.println(n[j]);
			}
		}
		
		sc.close();

	}

}
