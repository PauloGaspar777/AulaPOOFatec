package lista05;

import java.util.Scanner;

public class exc04 {

	public static double lerNota(Scanner sc) {
		System.out.println("informe sua nota: ");
		return sc.nextDouble();
	}
	
	
	public static double mediaCalcular(double n1, double n2, double n3) {
		return (n1 + n2 + n3)/3;
	}
	
	public static String situacaoAnalise(double media) {
		if(media >= 6) {
			return "aprovado";
		}
		else if(media >= 4) {
			return "recuperação";
		}
		else {
			return "reprovado, bot";
		}
			
	}
	
	public static void resultado(double media, String situacao) {
		System.out.println("média: "+media);
		System.out.println("situação: "+situacao);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1 = lerNota(sc);
		double n2 = lerNota(sc);
		double n3 = lerNota(sc);
		
		double media = mediaCalcular(n1, n2, n3);
		String situacao = situacaoAnalise(media);
		
		resultado(media, situacao);

	}

}
