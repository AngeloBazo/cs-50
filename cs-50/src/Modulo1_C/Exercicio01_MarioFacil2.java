package Modulo1_C;

public class Exercicio01_MarioFacil2 {

	public static void main(String[] args) {

		String a = " a ";
		String b = " b ";
		String c = " c ";
		String d = " d ";
		String e = " . ";
		String f = " . ";
		String g = " . ";
		String h = " . ";

		String ia = " # ";

		for (int i = 0; i < 8; i++) { // qtd de linhas

			for (int p = 0; p < 1; p++) { // qtd de colunas

				System.out.print(a);

				for (int j = 0; j < 1; j++) { // qtd de colunas

					System.out.print(b);

					for (int k = 0; k < 1; k++) { // qtd de colunas

						System.out.print(c);

						for (int l = 0; l < 1; l++) { // qtd de colunas

							System.out.print(d);

							d = ia;
							
							

						}

						
						
					}

					
					
				}
				
				
			}

			
			System.out.println(" (quebra) ");
		}

	}

}
