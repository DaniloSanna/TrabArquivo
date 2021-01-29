package entities;

public class ExcercicioProduto {
	
	private String nome;
	private int quantidade;
	private double preco;
	
	
	public ExcercicioProduto() {}
	public ExcercicioProduto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public double getPreco() {
		return preco;
	}
	
	public double getPrecoTotal() {
		return preco*quantidade;
	}
	@Override
	public String toString() {
		
		//String retorno = "" + nome + "," + String.format("%.2f", getPrecoTotal());
		return "" + nome + "," + String.format("%.2f", getPrecoTotal());
	}
	
}
