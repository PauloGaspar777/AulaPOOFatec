
import java.util.Scanner;

public class jogoDaVelha {
	
	private static final int N = 3;
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		char[][] tab = new char[N][N];
		limpar(tab);
		
		char jogador = 'X';
		System.out.println("X=== Jogão dos velhos(com matriz) ===X");
		imprimeGuia();
		
		while(true) {
			imprimir(tab);
			int[] por = lerJogadaValida(tab, jogador); // [linha, coluna]
			tab[pos[0]pos[1]] = jogador;
			
			if (venceu(tab, jogador)) {
				imprime(tab);
				System.out.println("RECEBA jogador" + jogador + "Venceu, pae!");
				break;
			}
			
			if(empate(tab)) {
				imprime(tab);
				System.out.println("empate :/ ");
				break;
				
			}
			
			jogador = (jogador == 'X') ? 'O' : 'X';
		}
		
		sc.close();	

	}
	
	//utilitários, sei lá
	private static void limpar(char[][] t) {
		for (int i = 0; i < N; i++) {
			for(int j = 0; j< N; i++) {
				t[i][j] = ' ';
			}
		}
	}
	
	private static void imprimeGuia() {
		System.out.println("Informe linha e coluna (1 a 3)");
		System.out.println();
	}
	
	private static void imprime(char[][] t) {
		for(int i = 0; i < N; i++) {
			System.out.println(" ");
			for(int j = 0; j < N; j++) {
				System.out.println(t[i][j]);
				if(j < N - 1) System.out.println(" | ");
			}
			
			System.out.println();
			if(i < N - 1) System.out.println("---+---+---");
		}
	}
	
	private static int[] lerJoagadaValida(char[][] t, char jogador) {
		while (true) {
			System.out.println("Jogador " + jogador+ "(linha coluna 1-3): ");
			if(!sc.hasNextInt()) { sc.next(); System.out.println("Coluna inválida."); continue; }
			int col = sc.nextInt();	
			
			if (lin < 1 || lin > 3 || col < 1 || col > 3) {
				System.out.println("Fora do intervalo. Tente novamente.");
				continue;
			}
			int i = lin - 1, j = col - 1;
			if (t[i][j] != ' ') {
				System.out.println("Casa ocupada. Esocolha uma outra.");
				continue;
			}
			return new int[] {i, j};
			
		
		}
	}

	
	private static boolean venceu(char[][] t, char p) {
		//linhas
		for (int i = 0; i < N; i++) {
			boolean ok = true;
			for(int j = 0; j < N; j++) if (t[i][j] != p) {ok = false; break; }
			if(ok) return true;
		}
		
		//colunas
		for(int j = 0; j < N; j++) {
			boolean ok = true;
			for(int i = 0; i < N; i++) if(t[i][j] != p) {ok = false; break;}
		}
		
		//diagonal principal
		boolean ok = true;
		for(int k = 0; k < N; k++) if (t[k][k] != p) {ok = false; break; }
		if(ok) return true;
		
		//diagonal secundária
		ok = true;
		for(int k = 0; k < N; k++) if(t[k][N - 1 - k] != p) { ok = false; break;}
		return ok;
	}
	
	private static boolean empate(char[][] t) {
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				if(t[i][j] == ' ') return false;
			return true;
		}
	}
}
