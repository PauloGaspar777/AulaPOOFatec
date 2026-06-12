package lista05;

public class exc07 {

	public static void mostrarNumeros() {
		System.out.println("contando...");
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
	
	public static void mostrarPares() {
		System.out.println("pares: ");
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void mostrarImpares() {
		System.out.println("Ímpares: ");
		for(int i = 1; i <= 100; i++)
			if(i % 2 != 0) {
				System.out.println(i);
			}
	}
	
	
	public static void main(String[] args) {
		
		mostrarNumeros();
		mostrarPares();
		mostrarImpares();

	}

}
