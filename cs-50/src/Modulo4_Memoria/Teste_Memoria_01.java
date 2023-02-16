package Modulo4_Memoria;

public class Teste_Memoria_01 {

	public static void main(String[] args) {

		int a = 10;
		int b = a;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = 20;

		System.out.println();

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("-----------------------------------");

		int xInt;

		int[] arrayX = { 2, 3, 7 };

		System.out.println(arrayX + " - " + arrayX[2]);

		int[] x1 = arrayX;

		xInt = arrayX[2];

		System.out.println(x1 + " - " + x1[2]);
		System.out.println("Variável xInt " + xInt);

		arrayX[2] = 9;

		System.out.println(x1 + " - " + x1[2]);
		System.out.println("Variável xInt " + xInt);

	}

}
