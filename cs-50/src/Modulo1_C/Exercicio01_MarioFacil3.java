package Modulo1_C;

public class Exercicio01_MarioFacil3 {

	public static void main(String[] args) {

		String[][] matrizA = new String[8][8];

		for (int i = 0; i < matrizA.length; i++) {

			for (int j = 0; j < matrizA[i].length; j++) {

				matrizA[i][j] = " . ";

			}

			matrizA[1][7] = " # ";
		}
		

		for (int i = 0; i < matrizA.length; i++) {

			for (int j = 0; j < matrizA[i].length; j++) {

				System.out.print(matrizA[i][j]);

			}

			System.out.println(" ");
		}


	
	
	
	}

}
