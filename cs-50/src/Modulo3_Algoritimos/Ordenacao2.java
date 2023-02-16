package Modulo3_Algoritimos;

public class Ordenacao2 {

	public static void main(String[] args) {

		int[] numbers = { 4, 6, 8, 2, 7, 5, 0 };

		for (int i = 0; i < 7; i++) {
			
			if (numbers[i] == 0) {
				System.out.println(i + " - Found");
				return; // causa o encerramento imediato de um método void

			} else System.out.println(i + " - Not Found");

			
		}

	}

}
