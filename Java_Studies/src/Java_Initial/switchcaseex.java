package Java_Initial;

import java.util.Scanner;

public class switchcaseex {
	  public static void main(String[] args) {

	        Scanner leitor = new Scanner(System.in);

	 // CÓDIGO COM ERRO DE COMPILAÇÃO POIS FALTA O BREAK

	        System.out.println("Escoha uma opção");

	        int op = leitor.nextInt();

	 

	        switch (op){

	            case 1:

	                System.out.println("Opção 1");

	            case 2:

	                System.out.println("Opção 2");

	            default:

	                System.out.println("Opção default");

	        }

	        leitor.close();

	    }
}
