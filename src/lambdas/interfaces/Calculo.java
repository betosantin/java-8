package lambdas.interfaces;

//Uma interface funcional apenas pode ter um �nico m�todo
@FunctionalInterface
public interface Calculo {
	
	public abstract double calcular(double a, double b);
	
}
