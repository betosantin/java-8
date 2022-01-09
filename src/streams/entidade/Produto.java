package streams.entidade;

public class Produto {

	private String nome;
	private Double preco;
	private Double desconto;
	private Double frete;

	public Produto(String nome, Double preco, Double desconto, Double frete) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.frete = frete;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getFrete() {
		return frete;
	}

	public void setFrete(Double frete) {
		this.frete = frete;
	}

}
