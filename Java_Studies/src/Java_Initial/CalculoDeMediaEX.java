package Java_Initial;

import java.util.Scanner;

//importando uma classe scanner para inputar e armazenar um dado a ser retornado futuamente

public class CalculoDeMediaEX {

	public static void main(String[] args) {
		
		
		//Declarando uma classe Scanner
		Scanner ler = new Scanner(System.in);
		
		
		double provaSemestral = 0;
		double tcc = 0;
		double avaliacao1 = 0;
		double avaliacao2 = 0;
		
		
		
		
		System.out.println("Digite a nota da Prova Semestral: ");
			provaSemestral = ler.nextDouble();
		System.out.println("Digite a nota do TCC: ");
			tcc = ler.nextDouble();
		System.out.println("Digite o valor da primeira avaliação:");
			avaliacao1 = ler.nextDouble();
		System.out.println("Digite o valor da segunda avaliação:");
			avaliacao2 = ler.nextDouble();
			
			
		double mediaFinal = provaSemestral * 0.50 + tcc * 0.30 + ((avaliacao1 + avaliacao2) / 2) * 0.2;
		
		mediaFinal += 1;
		//ou mediaFinal ++;
			
		System.out.print(mediaFinal);
		
		
		
		ler.close();
	}

}
