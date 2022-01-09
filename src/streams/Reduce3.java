package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import streams.entidade.Aluno;

public class Reduce3 {
	
	public static void main(String[] args) {
		
		Media m1 = new Media().adcionar(8.3).adcionar(6.7).adcionar(5.0);
		Media m2 = new Media().adcionar(6).adcionar(6.7).adcionar(9.1);
		
		System.out.println(m1.getMedia());
		System.out.println(m2.getMedia());
		
		System.out.println(Media.combinar(m1, m2).getMedia());
		
		System.out.println("*****************");
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 7.5);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Rebeca", 7.2);
		Aluno a6 = new Aluno("Beto", 10.0);
		Aluno a7 = new Aluno("Pedro", 7.2);
		Aluno a8 = new Aluno("Moni", 9.4);
		
		List<Aluno> alunos  = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		Predicate<Aluno> aprovacao = a -> a.getNota() >= 7;
		Function<Aluno, Double> notas = a -> a.getNota();
		BiFunction<Media, Double, Media> calculaMedia = (media, nota) -> media.adcionar(nota);
		BinaryOperator<Media> combinarMedia =  (v1, v2) -> Media.combinar(m1, m2);
		
		Media m = alunos.stream()
		.filter(aprovacao)
		.map(notas)
		.reduce(new Media(), calculaMedia, combinarMedia);
		
		
		System.out.println("A média dos aprovado é: " + m.getMedia());
		
	}
	
}
