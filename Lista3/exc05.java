
package lista03_lacos;

import java.util.Scanner;

public class exc05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int n = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(n +" * "+ i + " = " + (n * i));
		}

	}

}
