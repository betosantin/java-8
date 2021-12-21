package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Roberto", "Gustavo", "Jo�o", "Pedro");

		System.out.println("** Normal **");
		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("** Lambda **");
		aprovados.forEach((nome) -> {
			System.out.println(nome);
		});

		System.out.println("** Lambda Simplificado **");
		aprovados.forEach(nome -> System.out.println(nome));

		System.out.println("** Lambda Simplificado++ **");
		aprovados.forEach(System.out::println);

		System.out.println("** Lambda Usando fun��o personalizada tradicional **");
		aprovados.forEach(nome -> imprimir(nome));
		
		System.out.println("** Lambda Usando fun��o personalizada simplificado **");
		aprovados.forEach(Foreach::imprimir);

	}

	static void imprimir(String nome) {
		System.out.println("Ol�, meu nome �: " + nome);
	}
}
