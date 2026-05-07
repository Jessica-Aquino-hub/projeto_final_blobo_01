package funkoEcommerce.model;

public class CriadorPersonagemPersonalizado extends funkoEcommerce.model.Personagem {
	String nomePersonagem;
	String aparencia;
	
	public CriadorPersonagemPersonalizado(String nomeComprador,int numeroCompra, float preco, String nomePersonagem, String aparencia) {
		super(nomeComprador, numeroCompra, preco);
		this.nomePersonagem = nomePersonagem;
		this.aparencia = aparencia;
	}

	public String getNomePersonagem() {
		return nomePersonagem;
	}

	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}

	public String getAparencia() {
		return aparencia;
	}

	public void setAparencia(String aparencia) {
		this.aparencia = aparencia;
	}

	@Override //sobrescrevendo polimorfismo
	public void visualizar() {
		super.visualizar();
		System.out.println("Nome do Personagem: " + nomePersonagem);
		System.out.println("Aparência do Personagem: " + aparencia);
	}

}
