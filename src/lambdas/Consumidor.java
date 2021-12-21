package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import lambdas.entidade.Produto;

public class Consumidor {

	public static void main(String[] args) {

		Consumer<Produto> imprimir = valor -> System.out.println(valor.getNome());

		Produto p1 = new Produto("Notebook", 3899.99, 0.15);
		Produto p2 = new Produto("Escova", 750.0, 0.10);
		Produto p3 = new Produto("Celular", 3399.99, 0.15);
		Produto p4 = new Produto("Mouse", 29.49, 0.10);
		Produto p5 = new Produto("Teclado", 85.99, 0.15);
		Produto p6 = new Produto("Relógio", 1999.99, 0.10);

		imprimir.accept(p1);
		imprimir.accept(p2);

		System.out.println(" ** Usando consumer em lista **");
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		produtos.forEach(imprimir);

		produtos.forEach(p -> System.out.println(p.getPreco()));
		
		//Cuidado, vai executar o toString() da entidade
		produtos.forEach(System.out::println);
	}

}
