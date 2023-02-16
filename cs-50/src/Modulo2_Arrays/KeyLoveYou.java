package Modulo2_Arrays;

public class KeyLoveYou {

	public static void main(String[] args) {

		char[] palavra = { 'i', ' ', 'l', 'o', 'v', 'e', ' ', 'y', 'o', 'u' };

		int nplv = palavra.length;

		for (int i = 0; i < nplv; i++) {

			System.out.print(palavra[i] + "  ");

		}

		System.out.println("");
		for (int i = 0; i < nplv; i++) {
			palavra[i]+=13;
			System.out.print(palavra[i] + "  ");
		}

		System.out.println("");
		for (int i = 0; i < nplv; i++) {
			palavra[i]-=13;
			System.out.print(palavra[i] + "  ");
		}

	}

}
