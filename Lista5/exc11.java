package lista05;

import java.util.Scanner;

import java.util.Random;

public class exc11 {
	
	public static int sortearNumero() {
		Random rd = new Random();
		return rd.nextInt(100) + 1;
	}
	
	public static int lerPalpite(Scanner sc) {
		System.out.println("Chute um número: ");
		return sc.nextInt();
	}
	
	public static boolean verificarAcerto(int palpite, int numeroSecreto) {
		return  palpite == numeroSecreto;
	}
	
	public static void mostrarDica(int palpite, int numeroSecreto) {
		if(palpite < numeroSecreto) {
			System.out.println("acaba esse semestre logo pelo amor de Deus");
		} else {
			System.out.println("tente um número menor");
		}
	}
	
	public static void mostrarVitoria(int tentativas) {
		System.out.println("voce acerotu em "+ tentativas + "tentativas");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numeroSecreto = sortearNumero();
		int tentativas = 0;
		boolean acertou = false;
		
		while (!acertou){
			int palpite = lerPalpite(sc);
			tentativas++;
			
			if(verificarAcerto(palpite, numeroSecreto)) {
				acertou = true;
				mostrarVitoria(tentativas);
			} else {
				mostrarDica(palpite, numeroSecreto);
			}
		}

	}

}
