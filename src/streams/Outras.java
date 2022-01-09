package streams;

import java.util.Arrays;
import java.util.List;

import streams.entidade.Aluno;

public class Outras {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 7.5);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Rebeca", 7.2);
		Aluno a6 = new Aluno("Beto", 10.0);
		Aluno a7 = new Aluno("Pedro", 7.2);
		Aluno a8 = new Aluno("Moni", 9.4);
		Aluno a9 = new Aluno("Ana", 7.8);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9);
		
		System.out.println("Distinct");
		//alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("Skip e Limit");
		alunos.stream().distinct().skip(1).limit(2).forEach(System.out::println);
		
		System.out.println("Take while");
		alunos.stream().distinct().takeWhile(a -> a.getNota() >= 7).forEach(System.out::println);
	}

}
