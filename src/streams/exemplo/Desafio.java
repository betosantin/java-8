package streams.exemplo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		/*
		 * 1. Transformar o número para string binária... 6 > "110" 
		 * 2. Reverter a String... "110" > "011"
		 * 3. Converter de voltar para inteiro "011" > 3
		 */
		
		nums.stream()
		.map(n -> Integer.toBinaryString(n))
		.map(n -> new StringBuilder().append(n).reverse())
		.map(n -> Integer.parseInt(n + "", 2))
		.forEach(System.out::println);
		
		
		UnaryOperator<String> reverse = n -> new StringBuilder().append(n).reverse().toString();
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);
		
		nums.stream()
		.map(Integer::toBinaryString)
		.map(reverse)
		.map(binarioParaInt)
		.forEach(System.out::println);
		
	}
	
}
