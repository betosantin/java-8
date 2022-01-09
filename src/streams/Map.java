package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		
		
		List<String> marcas = Arrays.asList("BMW", "Audi", "VW", "Honda", "Ford");
		marcas.stream().map(m -> m.toUpperCase()).forEach(System.out::println);
		
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		UnaryOperator<String> esc = n -> n + "!!!!";
		
		marcas.stream().map(maiuscula)
		.map(primeiraLetra)
		.map(esc)
		.forEach(System.out::print);
		
		
	}

}
