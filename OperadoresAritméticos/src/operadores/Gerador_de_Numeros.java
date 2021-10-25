package operadores;

public class Gerador_de_Numeros {

	public static void main(String[] args) {
		double aleatorio = Math.random(); // random é um gerador de números entre 0 e 1
		int n = (int) (15 + aleatorio * (50-15));
		System.out.println(n);
		
		
	}

}
