package questao_02;

public class SenhaTeste {
	Senha senha;

	public boolean testaSenha() {
		
		senha = new Senha();

		int resultadoEsperado = 3;

		int resultado = senha.verificaSenha("Ya3");

		if (resultado == resultadoEsperado) {
			return true;
		} else {
			return false;
		}

	}
}
