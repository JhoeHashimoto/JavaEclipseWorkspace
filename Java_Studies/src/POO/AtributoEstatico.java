package POO;

import javax.swing.JOptionPane;

public class AtributoEstatico {

	
	//PODEMOS TER METODOS COM MESMO NOME, NO ENTANTO A ASSINATURA DE PARAMETROS DEVE SER DIFERENTE
	
	//PROGRAMA COM A CLASSE
	public static void main(String[] args) {
		
		Casa c1 = new Casa("Gabriela");
		
		Casa c2 = new Casa("Benefrancis");
		
		Casa c3 = new Casa("Victor");
		
		//USANDO UM método estático para inputar a cor, apartir de uma caixa de diálogo
		Casa.cor = JOptionPane.showInputDialog("Informe a cor da casa");
		
		
		
		
		System.out.println(c1.dono + " - " + Casa.getCor());
		System.out.println(c2.dono + " - " + Casa.getCor());
		System.out.println(c3.dono + " - " + Casa.getCor());
		
	}

}

//CLASSE DENTRO DO PROGRAMA

class Casa{
	
	
	String dono;
	
	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public static String getCor() {
		return cor;
	}

	public static void setCor(String cor) {
		Casa.cor = cor;
	}

	//        ATRIBUTO ESTÁTICO para qualquer objeto por padrão, no programa ao alterarmos o atributo cor ele irá trocar a cor e padronizar para todos os objetos
	static String cor = "BEGE";
	
	public Casa(String dono) {
		this.dono = dono;
				
		
		
	}
}