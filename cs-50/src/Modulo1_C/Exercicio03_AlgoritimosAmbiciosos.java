package Modulo1_C;

public class Exercicio03_AlgoritimosAmbiciosos {

	public static void main(String[] args) {

		int a = 25;
		int b = 10;
		int c = 5;
		int d = 1;

		int valorEntrada = 978; // em centavos

		int etapas = 0;
		int moeda25 = 0;
		int moeda10 = 0;
		int moeda05 = 0;
		int moeda01 = 0;
		
		System.out.println((double)valorEntrada /100 + " - Valor entrada (reais)");
		System.out.println("");
		System.out.println(valorEntrada + " - Valor entrada (centavos)");
		

		while (valorEntrada >= a) {

			valorEntrada -= a;
			etapas++;
			moeda25++;

			System.out.println(valorEntrada);
		}

		while (valorEntrada >= b) {

			valorEntrada -= b;
			etapas++;
			moeda10++;
			System.out.println(valorEntrada);
		}

		while (valorEntrada >= c) {

			valorEntrada -= c;
			etapas++;
			moeda05++;
			System.out.println(valorEntrada);
		}

		while (valorEntrada >= d) {

			valorEntrada -= d;
			etapas++;
			moeda01++;
			System.out.println(valorEntrada);
		}

		System.out.println("Etapas necessárias : " + etapas);
		System.out.println("Moedas 0,25 : " + moeda25);
		System.out.println("Moedas 0,10 : " + moeda10);
		System.out.println("Moedas 0,05 : " + moeda05);
		System.out.println("Moedas 0,01 : " + moeda01);
}
}
