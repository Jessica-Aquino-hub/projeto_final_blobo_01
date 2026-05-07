package funkoEcommerce.repository;

import funkoEcommerce.model.Personagem;

public interface EcommerceRepository {
	//CRUD da loja
	public void listarTodas();

	public void criar(Personagem nomePersonagem);

	public void atualizar(Personagem nomePersonagem);

	public void deletar(Personagem nomePersonagem);

}