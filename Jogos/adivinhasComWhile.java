import java.util.Scanner;

public class adivinhasComWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroSecreto = (int)(Math.random() * 100) + 1;
		int tentativas = 0;
		int maxTentativas = 10;
		boolean acertou = false;
		
		System.out.println("Adivinhe o número com (While)");
		
		while(tentativas < maxTentativas && !acertou) {
			System.out.println("tentativas "+(tentativas+1)+": ");
			int palpite = sc.nextInt();
			tentativas++;
			
			if(palpite == numeroSecreto) {
				System.out.println("Parabén tio, você acertou! /" + tentativas +" tentivas");
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