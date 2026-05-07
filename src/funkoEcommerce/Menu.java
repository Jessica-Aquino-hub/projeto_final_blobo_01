package funkoEcommerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
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
			
			opcao = leia.nextInt();
			if (opcao == 0) {
				System.out.println("Obrigada pela visita!");
				System.exit(0); // dá para usar break tbm!
			} 
			//método 
			switch(opcao) {
				case 1 -> { //lambda
					System.out.println("\nCriei um boneco Personalizados!\n");
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
