package Modulo3_Algoritimos;

import java.util.Scanner;

public class Exercicio01_Plurality_01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Bem vindo eleitor(a) à cabine de votação");
		System.out.println("São candidatos: Alice, Bob, Charlie");
		System.out.println("Você também pode votar em branco, escrevendo: Branco");
		System.out.println("Digite abaixo o nome de seu candidato");

		String[] contabilidadeVotos = new String[6];

		for (int i = 0; i < contabilidadeVotos.length; i++) {

			System.out.print(i + 1 + " Voto: ");

			String voto = teclado.next();

			contabilidadeVotos[i] = voto;
			 
		}

		int votosAlice = 0;
		int votosBob = 0;
		int votosCharlie = 0;
		int votosNulos = 0;
		int votosBranco = 0;

		for (int i = 0; i < contabilidadeVotos.length; i++) {

			if (contabilidadeVotos[i].equalsIgnoreCase("Alice")) {

				votosAlice++;

			} else if (contabilidadeVotos[i].equalsIgnoreCase("Bob")) {

				votosBob++;

			} else if (contabilidadeVotos[i].equalsIgnoreCase("Charlie")) {

				votosCharlie++;

			} else if (contabilidadeVotos[i].equalsIgnoreCase("Branco")) {

				votosBranco++;

			} else
				votosNulos++;

		}

		System.out.println("Contabilidade da eleição:");
		System.out.println("Alice teve: \t" + votosAlice);
		System.out.println("Bob teve: \t" + votosBob);
		System.out.println("Charlie teve: \t" + votosCharlie);
		System.out.println("Votos em Branco: " + votosBranco);
		System.out.println("Votos nulos: \t" + votosNulos);

		if ((votosAlice > votosBob) && (votosAlice > votosCharlie)) {

			System.out.println("Alice foi a VENCEDORA com " + votosAlice);

		} else if ((votosBob > votosAlice) && (votosBob > votosCharlie)) {

			System.out.println("Bob foi o VENCEDOR com " + votosBob);

		} else if ((votosCharlie > votosAlice) && (votosCharlie > votosBob)) {

			System.out.println("Charlie foi o VENCEDOR com " + votosCharlie);

		} else if ((votosAlice == votosBob) && (votosAlice == votosCharlie)) {

			System.out.println("Alice, Bob e Charlie empataram com " + votosAlice + " votos cada");

		} else if (votosAlice == votosBob) {

			System.out.println("Alice e Bob empataram com " + votosAlice + " votos cada");

		} else if (votosAlice == votosCharlie) {

			System.out.println("Alice e Charlie empataram com " + votosAlice + " votos cada");

		} else if (votosBob == votosCharlie) {

			System.out.println("Bob e Charlie empataram com " + votosAlice + " votos cada");

		}

		System.out.println("------------------------------------");

		for (String contb : contabilidadeVotos) {
			System.out.print(contb + " - ");
		}

	}

}
