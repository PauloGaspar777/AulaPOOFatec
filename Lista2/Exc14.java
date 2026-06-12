package lista;

import java.util.Scanner;

public class Exc14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("informe o lado A do triângulo");
		int ladoA = sc.nextInt();
		
		System.out.println("informe o lado B do triângulo");
		int ladoB = sc.nextInt();
		
		System.out.println("informe o lado C do triângulo");
		int ladoC = sc.nextInt();
		
		if (ladoA == ladoB && ladoA == ladoC) {
			System.out.println("Triângulo equilátero");
		}
		else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
			System.out.println("Triângulo isósceles");
		}
		else {
			System.out.println("triângulo escaleno");
		}

	}

}
