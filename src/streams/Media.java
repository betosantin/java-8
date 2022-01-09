package streams;

public class Media {

	private double total;
	private int quantidade;
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Media adcionar(double valor) {
		total += valor;
		quantidade++;
		
		return this;
	}
	
	public double getMedia() {
		return total / quantidade;
	}
	
	public static Media combinar(Media m1, Media m2) {
		Media resultado = new Media();
		resultado.setTotal(m1.getTotal() + m2.getTotal());
		resultado.setQuantidade(m1.getQuantidade() + m1.getQuantidade());
		
		return resultado;
	}
	
}
