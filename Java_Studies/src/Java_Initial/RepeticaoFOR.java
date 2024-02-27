package Java_Initial;

import java.util.Scanner;

public class RepeticaoFOR {

	public static void main(String[] args) {
		
		
		/*for (inicialização ; condição lógica ; incremento ou decremento) {
		
			instruções
		}
		
		
		exemplo
		
		for(int i=0 ; i<=100 ; i++) {
		
			System.out.println(i);
		
		}
		
		
		
		*/
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos da turma: ");
		int qtnd = ler.nextInt();
		
		double somaNotas = 0;
		
		for (int i = 0; i < qtnd; i++) {
			
			System.out.println("Digite a nota do " + (i+1) + "° aluno");
			float nota = ler.nextFloat();
			
			if (nota < 0 || nota > 10) {
				System.out.println("Nota inválida!");
				i--;
				
			}
			
			else {
				somaNotas += nota;
			}	
		}
		
		double mediaNotas = somaNotas / qtnd;
		System.out.println("A média das notas da sala é: " + mediaNotas);
		
		
		ler.close();
	}

}
