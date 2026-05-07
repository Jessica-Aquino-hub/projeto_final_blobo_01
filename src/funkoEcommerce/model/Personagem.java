package funkoEcommerce.model;

public abstract class Personagem {
//Atributos
	private String nomeComprador;
	private int numeroCompra;
	private float preco;

	//Método construtor
	public Personagem(String nomeComprador, int numeroCompra) {
		this.nomeComprador = nomeComprador;
		this.numeroCompra = numeroCompra;
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
	

	public void visualizar() {

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Boneco Personalizado:");
		System.out.println("***********************************************************");
		System.out.println("Nome do Comprador: " + this.nomeComprador);
		System.out.println("Número da Compra: " + this.numeroCompra);
		
		
	}
}
