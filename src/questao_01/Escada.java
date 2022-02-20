package questao_01;

import java.util.Scanner;

public class Escada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String numeroDigitado = "";
		boolean ehNumeroInteiro = false;
		int numero;
		while (!ehNumeroInteiro) {
			System.out.printf("Digite um número inteiro: ");
			numeroDigitado = ler.next();
			ehNumeroInteiro = numeroDigitado.matches("-?\\d+");
			if (!ehNumeroInteiro) {
				System.out.println("Número inválido. Tente novamente.");
			}
		}
		numero=Integer.parseInt(numeroDigitado);
		ImprimeEscada(numero);
		ler.close();

	}

	private static void ImprimeEscada(int numeroDigitado) {
		int j;
		String asteriscos;

		for (int i = 1; i <= numeroDigitado; i++) {
			asteriscos = "";
			j = i;
			while (j >= 1) {
				asteriscos = asteriscos + "*";
				j--;
			}

			if (i < numeroDigitado) {
				System.out.printf("%" + numeroDigitado + "s%n", asteriscos);
			} else {
				System.out.print(asteriscos);
			}
		}

	}

}