package Modulo2_Arrays;

public class Exemplo01 {

	public static void main(String[] args) {
		
		int score01 = 72;
		int score02 = 73;
		int score03 = 33;
		
		System.out.println("A m�dia � - FLOAT : \t" + (score01 + score02 + score03) / (float)3);
		
		System.out.println("A m�dia � - DOUBLE : \t" + (score01 + score02 + score03) / (double)3);
		
		System.out.println("A m�dia � - LONG : \t" + (score01 + score02 + score03) / (long)3);
		
		System.out.println("A m�dia � - INT : \t" + (score01 + score02 + score03) / (int)3);
		
		System.out.println("A m�dia � - 3.0 : \t" + (score01 + score02 + score03) / 3.0);
						
		//--------------------------------	
		
		int [] scores = {72, 73, 33};
		
		for (int scoresT : scores) {
			System.out.println(" - " + scoresT);
		}
		
		System.out.println(scores[1]);
		
		
	}

}
