package Java_Initial;

public class OperadoresDeComparacao {

	public static void main(String[] args) {
		
		
		//== igual
		
		
		//!= diferente
		
		//> maior
		
		//< menor
		
		//>= maior ou igual
		
		//<= menor ou igual
		
		//&& E
		
		var media = 7;
		var presenca = 60;
		boolean passouDeAno = media >= 6 && presenca > 75;
		System.out.println(passouDeAno);
		//retorna false
		
		
		// || OU 
		
		var idade = 70;
		boolean gratuito = idade < 5 || idade > 65;
		System.out.println(gratuito);
		//retorna true
		
		
		// Invertendo o resultado do teste boolean
		
		boolean podeDirigir = !(idade < 18);
		System.out.println(podeDirigir);
		
		
		
		
		
		

	}

}
