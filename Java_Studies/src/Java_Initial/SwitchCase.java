package Java_Initial;

import java.util.Scanner;

public class SwitchCase {
	

	public static void main(String[] args) {
		
		
		//Ao pular linha utilizando o "/n" ele irá compilar apenas no windows.
		//Para podermos ler isso em linux ou IOS devemos utilizar o	operador System.lineSeparator()

		//switch case é uma opção para o if e else, possui um case default para atribuir caso não obedeça as condições
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escolha: "+ System.lineSeparator()
							+ "1 - Pesquisar Usuário: " + System.lineSeparator()
							+ "2 - Cadastrar Usuário:" + System.lineSeparator()
							+ "3 - Abrir pedido: " + System.lineSeparator()
							+ "4 - Fechar pedido: ");
		
		int opcao = ler.nextInt();
		
	/*	
		if (opcao == 1){
			System.out.println(opcao + " - Pesquisar Usuário");
		}
		
		else if (opcao == 2 ) {
			System.out.println(opcao + " -  Cadastrar Usuário:");
		}
		
		else if (opcao == 3 ) {
			System.out.println(opcao + " - Abrir pedido: ");
		}
		
		else if (opcao == 4 ) {
			System.out.println(opcao + " - Fechar pedido: ");
		}
		
		//PODEMOS ESCREVER DA SEGUINTE FORMA
		*/
		switch (opcao) {
			case 1:
				System.out.println(opcao + " - Pesquisar Usuário");
				break;
				//necessário encerrar a condição se não executa as outras condições
			case 2:
				System.out.println(opcao + " -  Cadastrar Usuário:");
				break;
			case 3:
				System.out.println(opcao + " - Abrir pedido: ");
				break;
			case 4:
				System.out.println(opcao + " - Fechar pedido: ");
				break;
			//estrura padrão
			default:
				System.out.println("Você digitou uma opcção inválida!");
		}
				
			
		
		
		
		
		ler.close();
	}

}
