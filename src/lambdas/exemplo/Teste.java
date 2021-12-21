package lambdas.exemplo;

import lambdas.interfaces.Calculo;
import lambdas.interfaces.impl.Multiplicar;
import lambdas.interfaces.impl.Somar;

public class Teste {
 
	public static void main(String[] args) {
		Calculo calculo = new Somar();
		//5
		System.out.println(calculo.calcular(2, 3));
		
		calculo = new Multiplicar();
		//6
		System.out.println(calculo.calcular(2, 3));
	}
}
