package Modulo3_Algoritimos;

import java.util.Scanner;

public class NamesAndNumbers {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String[][] arrayPhoneBook = new String[3][3];

		arrayPhoneBook[0][0] = "Angelo";
		arrayPhoneBook[0][1] = "16-9999-8888";

		arrayPhoneBook[1][0] = "Maria";
		arrayPhoneBook[1][1] = "17-1111-2222";
		
		arrayPhoneBook[2][0] = "Josias";
		arrayPhoneBook[2][1] = "19-5555-5555";

		int encontradoInt = 1;

		do {

			System.out.println("Digite o nome que deseja procurar na agenda:");

			String nomeProcurado = teclado.nextLine();

			for (int i = 0; i < arrayPhoneBook.length; i++) {

				for (int j = 0; j < 2; j++) {

					if (arrayPhoneBook[i][j].equalsIgnoreCase(nomeProcurado)) {
						encontradoInt = 0;
						System.out.println("Nome: \t\t" + arrayPhoneBook[i][j]);
						System.out.println("Telefone: \t" + arrayPhoneBook[i][j + 1]);
						return;
					}

				}

			}

			System.out.println("Nome inexistente, tente novamente");

		} while (encontradoInt == 1);

	}

}
