package streams.exemplo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Teste {
	
	public static void main(String[] args) {
		
		List<String> lista = Arrays.asList("Ana", "João", "Jorge");
		
		//Formas antigas
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		for (String string : lista) {
			System.out.println(string);
		}
		
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Usando stream api
		
		System.out.println("----------");
		Stream<String> st = lista.stream();
		st.forEach(System.out::println);
		
		System.out.println("***********");
		lista.forEach(System.out::println);
		
	}
}
