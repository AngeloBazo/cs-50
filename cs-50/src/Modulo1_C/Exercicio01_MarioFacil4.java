package Modulo1_C;

import java.util.Scanner;

public class Exercicio01_MarioFacil4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int nDigitado;

		do {

			System.out.print("Digite a altura da piramide entre 1 e 8: ");

			nDigitado = teclado.nextInt();

			if (nDigitado == 1) {

				System.out.println("              # ");

			}

			else if (nDigitado == 2) {

				System.out.println("              # ");
				System.out.println("            # # ");

			}

			else if (nDigitado == 3) {

				System.out.println("              # ");
				System.out.println("            # # ");
				System.out.println("          # # # ");

			} else if (nDigitado == 4) {

				System.out.println("              # ");
				System.out.println("            # # ");
				System.out.println("          # # # ");
				System.out.println("        # # # # ");

			} else if (nDigitado == 5) {

				System.out.println("              # ");
				System.out.println("            # # ");
				System.out.println("          # # # ");
				System.out.println("        # # # # ");
				System.out.println("      # # # # # ");

			} else if (nDigitado == 6) {

				System.out.println("              # ");
				System.out.println("            # # ");
				System.out.println("          # # # ");
				System.out.println("        # # # # ");
				System.out.println("      # # # # # ");
				System.out.println("    # # # # # # ");

			} else if (nDigitado == 7) {

				System.out.println("              # ");
				System.out.println("            # # ");
				System.out.println("          # # # ");
				System.out.println("        # # # # ");
				System.out.println("      # # # # # ");
				System.out.println("    # # # # # # ");
				System.out.println("  # # # # # # # ");

			}

			else if (nDigitado == 8) {

				System.out.println("              # ");
				System.out.println("            # # ");
				System.out.println("          # # # ");
				System.out.println("        # # # # ");
				System.out.println("      # # # # # ");
				System.out.println("    # # # # # # ");
				System.out.println("  # # # # # # # ");
				System.out.println("# # # # # # # # ");

			}
			
		}  while (!(nDigitado >= 1 && nDigitado <= 8));
		
	}

}
