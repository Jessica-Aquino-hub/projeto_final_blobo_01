package funkoEcommerce.model;

public class CriadorPersonagemPronto  extends funkoEcommerce.model.Personagem{
String nomePersonagem;
	
	public CriadorPersonagemPronto(String nomeComprador, String nomePersonagem) {
	super(nomeComprador);
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
