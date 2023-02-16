package Modulo2_Arrays;

import java.util.Scanner;

public class Exercicio02_SubstrituicaoCripto2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String textoSimples;
		String textoCifrado;
		String chaveSubstituicao;

		System.out.print("Digite o texto simples : angelo \n");

		// textoSimples = teclado.nextLine();

		textoSimples = "hello-angeloluizfeijobazo-";

		char[] charTextoSimples = textoSimples.toCharArray();

		System.out.println("--- ARRAY - charTextoSimples ----");

		for (int i = 0; i < charTextoSimples.length; i++) {

			System.out.println("Posição [" + i + "]  : " + charTextoSimples[i]);

		}

		System.out.println("------ARRAY - charChaveSubstituicao -------------");

		// nqxpomaftrhlzgecyjiuwskdvb

		System.out.print("Digite a chave de substituição (26 caracteres) : nqxpomaftrhlzgecyjiuwskdvb \n");

		// chaveSubstituicao = teclado.nextLine();

		chaveSubstituicao = "nqxpomaftrhlzgecyjiuwskdvb";

		char[] charChaveSubstituicao = chaveSubstituicao.toCharArray();

		for (int i = 0; i < charTextoSimples.length; i++) {

			System.out.println("Posição [" + i + "]  : " + charChaveSubstituicao[i]);

		}

		System.out.println("------ARRAY - alfabetoAZ -------------");

		char inicioA = 'a';

		char[] alfabetoAZ = new char[charTextoSimples.length];

		for (int i = 0; i < charTextoSimples.length; i++) {

			alfabetoAZ[i] = inicioA;

			System.out.println("Posição [" + i + "]  : " + alfabetoAZ[i]);

			inicioA++;
		}

		System.out.println("------ texto cifrado ------");

		char[] arrayTextoCifrado = new char[charTextoSimples.length];

		for (int i = 0; i < 26; i++) {

			for (int k = 0; k < 26; k++) {

				if (charTextoSimples[k] == alfabetoAZ[i]) {

					arrayTextoCifrado[k] = charChaveSubstituicao[i];

				} 
								
			}
			
		}

		for (int i = 0; i < charTextoSimples.length; i++) {

			System.out.println("Posição [" + i + "] : " + arrayTextoCifrado[i]);
		}

		System.out.println("----------------------------------");
		System.out.println("FIM");

	}
}
