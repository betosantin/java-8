package lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import lambdas.entidade.Produto;

public class Desafio {

	public static void main(String[] args) {

		Produto produto = new Produto("Notebook", 3899.99, 0.10);

		Function<Produto, Double> precoReal = prod -> (prod.getPreco() * (1 - prod.getDesconto()));
		UnaryOperator<Double> valorImposto = preco -> preco >= 2500d ? (preco * 1.085) : preco;
		UnaryOperator<Double> valorFrete = preco -> preco >= 3000d ? preco + 100d : preco + 50d;
		UnaryOperator<Double> arredondamento = preco -> new BigDecimal(preco).setScale(2, RoundingMode.HALF_UP).doubleValue();
		Function<Double, String> formatador = preco -> NumberFormat.getCurrencyInstance().format(preco); 
		
		/*
		 * 1. Calcular o preço real (com desconto) 
		 * 2. Imposto: Se preço real > 2500
		 * (8,5%), caso contrário isento) 
		 * 3. Frete: Maior igual que 3000,00 > R$ 100,00. Menor que 3000 > R$ 50,00 
		 * 4. Arredondamento pra cima: Deixar só 2 casas decimais e somar todo o tributo + frete
		 * 5. Formatar preço final: R$ 1111,33
		 * 
		 */

		Double preco = precoReal.apply(produto);
		Double comImposto = valorImposto.apply(preco);
		Double ComImpostFrete = valorFrete.apply(comImposto);
		
		System.out.println("Preço: " + preco);
		System.out.println("Com Imposto: " + comImposto );
		System.out.println("Com Frete: " + ComImpostFrete);
		System.out.println("Valor final: " + ComImpostFrete);
		System.out.println("Fromatado: " + formatador.apply(ComImpostFrete));
		
		
		System.out.println("Preço Final: " + precoReal
				.andThen(valorImposto)
				.andThen(valorFrete)
				.andThen(arredondamento)
				.andThen(formatador)
				.apply(produto));
		
	}
}
