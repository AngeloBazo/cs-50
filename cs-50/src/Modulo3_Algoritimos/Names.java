package Modulo3_Algoritimos;

import java.util.Arrays;

public class Names {

	public static void main(String[] args) {

		String[] names = { "Joca", "Bill", "Chalie", "Fred", "George", "Ginny", "Percy", "Ron" };

		for (String name : names) {

			System.out.print(name + " - ");

		}
		System.out.println("\n---");
		Arrays.sort(names);

		for (String name : names) {

			System.out.print(name + " - ");

		}
		System.out.println("\n---");

		for (int i = 0; i < names.length; i++) {

			if (names[i].equalsIgnoreCase("Percy")) {

				System.out.println("Percy SIM está na posição [" + i + "] do array 'names' ordenado");
				break;
				
			} else System.out.println("Percy NÃO está na posição [" + i + "] do array 'names' ordenado");

		}

	}

}
