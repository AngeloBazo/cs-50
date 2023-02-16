package Modulo3_Algoritimos;

import java.util.Arrays;

public class Ordenacao01 {

	public static void main(String[] args) {

		int[] numeros = { 9, 5, 2, 1, 3 };

		for (int num : numeros) {
			System.out.print(num + " - ");
		}
	
		
		System.out.println("\n-------------------");

		Arrays.sort(numeros);

		for (int num : numeros) {
			System.out.print(num + " - ");
		}

		System.out.println("\n-------------------");

System.out.println("\n-------------------");
		
		System.out.println(Arrays.binarySearch(numeros, 9));
		

	}

}
