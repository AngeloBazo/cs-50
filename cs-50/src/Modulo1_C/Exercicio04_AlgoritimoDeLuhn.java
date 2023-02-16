package Modulo1_C;

public class Exercicio04_AlgoritimoDeLuhn {

	public static void main(String[] args) {

		long number1 = 4003600000000014L; 
				
		String number = String.valueOf(number1);

		char[] digits1 = number.toCharArray();

		System.out.println("-------- digits1 ---------------");
		for (int i = 0; i < digits1.length; i++) {
			System.out.println("Posição " + i + " : " + digits1[i]);
		}

		// ---------------------------------------------------

		char[] nPares = new char[digits1.length];
		char[] nImpares = new char[digits1.length];

		for (int i = 0; i < digits1.length; i++) {

			if (i % 2 == 0) {
				nPares[i] = digits1[i];
				nImpares[i] = 'x';

			} else {
				nImpares[i] = digits1[i];
				nPares[i] = 'x';
			}

		}

		System.out.println("-------- nPares ---------------");

		for (int i = 0; i < nPares.length; i++) {

			System.out.println("Posição " + i + " : " + nPares[i]);

		}

		System.out.println("-------- nImpares ---------------");

		for (int i = 0; i < nImpares.length; i++) {
			System.out.println("Posição " + i + " : " + nImpares[i]);

		}

		int somaNparesInt = 0;
		int somaDigitoProduto = 0;

		// cria um array de int para os n pares
		int nParesInt[] = new int[nPares.length];

		// converter char p/ int
		for (int i = 0; i < nPares.length; i++) {

			nParesInt[i] = Character.getNumericValue(nPares[i]);

			if (nParesInt[i] != 33) {

				nParesInt[i] *= 2;
				somaNparesInt += nParesInt[i];

				if (nParesInt[i] > 9) {

					somaDigitoProduto += nParesInt[i] / 10;

					somaDigitoProduto += nParesInt[i] - 10;

				} else {

					somaDigitoProduto += nParesInt[i];

				}

			}

		}

		int somaNimpares = 0;

		// cria um array de int para os n impares
		int nImparesInt[] = new int[nImpares.length];

		// converter char p/ int
		for (int i = 0; i < nImpares.length; i++) {

			nImparesInt[i] = Character.getNumericValue(nImpares[i]);

			if (nImparesInt[i] != 33) {

				somaNimpares += nImparesInt[i];
			}
		}

		System.out.println("-------- nPares - int x 2 ---------------");

		for (int i = 0; i < nParesInt.length; i++) {

			System.out.println("Posição " + i + " : " + nParesInt[i]);

		}

		System.out.println("-------- nImpares - int ---------------");

		for (int i = 0; i < nImparesInt.length; i++) {

			System.out.println("Posição " + i + " : " + nImparesInt[i]);

		}

		System.out.println("--------------------");
		System.out.println("somaNparesInt : " + somaNparesInt);
		System.out.println("--------------------");

		System.out.println("--------------------");
		System.out.println("soma Digitos dos produtos : " + somaDigitoProduto);
		System.out.println("--------------------");

		System.out.println("--------------------");
		System.out.println("soma Digitos dos produtos imp : " + somaNimpares);
		System.out.println("--------------------");

		System.out.println("--------------------");
		System.out.println("somas : " + (somaNimpares + somaDigitoProduto));
		System.out.println("--------------------");

		System.out.println("---------!!!!!!-----------");

		if ((somaNimpares + somaDigitoProduto) % 10 == 0) {

			System.out.println("CARTÃO DE CRÉDITO VÁLIDO");
		} else
			System.out.println("CARTÃO DE CRÉDITO INVÁLIDO");

		System.out.println("---------!!!!!!-----------");
	}

}
