package POO_HERANCA;

public class ProgramaEmpregado {
	public static void main (String args) {
		
		Empregado c = new Empregado(10_000);
		
		Empregado g = new Gerente(10_000, 30);
		
		System.out.println(c);
		System.out.println(g);
		
		
		
		
		
	}
	
}
