package funkoEcommerce.controller;

import java.util.ArrayList;
import java.util.List;

import funkoEcommerce.model.Personagem;
import funkoEcommerce.repository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository{
	List<Personagem> listaPersonagem = new ArrayList<Personagem>(); //mini banco de dados em memoria
	int numero = 0;

	@Override
	public void listarTodas() {
		for (var personagem : listaPersonagem ) {
			personagem.visualizar();
		}
	}

	@Override
	public void criar(Personagem nomePersonagem) {
		listaPersonagem.add(nomePersonagem);
		System.out.printf("O personagem %d foi criado com sucessor!%n", nomePersonagem.getNome());
	}

	
	@Override
	public void atualizar(Personagem nomePersonagem) {
		
	}

	@Override
	public void deletar(Personagem nomePersonagem) {
		
		
	}

	
}
