package Java_Initial;

public class Stringsemjava {

	public static void main(String[] args) {
		/*
		 * trabalhar com identação ou strings em códigos
		 * 
		 * utilizar as aspas triplas  """   <html>
		 * 
		 * 
		 * </html>
		 * 
		 * 
		 * 
		 * """
		 * 
		 * mantem a identação e conseguimos trabalhar com strings com valores grandes
		 * 
		 */
		
		
		/*		método format 
		 * 
		 * 		String variavel = String.format("dd/MM/yyyy");
		 * 
		 * 
		 */
		
		
		
		
		/*.equals(valor)    método
		 * 
		 * 
		 * 	verifica se os valores de strings são iguais
		 * 
		 * 
		 */
			
			String linguagem = "java";
			String java = new String("Java");
			
			if(linguagem.equals(java)) {
				System.out.println("As strings são iguais");
				
			//podemos reescrever a condição
				
			//(! linguagem.equals(java))
			}
			else {
				System.out.println("As strings são diferentes");
				
			
		}
		
		
		
		
		/*.equalsIgnoreCase(valor)      método
		 * 
		 * 
		 * IGnora a diferença entre letras maiúsuclas e minúsculas
		 */
			

			if(linguagem.equalsIgnoreCase(java)) {
				System.out.println("As strings são iguais");
				
			//podemos reescrever a condição
				
			//(! linguagem.equals(java))
			}
			else {
				System.out.println("As strings são diferentes");
				
		
			}
				
		
		
		/*
		 *    \n Pula uma linhas
		 *    
		 *    
		 *    \t tabulação horizontal (espaço)
		 *    
		 *    
		 *   \\ gera um caractere de barra invertida(\)
		 *   
		 *    
		 *    \" gera um caractere de aspas dupla (")
		 *    
		 *    
		 *    \' gera um caractere de aspas simples (')
		 *    
		 *   
		 * 
		 */
				System.out.println("Olá Mundo \ndivertido");
				/*Olá Mundo
				 * divertido 
				 */
				
				System.out.println("Olá \t Mundo");
				// Olá      Mundo
				
				System.out.println("Olá Mundo\\");
				// Olá Mundo\
				
				System.out.println("Olá Mundo\"");
				// Olá Mundo"
				
				System.out.println("Olá Mundo\'");
				// Olá Mundo'
				
		
		
		
		/* .length() conta a quantidade
		 * 
		 * 
		 */
		
		
		String texto = "Linguagem java";
		int qtnd= texto.length();
		
		System.out.println("A quantiadede de caracteres é: "+ qtnd);
		
		
		/* .indexOf("CARACTER QUE PROCURA)    procurar o indice do caracter x	ou sequencia de caracteres	
		 * 
		 */

		String nome = "FIAP É A MELHOR";
					 // "0123 4 5 67891011"
		System.out.println("O caracter está no indice :"+ nome.indexOf("A"));
		//O caracter está no indice (2)
		
		
		
		/* .lastIndexOf()      retorna a última ocorrência do caractere ou sequencia de caracteres
		 * 
		 * 
		 * 
		 * 		
		 */
		
		
		/*  .substring(indice1, até indicex)  pega os caracteres do indice condição inicial e retorna até o indice condição final
		 * 
		 *
		 */
		
		
		String nome1 = "FIAP A MELHOR";
		
		String novoNome = nome1.substring(1,8);
		System.out.println(novoNome);
		
		// IAP A M
		
		
		
		
		
	}

}
