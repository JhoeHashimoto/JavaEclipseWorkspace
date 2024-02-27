package program;

import java.io.IOException;
import java.util.Scanner;


import model.Endereco;
import service.ViaCepService;

public class Teste {


    public static void main(String[] args) {


        ViaCepService viacepservice = new ViaCepService();
       
        Scanner ler = new Scanner(System.in);
       
        String cep;
       
        System.out.print("Digite o cep: ");
        cep = ler.next();
       

        try {
            Endereco endereco = viacepservice.getEndereco(cep);
           
            System.out.println(endereco.getLogradouro() + "\n");
            System.out.println(endereco.getBairro() + "\n");
            System.out.println(endereco.getLocalidade()  + "\n");
            System.out.println(endereco.getCep());
           
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
        
        ler.close();
    }
}
