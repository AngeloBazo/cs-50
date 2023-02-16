package Modulo1_C;

public class Exercicio02_MarioDesafio {

	public static void main(String[] args) {

		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 8; j++) {

				if (i + j < 8 - 1) {

					System.out.print(" . ");

				} else {

					System.out.print(" # ");

				}

			}

			for (int j = 0; j < i + 1; j++) { // qtd de colunas

				System.out.print(" # ");
			}

			System.out.println(" ");

		}

		
	}

}
