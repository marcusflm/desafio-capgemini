package questao_03;

import java.util.Arrays;

public class Anagramas {

	public int verificaAnagramas(String palavraDigitada) {
				
		String ana1, ana2;
		boolean ehAnagrama = false;
		int totalCaracteres = 0, totalAnagramas = 0;
				
		totalCaracteres = palavraDigitada.length();
		for (int i = 0; i < totalCaracteres; i++) {
			for (int j = 1; j < totalCaracteres; j++) {
				if (i + j >= totalCaracteres)
					continue;
				ana1 = palavraDigitada.substring(i, i + j);
				for (int k = i + 1; k <= totalCaracteres - j; k++) {
					ana2 = palavraDigitada.substring(k, k + j);
					ehAnagrama = verificaSeEhAnagrama(ana1, ana2);
					if (ehAnagrama) {
						totalAnagramas++;
					}
				}
			}
		}
		
		return totalAnagramas;
	}

	private static boolean verificaSeEhAnagrama(String ana1, String ana2) {
		if (ana1.length() != ana2.length())
			return false;
		String[] s1 = null, s2 = null;
		s1 = ana1.split("");
		s2 = ana2.split("");
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		for (int x = 0; x < ana1.length(); x++) {

			if (!(s1[x].equals(s2[x]))) {
				return false;
			}
		}
//		System.out.printf(ana1);  //tirar o comentário dessas
//		System.out.printf(" ");   //linhas caso queira saber
//		System.out.println(ana2); //quais são os pares de anagramas
		return true;
	}
}
