package questao_03;

public class AnagramasTeste {

	Anagramas anagramas;

	public boolean testaAnagramas() {

		anagramas = new Anagramas();

		int resultadoEsperado = 3;

		int resultado = anagramas.verificaAnagramas("ifailuhkqq");
		
		if(resultado == resultadoEsperado) {
			return true;
		} else {
			return false;
		}

	}

}
