package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

import streams.entidade.Aluno;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (total, n) -> total + n;
		
		System.out.println(nums.stream().reduce(0, soma));
		
		nums.stream().filter( n -> n > 5).reduce(soma).ifPresent(System.out::println);
		
	}

}
