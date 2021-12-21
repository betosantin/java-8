package lambdas.exemplo;

import lambdas.interfaces.Calculo;

public class Teste2 {

	public static void main(String[] args) {

		Calculo calculo = (x, y) -> {
			return x + y;
		};

		// 5
		System.out.println(calculo.calcular(2, 3));
		
		calculo = (x, y) -> {
			return x + y;
		};
		
		calculo = (x, y) -> x * y;
		// 6
		System.out.println(calculo.calcular(2, 3));
	}
}
