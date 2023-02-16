package Modulo2_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio00_Legabilidade01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		String textoDigitado;
		
		System.out.println("Digite o texto : ");
		
		//textoDigitado = teclado.nextLine();
		
		textoDigitado = "a; a; a; a a a a a a a a a a aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa;";
		System.out.println(textoDigitado);
		
		//textoDigitado = "Congratulations! Today is your day. You're off Great Places! You're off and away!";
		
		String [] palavrasDoTexto = textoDigitado.split("\\s+");
		
		System.out.println("QTD de palavras do texto: \t\t" + palavrasDoTexto.length);

		int stringLength = textoDigitado.length();
		
		System.out.println("QTD de letras do texto c/ espaço: \t" + stringLength);
		
		int stringLengthSemEspaco = textoDigitado.replace(" ","").length();
		System.out.println("QTD de letras do texto s/ espaço: \t" + stringLengthSemEspaco);
		
		String [] qtdSentencas = textoDigitado.split("[.;!?]");
		
		System.out.println("QTD de sentenças terminadas c/ [.;!?]: \t" + qtdSentencas.length);
		
		double mediaLetrasPor100Palavras = (double)stringLengthSemEspaco / (double)palavrasDoTexto.length * 100;
		
		System.out.println("Media Letras Por 100 Palavras \t\t" + mediaLetrasPor100Palavras);
		
		double mediaSentencaPor100Palavras = (double)qtdSentencas.length / (double)palavrasDoTexto.length * 100;  
		
		System.out.println("Media Sentenca Por 100 Palavras \t" + mediaSentencaPor100Palavras);
		
		double indiceColeman = (0.0588 * mediaLetrasPor100Palavras) - (0.296 * mediaSentencaPor100Palavras) - 15.8;   
		
		System.out.println("Índice Coleman : \t\t " + (int)indiceColeman );
		
		// 
		
	}

}
