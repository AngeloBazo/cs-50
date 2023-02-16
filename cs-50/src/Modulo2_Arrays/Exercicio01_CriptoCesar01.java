package Modulo2_Arrays;

import java.util.Arrays;

public class Exercicio01_CriptoCesar01 {

	public static void main(String[] args) {

		String texto = "H,e,l,l,o, ,W,o,r,l,d";

		String[] textoSeparado = texto.split(",");

		System.out.println(textoSeparado[0]);
		System.out.println(textoSeparado[1]);
		System.out.println(textoSeparado[2]);
		
		System.out.println("----------------------");

		char[] textoEmChar = new char[textoSeparado.length];

		for (int i = 0; i < textoEmChar.length; i++) {

			textoEmChar[i] = textoSeparado[i].charAt(0);
			System.out.println(textoEmChar[i]);
		}

		System.out.println("------CIFRADO + 13 key----------------");

		for (int i = 0; i < textoEmChar.length; i++) {

			textoEmChar[i] +=13;
			
			System.out.print(textoEmChar[i]);
		}

		System.out.println(" ");

		System.out.println("------DECIFRADO----------------");

		for (int i = 0; i < textoEmChar.length; i++) {

			textoEmChar[i] -=13;
			
			System.out.print(textoEmChar[i]);
		}

		
		
		
	}

}
