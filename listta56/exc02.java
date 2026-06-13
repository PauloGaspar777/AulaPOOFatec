package lista05;

public class exc02 {
	
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static void mostrarResultado(int resultado) {
		System.out.println("resultado = "+resultado);
	}

	public static void main(String[] args) {
		int resultado = soma(10, 20);
		mostrarResultado(resultado);
	}

}
