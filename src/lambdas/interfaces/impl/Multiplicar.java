package lambdas.interfaces.impl;

import lambdas.interfaces.Calculo;

public class Multiplicar implements Calculo{

	@Override
	public double calcular(double a, double b) {
		return a * b;
	}

}
