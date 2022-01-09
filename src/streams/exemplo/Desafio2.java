package streams.exemplo;

import java.util.Arrays;
import java.util.List;

import streams.entidade.Carro;

public class Desafio2 {

	public static void main(String[] args) {

		Carro c1 = new Carro("Ford", "Focus", 173d, 410d);
		Carro c2 = new Carro("Ford", "Fusion", 240d, 530d);
		Carro c3 = new Carro("Audi", "A3", 150d, 380d);
		Carro c4 = new Carro("Audi", "A4", 210d, 405d);
		Carro c5 = new Carro("VW", "Golf", 150d, 360d);
		Carro c6 = new Carro("GM", "Cruze", 152d, 385d);
		Carro c7 = new Carro("GM", "Onix", 115d, 365d);
		Carro c8 = new Carro("Ford", "Ecosport", 173d, 345d);

		List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8);

		carros.stream().filter(c -> c.getHp() >= 150d).map(c -> "O carro da marca " + c.getMarca() + " e modelo "
				+ c.getModelo() + ", possuí " + c.getHp() + " cv.").forEach(System.out::println);

	}

}
