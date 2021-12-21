package lambdas.exemplo;

import java.util.function.BinaryOperator;

public class Teste3 {

	public static void main(String[] args) {
		
		//java.util.function
		BinaryOperator<Double> calculo = (x, y) -> {
			return x + y;
		};

		// 5
		System.out.println(calculo.apply(2d, 3d));

	}
}
