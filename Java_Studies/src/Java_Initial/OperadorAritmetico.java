package Java_Initial;

public class OperadorAritmetico {

	public static void main(String[] args) {
			
		
		//System.out.println(5f/2f)
			 //retorna 2,5 é necessário inferir que é um ponto flutuante, pois caso o java entenda que e um inteiro o resultado dessa divisao ser 2
		
		
		var numero = 1452;
		
		// % (MÓDULO, retorna o resto da divisão dos números inteiros
		
		System.out.println("O numero " + numero + " é divisível por 2? " + (numero % 2 == 0) );
		System.out.println("O numero " + numero + " é divisível por 3? " + (numero % 3 == 0) );
		System.out.println("O numero " + numero + " é divisível por 4? " + (numero % 4 == 0) );
		System.out.println("O numero " + numero + " é divisível por 5? " + (numero % 5 == 0) );
		System.out.println("O numero " + numero + " é divisível por 6? " + (numero % 6 == 0) );
		System.out.println("O numero " + numero + " é divisível por 7? " + (numero % 7 == 0) );
		System.out.println("O numero " + numero + " é divisível por 8? " + (numero % 8 == 0) );
		System.out.println("O numero " + numero + " é divisível por 9? " + (numero % 9 == 0) );
		
		
		var resultado = 1 + 5 * 2; //11!
		System.out.println("Resultado: " + resultado);
		
		
		var resultado2 = (1 + 5) * 2; //12 (Regra de precedência!)
		System.out.println("Resultado: " + resultado2);
		
		
		
		
		byte quantidadeDeUvasVerdes = 50;
		byte quantidadeDeUvasRoxas = 120;
		//casting transformando para byte 
		byte totalDeUvas = (byte) (quantidadeDeUvasVerdes + quantidadeDeUvasRoxas);
		
		System.out.println(totalDeUvas);
		
		//-86
		//este resultado é devido ao byte ir de -127 a 127, logo 170 é maior que o range do tipo suportando, ocasionando um erro no código
		//para corrigir, basta declarar o total para o tipo int
		
	}

}
