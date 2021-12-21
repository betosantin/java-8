package lambdas;

import java.util.function.Predicate;

import lambdas.entidade.Produto;

public class Predicado {

	public static void main(String[] args) {

		Predicate<Produto> isCaro = prod -> (prod.getPreco() * (1 - prod.getDesconto())) >= 799.0;
		Predicate<Produto> isPromocao = prod -> prod.getDesconto() > 0;

		Produto produto = new Produto("Notebook", 3899.99, 0.15);
		Produto produto2 = new Produto("Escova", 750.0, 0.10);

		System.out.println(isCaro.test(produto));
		System.out.println(isCaro.test(produto2));
		
		System.out.println(isCaro.and(isPromocao).test(produto));
		System.out.println(isCaro.and(isPromocao).test(produto2));

	}

}
