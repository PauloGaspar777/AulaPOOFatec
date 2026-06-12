package lista03_lacos;

import java.util.Scanner;

public class exc06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int positivo = 0;
		int negativo = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("informe o "+i+"° número ");
			int n = sc.nextInt();
			
			if(n < 0) {
				System.out.println("o número é negativo");
				negativo ++;
			}
			else if (n > 0) {
				System.out.println("O número é positivo");
				positivo ++;
			}
			else {
				System.out.println("Zero é neutro");
			}
		}
		
		System.out.println("positivos: "+positivo);
		System.out.println("negativos: "+negativo);
		sc.close();
	}

}
