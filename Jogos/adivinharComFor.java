import java.util.Scanner;

public class adivinharComFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numeroSecreto = (int)(Math.random() * 100) + 1;
		boolean acertou = false;
		
		System.out.println("Jogo da adivinhação (FOR) ");
		System.out.println("Adivinhe o número de 1 a 100 (você tem 10 tentativas): ");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("tentativas "+ i + ": ");
			int palpite = sc.nextInt();
			
			if(palpite == numeroSecreto) {
				System.out.println("Parabén tio, você acertou! /" + i +" tentivas");
				acertou = true;
				break;
			}
			else if(palpite > numeroSecreto) {
				System.out.println("o número é menor");
			}
			else {
				System.out.println("o número é maior");
			}
		}
		
		if(!acertou) {
			System.out.println("Suas tentativas acabaram cowboy... hora de enfrentar seu destino deletar(C: System32)");
		}
		
		sc.close();		

	}

}
