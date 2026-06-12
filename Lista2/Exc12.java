package lista;

import java.util.Scanner;

public class Exc12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um número de 1 a 7");
		int n = sc.nextInt();
		
		switch (n) {
		
		case 1:
			System.out.println("1 -> domingo");
			break;
			
		case 2:
			System.out.println("2 -> segunda");
			break;
			
		case 3:
			System.out.println("3 -> terça");
			break;
			
		case 4:
			System.out.println("4 -> quarta");
			break;
			
		case 5:
			System.out.println("5 -> quinta");
			break;
			
		case 6:
			System.out.println("6 -> Sexta!");
			break;
			
		case 7:
			System.out.println("1 -> Sábadão");
			break;
			
			default:
				System.out.println("Acho que você não entendeu as intruções direito, parceirão >:( ");
		}
		
		sc.close();

	}

}
