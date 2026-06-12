package lista;

import java.util.Scanner;

public class Exc5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a >= 10 && a <=50) {
			System.out.println("o número está dentro do intervalo de 10 a 50");
		}
		
		else {
			System.out.println("o número está fora do intervalo");
		}
		
		sc.close();

	}

}
