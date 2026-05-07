package funkoEcommerce;

import java.util.InputMismatchException;
import java.util.Scanner;

import funkoEcommerce.controller.EcommerceController;
import funkoEcommerce.model.Personagem;
import funkoEcommerce.model.PersonagemPronto;

public class Menu{
private static final EcommerceController ecommerceController = new EcommerceController();
private static final Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao;

		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("         	      Loja de FunkoPop          		 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Boneco Personalizado           ");
			System.out.println("            2 - Listar todos Bonecos Personalizados  ");
			System.out.println("            3 - Atualizar Boneco Personalizado       ");
			System.out.println("            4 - Deletar Boneco Personalizado   		 ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			try {
				opcao = leia.nextInt();
				leia.nextLine();

			} catch (InputMismatchException e) {
				opcao = -1;
				System.out.println("\nDigite um número inteiro!");
				leia.nextLine();
			}

			if (opcao == 0) {
				System.out.println("Obrigada pela visita!");
				System.exit(0); // dá para usar break tbm!
			}
			// método
			switch (opcao) {
			case 1 -> { // lambda
				criar();
				break;
			}
			case 2 -> {
				System.out.println("\nA lista de Bonecos Personalizados: ");
				listarTodas();
				break;
			}
			case 3 -> {
				System.out.println("\nAtualizei todos os bonecos Personalizados!\n");
				break;
			}
			case 4 -> {
				System.out.println("\nDeletei o Boneco Personalizado\n");
				break;
			}
			default -> {
				System.out.println("\nOpção inválida, tente novamente!\n");
				break;
			}
			}

		}
	}

	private static void listarTodas() {
		ecommerceController.listarTodas();
 }
	private static void criar() {		
		int num;
		System.out.println("Deseja Criar um Boneco Personalizado ou um pronto? (1-Personalizado | 2-Pronto)");
		num = leia.nextInt();
		if(num == 1) {
			System.out.println("Digite o nome do Comprador: ");
			String nomeComprador = leia.nextLine();
			
			System.out.println("Digite o nome do Personagem: ");
			String nomePersonagem = leia.nextLine();
		
			System.out.println("Digite o número da Compra: ");
			int numeroCompra = leia.nextInt();
			
			System.out.println("Digite o valor do boneco: ");
			Float preco = leia.nextFloat();
			
			ecommerceController.criar(new PersonagemPronto(nomeComprador,nomePersonagem,preco,numeroCompra));
			criar();
		}
	}

}
