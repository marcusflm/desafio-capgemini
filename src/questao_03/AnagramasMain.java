package questao_03;

public class AnagramasMain {

	public static void main(String[] args) {
		AnagramasTeste teste = new AnagramasTeste();
		boolean resultado;

		resultado = teste.testaAnagramas();
		System.out.println("Teste Anagramas: " + resultado);

	}

}
