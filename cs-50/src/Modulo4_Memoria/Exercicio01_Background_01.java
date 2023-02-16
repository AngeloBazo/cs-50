package Modulo4_Memoria;

public class Exercicio01_Background_01 {

	public static void main(String[] args) {

		String[][] imagem01 = new String[8][8];

		imagem01[0][0] = "   ";
		imagem01[0][1] = "   ";
		imagem01[0][2] = " x ";
		imagem01[0][3] = " x ";
		imagem01[0][4] = " x ";
		imagem01[0][5] = " x ";
		imagem01[0][6] = "   ";
		imagem01[0][7] = "   ";

		imagem01[1][0] = "   ";
		imagem01[1][1] = " x ";
		imagem01[1][2] = "   ";
		imagem01[1][3] = "   ";
		imagem01[1][4] = "   ";
		imagem01[1][5] = "   ";
		imagem01[1][6] = " x ";
		imagem01[1][7] = "   ";

		imagem01[2][0] = " x ";
		imagem01[2][1] = "   ";
		imagem01[2][2] = " 0 ";
		imagem01[2][3] = "   ";
		imagem01[2][4] = "   ";
		imagem01[2][5] = " 0 ";
		imagem01[2][6] = "   ";
		imagem01[2][7] = " x ";

		imagem01[3][0] = " x ";
		imagem01[3][1] = "   ";
		imagem01[3][2] = "   ";
		imagem01[3][3] = "   ";
		imagem01[3][4] = "> ";
		imagem01[3][5] = "   ";
		imagem01[3][6] = "   ";
		imagem01[3][7] = "  x ";

		imagem01[4][0] = " x ";
		imagem01[4][1] = "   ";
		imagem01[4][2] = "   ";
		imagem01[4][3] = "   ";
		imagem01[4][4] = "   ";
		imagem01[4][5] = "   ";
		imagem01[4][6] = "   ";
		imagem01[4][7] = " x ";

		imagem01[5][0] = " x ";
		imagem01[5][1] = "   ";
		imagem01[5][2] = "   ";
		imagem01[5][3] = "  _";
		imagem01[5][4] = "_ ";
		imagem01[5][5] = "hi!";
		imagem01[5][6] = "   ";
		imagem01[5][7] = "  x ";

		imagem01[6][0] = "   ";
		imagem01[6][1] = " x ";
		imagem01[6][2] = "   ";
		imagem01[6][3] = "   ";
		imagem01[6][4] = "   ";
		imagem01[6][5] = "   ";
		imagem01[6][6] = " x ";
		imagem01[6][7] = "   ";

		imagem01[7][0] = "   ";
		imagem01[7][1] = "   ";
		imagem01[7][2] = " x ";
		imagem01[7][3] = " x ";
		imagem01[7][4] = " x ";
		imagem01[7][5] = " x ";
		imagem01[7][6] = "   ";
		imagem01[7][7] = "   ";

		for (int i = 0; i < imagem01.length; i++) {

			for (int j = 0; j < imagem01[i].length; j++) {

				if (imagem01[i][j] != null) {
					System.out.print(imagem01[i][j]);
				}
			}
			System.out.println("");
		}

	}

}
