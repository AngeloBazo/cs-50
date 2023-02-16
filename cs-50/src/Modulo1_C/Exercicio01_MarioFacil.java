package Modulo1_C;

public class Exercicio01_MarioFacil {

	public static void main(String[] args) {

		System.out.println("------------------------ i (linhas):");

		for (int i = 0; i < 8; i++) { // qtd de linhas

			for (int j = 8; j > i; j--) { // qtd de colunas

				System.out.print(i + " ");

			}

			System.out.println(" ");

		}

		System.out.println("------------------------ j (colunas):");

		for (int i = 0; i < 8; i++) { // qtd de linhas

			for (int j = 0; j < i; j++) { // qtd de colunas

				System.out.print(j + " ");

			}

			System.out.println(" ");

		}

		System.out.println("------------------------ k (cópia):");

		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 8; j++) {

				if (i + j < 8-1) {
					
					System.out.print(" . ");
					
				} else {
					
					System.out.print(" # ");
				
				}

			}

			System.out.println(" ");

		}

		System.out.println("------------------------ p (cópia):");

		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 8; j++) {

				if (i + j < 8 - 1) {

					System.out.print(" " + i);
					
				} else {

					System.out.print(" " + j);

				}

			}

			System.out.println(" ");

		}

	}

}
