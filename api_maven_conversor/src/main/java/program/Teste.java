package program;

import java.io.IOException;
import java.util.Scanner;

import org.apache.http.client.ClientProtocolException;

import service.AwesomeApi;

public class Teste {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		float valorReal, valorConvertido, valorCotacao;
		int opcao;
		String[] conversao = {"USD-BRL", "EUR-BRL", "BTC-BRL"};
		
		System.out.print("Conversor de Moedas\n\n");
		
		System.out.print("Digite um valor em R$ para ser convertido: ");
		valorReal = ler.nextFloat();
		
		System.out.print("Deseja converter para: \n1 - Dólar \n2 - Euro \n3 - Bitcoin\n");
		System.out.print("Digite a opção: ");
		opcao = ler.nextInt();
		
		AwesomeApi convService = new AwesomeApi();
		valorCotacao = convService.getConversao(conversao[opcao-1]);
		
		valorConvertido = valorReal / valorCotacao;
		
		System.out.printf("O valor da conversão para %s é %.2f", conversao[opcao-1].substring(0, 3), valorConvertido);
		
		ler.close();
	}

}
