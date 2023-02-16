package Modulo2_Arrays;

public class String_S {

	public static void main(String[] args) {

		String[] s = { "hi!", "oi" };

		System.out.println(s[0] + s[1]);

		//for (int i = 0; s[0] == "hi!"; i++) {
		
		//int tamanhoString = s.length;

		for (int i = 0, tamanhoString = s.length; i < tamanhoString; i++) {
			
			System.out.println(i + " - loop - " + s[i]);

			//if (i == 10) {

//				s[0] = "FIM";

//			}
	 		
		}
		
		System.out.println(s[0]);
		
		//System.out.println("Tamanho da String :" + tamanhoString);
		
	}

}
