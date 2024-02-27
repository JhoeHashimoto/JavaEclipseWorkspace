package program;


import java.io.IOException;

import java.util.Scanner;
import model.Endereco;
import service.ViaCepService;


public class Teste {


    public static void main(String[] args) {
    	
    	Scanner ler = new Scanner(System.in);
    	
    	
    	
        ViaCepService viacepservice = new ViaCepService();
        String cep;
        System.out.println("Digite o CEP: ");
        cep = ler.next();
        
        try {
            Endereco endereco = viacepservice.getEndereco(cep);
           
            String ddd = endereco.getDdd();
            String uf = endereco.getUf();
           
            System.out.println(endereco + "\n");
            System.out.println(ddd + "\n");
            System.out.println(uf  + "\n");
           
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
            
        ler.close();
        }  
    }
}
