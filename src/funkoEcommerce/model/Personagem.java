package funkoEcommerce.model;

public abstract class Personagem {
//Atributos
	private String nomeComprador;
	private int numeroCompra;
	private float preco;

	//Método construtor
	public Personagem(String nomeComprador, int numeroCompra, float preco) {
		this.nomeComprador = nomeComprador;
		this.numeroCompra = numeroCompra;
		this.preco = preco;
	}
	
	//Métodos de acesso
	public String getNome() {
		return nomeComprador;
	}
	public void setNome(String nomeComprador) {
		this.nomeComprador = nomeComprador;
	}
	public int getNumeroCompra() {
		return numeroCompra;
	}
	public void setNumeroCompra(int numeroCompra) {
		this.numeroCompra = numeroCompra;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Boneco Personalizado:");
		System.out.println("***********************************************************");
		System.out.println("Nome do Comprador: " + this.nomeComprador);
		System.out.println("Número da Compra: " + this.numeroCompra);
		System.out.println("Valor da compra: " + this.preco);
		
	}
}
