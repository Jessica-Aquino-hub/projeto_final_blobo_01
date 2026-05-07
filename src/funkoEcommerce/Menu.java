package funkoEcommerce;

//import java.util.InputMismatchException;
import java.util.Scanner;

import funkoEcommerce.model.CriadorPersonagemPersonalizado;
import funkoEcommerce.model.CriadorPersonagemPronto;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		CriadorPersonagemPersonalizado cpp = new CriadorPersonagemPersonalizado("ROberta","Adreia","Calvo");
		cpp.visualizar();
		CriadorPersonagemPronto cpronto = new CriadorPersonagemPronto("ROberta","Hatsune Miku");
		cpronto.visualizar();
		
		while(true) {
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
			/*try {
				opcao = leia.nextInt();
				leia.nextLine();
			} catch(InputMismatchException e) {
				
			} */
			opcao = leia.nextInt();
			if (opcao == 0) {
				System.out.println("Obrigada pela visita!");
				System.exit(0); // dá para usar break tbm!
			} 
			//método 
			switch(opcao) {
				case 1 -> { //lambda
					System.out.println("\nCriei um boneco Personalizados!\n");
					int num;
					System.out.println("\nDeseja Criar um personagem Personalizado ou Pronto? |(1-Personalizado|2-Pronto\n");
					num = leia.nextInt();
					if(num == 1) {
						System.out.println("Personagem Personalizado");
					} else {
						System.out.println("Personagem Pronto");
					}
					break;
				}
				case 2 -> {
					System.out.println("\nListei todos os bonecos Personalizados!\n");
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

}
