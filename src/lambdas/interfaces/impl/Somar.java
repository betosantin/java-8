package lambdas.interfaces.impl;

import lambdas.interfaces.Calculo;

public class Somar implements Calculo {

	@Override
	public double calcular(double a, double b) {
		return a + b;
	}

}
