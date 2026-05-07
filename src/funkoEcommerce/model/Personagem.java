package funkoEcommerce.model;

public abstract class Personagem {
//Atributos
	private String nomeComprador;

//Método construtor
	public Personagem(String nomeComprador) {
		this.nomeComprador = nomeComprador;
	}
//Métodos de acesso
	public String getNome() {
		return nomeComprador;
	}

	public void setNome(String nomeComprador) {
		this.nomeComprador = nomeComprador;
	}

	public void visualizar() {

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Boneco Personalizado:");
		System.out.println("***********************************************************");
		System.out.println("Nome do Comprador: " + this.nomeComprador);
		
	}
}
