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
		System.out.printf("O personagem", nomePersonagem.getNome()," foi criado com sucessor!%n" );
	}

	
	@Override
	public void atualizar(Personagem nomePersonagem) {
	
		if(listaPersonagem.contains(nomePersonagem) == true) {
			listaPersonagem.set(listaPersonagem.indexOf(nomePersonagem), nomePersonagem);
		} else {
			System.out.println("\nO Personagem não existe!");
		}
	}

	@Override
	public void deletar(Personagem nomePersonagem) {
		if(listaPersonagem.contains(nomePersonagem) == true) {
			listaPersonagem.remove(nomePersonagem);
			System.out.printf("\nO Personagem ", nomePersonagem, " foi excluido com sucesso!");
		} else {
			System.out.println("\nO Personagem não existe!");
		}
	}
	

	
}
