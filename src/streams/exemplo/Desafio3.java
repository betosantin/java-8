package streams.exemplo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import streams.entidade.Produto;

public class Desafio3 {

	public static void main(String[] args) {

		Produto p1 = new Produto("Lapis", 1.99, 0.12, 19.90);
		Produto p2 = new Produto("Mochila", 249.00, 0.0, 0.0);
		Produto p3 = new Produto("Cardeno", 9.95, 0.0, 35.90);
		Produto p4 = new Produto("Caneta", 2.99, 0.15, 22.99);
		Produto p5 = new Produto("Régua", 5.90, 0.12, 0.0);
		Produto p6 = new Produto("Apontador", 0.75, 0.09, 19.90);
		Produto p7 = new Produto("Marcador", 4.99, 0.15, 0.0);
		Produto p8 = new Produto("Triângulo", 2.99, 0.15, 0.0);
		Produto p9 = new Produto("Esquadro", 3.99, 0.18, 19.90);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9);
		
		Predicate<Produto> superPromocao = p -> p.getDesconto() >= 0.15;
		Predicate<Produto> freteGratis = p -> p.getFrete().equals(0d);
		Predicate<Produto> precoRelevante = p -> p.getPreco() >= 1.0;
		
		Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.getNome() + " por R$ " + p.getPreco();
		
		produtos.stream()
		.filter(precoRelevante)
		.filter(freteGratis)
		.filter(superPromocao)
		.map(chamadaPromocional)
		.forEach(System.out::println);
		
		
	}

}
