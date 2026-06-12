package lista04;

import java.util.Scanner;

public class exc21 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		char[][] jogo = new char[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				jogo[i][j] = '-';
			}			
			
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(jogo[i][j] + " ");
			}
			System.out.println(jogo);
		}

	}

}
