package Modulo3_Algoritimos;

public class NamesAndNumbers2 {

	public static void main(String[] args) {

		ClassNamesAndNumbers contato01 = new ClassNamesAndNumbers();
		ClassNamesAndNumbers contato02 = new ClassNamesAndNumbers();
		ClassNamesAndNumbers contato03 = new ClassNamesAndNumbers("Jose", "19-9999-0000", "jose@kkkk", 1.95, 6666);

		contato01.name = "Angelo";
		contato01.telefone = "16-9999-9999";
		contato01.setSenha(5555);

		contato02.name = "Maria";
		contato02.telefone = "17-2222-2222";
		contato02.email = "maria@maria.com.br";
		contato02.altura = 1.75;

		ClassNamesAndNumbers[] arrayAgenda = new ClassNamesAndNumbers[3];

		arrayAgenda[0] = contato01;
		arrayAgenda[1] = contato02;
		arrayAgenda[2] = contato03;

		for (int i = 0; i < arrayAgenda.length; i++) {

			System.out.println(arrayAgenda[i].name + ": " + arrayAgenda[i].telefone);

			System.out.println("----------------");

		}

		for (int i = 0; i < arrayAgenda.length; i++) {

			System.out.println(arrayAgenda[i].toString());

			System.out.println("----------------");

		}

		System.out.println("----------------");
		System.out.println("----------------");

		for (int i = 0; i < arrayAgenda.length; i++) {

			if (arrayAgenda[i].name.equals("Angelo"))

				System.out.println(arrayAgenda[i].toString());

			System.out.println("----------------");

		}

		System.out.println("Senha de " + contato01.name + ": " + contato01.getSenha());

	}

}
