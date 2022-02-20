package questao_02;

public class Senha {

	public int verificaSenha(String senha) {

		int numcaracteres = 0, maiusculas = 0, minusculas = 0, numeros = 0, simbolos = 0;

		for (int i = 0; i < senha.length(); i++) {

			char c = senha.charAt(i);
			if (Character.isUpperCase(c)) {
				maiusculas++;
			} else if (Character.isLowerCase(c)) {
				minusculas++;
			} else if (Character.isDigit(c)) {
				numeros++;
			} else if (senha.contains("!@#$%^&*()-+")) {
				simbolos++;
			}
		}

		if (maiusculas == 0) {
			numcaracteres++;
		}

		if (minusculas == 0) {
			numcaracteres++;
		}

		if (numeros == 0) {
			numcaracteres++;
		}

		if (simbolos == 0) {
			numcaracteres++;
		}

		if ((senha.length() + numcaracteres) < 6) {
			numcaracteres = 6 - (senha.length());
		}

		return numcaracteres;
	}

}
