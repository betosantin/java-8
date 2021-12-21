package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "�mpar";
		
		Function<String, String> resultado = valor -> "O resultado �: " + valor;
		
		System.out.println(parOuImpar.andThen(resultado).apply(32));
		System.out.println(parOuImpar.andThen(resultado).apply(31));
		
		
		
	}

}
