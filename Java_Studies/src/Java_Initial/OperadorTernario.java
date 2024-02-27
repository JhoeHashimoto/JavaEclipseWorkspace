package Java_Initial;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		
		
		//operador ternario é um tipo de verificação condicional
		
		//    condição1 == true ? faça isso : faça aquilo;
		
		// Condição // (? se verdadeiro) (: se falso)
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de laranjas: ");
		var quantidade = entrada.nextInt();
		
		
		System.out.println("A forma de pagamento é PIX? (True ou False)");
		boolean pix = entrada.nextBoolean();
		
		//se a quantidade for menor que 10 o valor é 2.5, caso contrário 2
		double valor = quantidade < 10 ? 2.5 : 2;
		
		//se o pagamento for no pix o desconto será 10%, caso contrário não tem desconto
		double desconto = pix == true ? .9 : 1;
		
		double valorFinal = valor * quantidade * desconto;
		
		System.out.printf("O valor final é :" + valorFinal);
		
		
		
		
		
		
		
		
		entrada.close();
		
	}

}
