package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {

		UnaryOperator<Integer> somaDois = n -> n + 2;
		UnaryOperator<Integer> multiplicaDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;

		int resultado = somaDois.andThen(multiplicaDois).andThen(aoQuadrado).apply(3);
		//100
		System.out.println(resultado);
		
		resultado = aoQuadrado.andThen(somaDois).andThen(multiplicaDois).apply(3);
		//22
		System.out.println(resultado);
	}

}
