package questao_02;

public class SenhaMain {

	public static void main(String[] args) {
		
		SenhaTeste teste = new SenhaTeste();
		boolean resultado;
		
		resultado = teste.testaSenha();
		System.out.println("Teste Senha: " + resultado);

	}

}
