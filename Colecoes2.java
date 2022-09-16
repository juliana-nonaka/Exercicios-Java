package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {

	public static void main(String[] args) {


		int op;
		Scanner ler= new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList(); //estou criando um objeto do tipo ArrayList
		
		do {
			System.out.println("\n---------------------------------------------------------------------------------");
			System.out.println("\n\t\tMenu de op��es do estoque ");
			System.out.println("\n(1) Deseja adicionar produtos no estoque? ");
			System.out.println("\n(2)Deseja remover produtos do estoque? " );
			System.out.println("\n(3)Deseja atualizar produtos do estoque? " );
			System.out.println("\n(4)Deseja mostrar todos os produtos do estoque? " );
			System.out.println("\n(0)Deseja encerrar o progerama ?" );
			System.out.println("\nPor favor, digite sua op��o: " );
			op = ler.nextInt();
			System.out.println("\n---------------------------------------------------------------------------------");
			
			switch(op) {
				case 1:
					ler.nextLine();
					System.out.println("\nDigite o produto para adicionar no estoque: ");
					String produto = ler.nextLine(); //NexLine vai ler um valor do tipo String
					estoque .add(produto);
					break;
				case 2:
				ler.nextLine();
				System.out.println("\nDigite o produto que deseja remover do estoque: ");
				String produto1 = ler.nextLine();
				if(estoque.contains(produto1)) {//o meto9do contains vai verificar se o produto 1 esta dentro do estoque
					estoque.remove(produto1);
					
				}else {
					System.out.println("\nProduto n�o existe no estoque!!!");
					
				}
				break;
				case 3:
					ler.nextLine();
					System.out.println("\nDigite o produto que quer atualizar: ");
					String verifica = ler.nextLine();
					System.out.println("\nDigite o nome do produto que entrar� no lugar do "+verifica+" :");
					String novo = ler.nextLine();
					if(estoque.contains(verifica)) {
						estoque.remove(verifica);
						estoque.add(novo);
						
					}else {
					System.out.println("\nProduto n�o existe no estoque!!!");
					}
					break;
				case 4:
					System.out.println("\nOs produtos do estoque s�o: ");
					System.out.println(estoque);
					break;
					
				case 0:
					System.out.println("\nMuito obrigada em utilizar do nosso sistema, volte sempre!!!");
					break;
					default:
						System.out.println("\nOp��o inv�lida!!!");
						
			}
		}
		while(op!=0);
		

	}

}
