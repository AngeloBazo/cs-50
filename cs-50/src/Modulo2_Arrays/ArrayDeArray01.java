package Modulo2_Arrays;

public class ArrayDeArray01 {

	public static void main(String[] args) {

		String[] palavras = { "oi", "olá", "Angelo", "bazo" };

		for (int i = 0, plv = palavras.length; i < plv; i++) {

			System.out.println(palavras + " - " + palavras[i]);

		}

		System.out.println("--------------");

		String[][] palavras2 = { { "oi", "olá", "Angelo", "bazo" }, { "hi", "oo", "thuca", "pp" } };

		for (int i = 0, plv = palavras2.length; i < plv; i++) {

			for (int j = 0; j < 4; j++)

				System.out.println(palavras2 + " - " + palavras2[i][j] + " \t posição \t" + i + j);

		}

		System.out.println("--------------");

		int a = 0;
		int b = 0;
				
		for (int i = 0; i < 9; i++) {

			System.out.println(palavras2[a][b]);
	
			b++;

		}

	}

}
