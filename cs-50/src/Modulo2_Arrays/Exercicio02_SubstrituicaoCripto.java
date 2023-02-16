package Modulo2_Arrays;

import java.util.Scanner;

public class Exercicio02_SubstrituicaoCripto {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String textoSimples;
		String textoCifrado;
		String chaveSubstituicao;

		System.out.print("Digite o texto simples : ");

		textoSimples = teclado.nextLine();

		char[] charTextoSimples = textoSimples.toCharArray();
		
		System.out.println("--- ARRAY - charTextoSimples ----");

		for (int i = 0; i < charTextoSimples.length; i++) {

			System.out.println("Posição [" + i + "]  : " + charTextoSimples[i]);

		}

		System.out.println("------ARRAY - charChaveSubstituicao -------------");
		
		// nqxpomaftrhlzgecyjiuwskdvb
				
		System.out.print("Digite a chave de substituição (26 caracteres) : ");
		
		chaveSubstituicao = teclado.nextLine();

		char[] charChaveSubstituicao = chaveSubstituicao.toCharArray();

		for (char alfb = 'a'; alfb <= 'z'; alfb++) {
			
			System.out.println("Posição [" + alfb + "]  : " + charChaveSubstituicao[alfb]);
				
		}

		System.out.println("------ARRAY - alfabetoAZ -------------");
		
		char inicioA = 'a';
		
		char[] alfabetoAZ = new char[26];

		for (int i = 0; i < alfabetoAZ.length; i++) {

			alfabetoAZ[i] = inicioA;
			
			System.out.println("Posição [" + i + "]  : " + alfabetoAZ[i]);
			
			inicioA++;
		}

		System.out.println("------ texto cifrado ------");

		char[] arrayTextoCifrado = new char[charTextoSimples.length];

		for (int i = 0; i < arrayTextoCifrado.length; i++) {

			arrayTextoCifrado[i] = charChaveSubstituicao[i];

			System.out.println(arrayTextoCifrado[i]);

		}

		System.out.println("------ texto decifrado ------");

		char[] arrayTextoDecifrado = new char[charTextoSimples.length];

		for (int i = 0; i < arrayTextoCifrado.length; i++) {

			arrayTextoDecifrado[i] = 'a';

			System.out.println(arrayTextoDecifrado[i]);

		}

	}

}
