package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import streams.entidade.Aluno;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 7.5);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Rebeca", 7.2);
		Aluno a6 = new Aluno("Beto", 8.5);
		Aluno a7 = new Aluno("Pedro", 7.2);
		Aluno a8 = new Aluno("Moni", 9.4);
		
		List<Aluno> alunos  = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		Predicate<Aluno> aprovacao = a -> a.getNota() >= 7;
		Function<Aluno, String> saudacao = a -> "Parab�ns " + a.getNome() + "! Voc� foi aprovado!";
		
		alunos.stream()
		.filter( aprovacao)
		.map( saudacao )
		.forEach(System.out::println);
		
		
	}

}
