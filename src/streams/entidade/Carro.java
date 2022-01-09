package streams.entidade;

public class Carro {

	private String marca;
	private String modelo;
	private Double hp;
	private Double litrosPortaMala;

	public Carro(String marca, String modelo, Double hp, Double litrosPortaMala) {
		this.marca = marca;
		this.modelo = modelo;
		this.hp = hp;
		this.litrosPortaMala = litrosPortaMala;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getHp() {
		return hp;
	}

	public void setHp(Double hp) {
		this.hp = hp;
	}

	public Double getLitrosPortaMala() {
		return litrosPortaMala;
	}

	public void setLitrosPortaMala(Double litrosPortaMala) {
		this.litrosPortaMala = litrosPortaMala;
	}

}
