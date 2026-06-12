package lista;

import java.util.Scanner;

public class Exc3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade = sc.nextInt();
		
		if (idade >= 18) {
			System.out.println("você é maior de idade");
		}
		else{
			System.out.println("Você menor de idade");
		}

	}

}
