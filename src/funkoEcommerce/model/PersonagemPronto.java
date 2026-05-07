package funkoEcommerce.model;

public class PersonagemPronto extends funkoEcommerce.model.Personagem{
String nomePersonagem;
	
	public PersonagemPronto(String nomeComprador, String nomePersonagem, int numeroCompra) {
	super(nomeComprador, numeroCompra);
	this.nomePersonagem = nomePersonagem;
}
	public String getNomePersonagem() {
		return nomePersonagem;
	}
	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Nome do Personagem Pronto: " + nomePersonagem);
		
	}
}