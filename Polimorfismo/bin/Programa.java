package ExPol;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
 
public class Programa {
 
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
       
        HashMap<Integer, Cliente> listaClientes = new HashMap<Integer, Cliente>();
       
        int opcao;
        int id;
        Cliente cli;
        int id_cliente=0;
        String possuiConta;
 
        do {        
           System.out.printf("===> Sistema de Cadastro de Clientes <===\n\n");
           System.out.printf("Escolha uma opção:\n");          
           System.out.printf("1 - Incluir Cliente \n" +
                             "2 - Atualizar Cliente \n" +
                             "3 - Excluir Cliente \n" +
                             "4 - Exibir Cliente \n" +
                             "5 - Depositar\n" +
                             "6 - Sacar\n" +
                             "7 - Mostrar Extrato\n" +
                             "8 - Sair\n\n"
                             );


           System.out.printf("Digite a opção desejada: ");
           opcao = ler.nextInt();
           
           if (opcao == 1) {
               Cliente cliente = new Cliente();
               
               id_cliente++;
               cliente.setId(id_cliente);
               
               System.out.print("Digite o seu nome: ");
               cliente.setNome(ler.next());
               
               System.out.print("Digite a seu idade: ");
               cliente.setIdade(ler.nextInt());
               
               System.out.print("Digite o seu e-mail: ");
               cliente.setEmail(ler.next());
               
               System.out.print("Possui conta bancária? S/N");
               possuiConta = ler.next().toUpperCase();
               
               if(possuiConta.equals("S")) {
                   Conta conta = new Conta();
                   
                   System.out.print("Digite a agencia: ");
                   conta.setAgencia(ler.next());
                   
                   System.out.print("Digite o numero: ");
                   conta.setNumero(ler.next());
                   
                   conta.setSaldo(0);
                   
                   cliente.setConta(conta);
               }
               else {
                   cliente.setConta(null);                
               }
               
               listaClientes.put(id_cliente, cliente);
               
               System.out.printf("Cliente incluído com sucesso!");
               System.in.read();
           }
           else if(opcao == 2) {              
               listaClientes.forEach((chave, valor) -> {
                   System.out.println("ID: " + chave + " - " + valor.exibirNomeIdade());
                 });

               
               System.out.print("Digite o ID do cliente que você deseja atualizar: ");
               id = ler.nextInt();
               
               if (listaClientes.containsKey(id)) {
            	   cli = listaClientes.get(id);   
                   
                   System.out.print("Digite o seu novo nome: ");
                   cli.setNome(ler.next());
                   
                   System.out.print("Digite a sua nova idade: ");
                   cli.setIdade(ler.nextInt());
                   
                   System.out.print("Digite o seu novo e-mail: ");
                   cli.setEmail(ler.next());
                   
                   System.out.printf("Cliente atualizado com sucesso!");
               }
               else {
                   System.out.printf("Cliente não encontrado!");
               }
               System.in.read();
           }
           else if(opcao == 3) {
               listaClientes.forEach((chave, valor) -> {
                   System.out.println("ID: " + chave + " - " + valor.exibirNomeIdade());
                 });
               
               System.out.print("Digite o ID do cliente que você deseja excluir: ");
               id = ler.nextInt();
               
               if (listaClientes.containsKey(id)) {
            	   listaClientes.remove(id);
            	   System.out.printf("Cliente excluído com sucesso!");
               }
               else
            	   System.out.printf("Cliente não encontrado!");
               
               System.in.read();
           }
           else if(opcao == 4) {
               listaClientes.forEach((chave, valor) -> {
                   System.out.println("ID: " + chave + " - " + valor.exibirNomeIdade());
                   
                   if (valor.getConta() != null)
                	   System.out.println(valor.exibirDadosConta());
                 });

               System.in.read();
           }
           
           else if(opcao == 5) {
        	   
        	   int opd;
        	   
        	   System.out.println("Deseja realizar o depósito em qual conta?");
        	   System.out.println("1- Conta Corrente\n"+ "2- Conta Poupança");
        	   opd = ler.nextInt();
        	   
        	   if(opd == 1) {
        		   
        		   System.out.println("Digite o id do cliente que deseja depositar");
        		   int id1 = ler.nextInt();
        		   System.out.println("Digite o valor que deseja depositar: ");
        		   listaClientes.get(id1).getConta().Depositar(ler.nextDouble());
   
        	   }
        	   
        	   else if(opd == 2) {
        		 
        		   System.out.println("Digite o id do cliente que deseja depositar");
        		   int id1 = ler.nextInt();
        		   System.out.println("Digite o valor que deseja depositar: ");
        		   listaClientes.get(id1).getConta().Depositar(ler.nextDouble());
        		   
        	   
        	   }
        	   
           }
           
           
           
           else if(opcao == 6) {
        	   
           }
           
           
           else if(opcao == 7) {
        	   
           }
           
           else if(opcao == 8) {
        	   
           }
           
         
        }while( (opcao >= 1) && (opcao <= 9) );
        
        ler.close();
    }

}
