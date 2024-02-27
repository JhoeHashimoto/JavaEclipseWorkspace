package program;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.http.client.ClientProtocolException;

import model.Desenvolvedor;
import service.DesenvolvedorService;

public class Programa {


	    public static void main(String[] args) throws IOException{
	        Scanner ler = new Scanner(System.in);
	       
	        ArrayList<Desenvolvedor> listaDevs = new ArrayList<>();
	       
	        int opcao;
	        String id;
	        String nome;
	        String email;
	        String loginGitHub;
	        
	        DesenvolvedorService desenvolvedorService = new DesenvolvedorService(); 
	        
	        do {        
	            System.out.printf("===> Sistema de Cadastro de Devs <===\n\n");
	            System.out.printf("Escolha uma opção:\n");
	            System.out.printf("1 - Incluir \n" +
	                              "2 - Atualizar \n" +
	                              "3 - Excluir \n" +
	                              "4 - Exibir \n" +
	                              "5 - Sair\n\n");
	            System.out.printf("Digite a opção desejada: ");
	            opcao = ler.nextInt();
	           
	            if (opcao == 1) {               
	                System.out.printf("\nDigite o nome: ");
	                nome = ler.next();
	                
	                System.out.printf("\nDigite o e-mail: ");
	                email = ler.next();
	                
	                System.out.printf("\nDigite o seu login no GitHub: ");
	                loginGitHub = ler.next();
	                               
	                Desenvolvedor d = desenvolvedorService.getInfoDesenvolvedor(loginGitHub);
	                 
	                d.setNome(nome);
	                d.setEmail(email);
	                d.setLogin(loginGitHub);
	                
	                listaDevs.add(d);
	               
	                System.out.printf("Dev incluído com sucesso!");
	                System.in.read();
	            }
	            else if (opcao == 2) {          
	                for (Desenvolvedor a: listaDevs) {
	                    System.out.printf("ID: %s - Nome: %s - E-mail: %s - Qtd. Repos: %s \n", a.getId(), a.getNome(), a.getEmail(), a.getPublic_repos());
	                }
	               
	                System.out.printf("\nDigite o id da pessoa que deseja atualizar: ");
	                id = ler.next();
	               
	                Desenvolvedor dev = null;
	                
	                for (Desenvolvedor a: listaDevs) {
	                	if (a.getId().equals(id)) {
	                		dev = a;
	                		break;
	                	}
	                }
	                
	                if (dev == null) {
	                	System.out.printf("Desenvolvedor não encontrado!");
	                	continue;
	                }
	                else {
	                    System.out.printf("Digite o novo email: ");
	                    dev.setEmail(ler.next());
	                }
	               
	                System.out.printf("Desenvolvedor atualizado com sucesso!");
	                System.in.read();
	            }
	            else if (opcao == 3) {
	                for (Desenvolvedor a: listaDevs) {
	                    System.out.printf("ID: %s - Nome: %s - E-mail: %s - Qtd. Repos: %s \n", a.getId(), a.getNome(), a.getEmail(), a.getPublic_repos());
	                }
	               
	                System.out.printf("\nDigite o id da pessoa que deseja excluir: ");
	                id = ler.next();

	                Desenvolvedor dev = null;
	                
	                for (Desenvolvedor a: listaDevs) {
	                	if (a.getId().equals(id)) {
	                		dev = a;
	                		break;
	                	}
	                }
	                
	                if (dev == null) {
	                	System.out.printf("Desenvolvedor não encontrado!");
	                	continue;
	                }
	                else {
	                	listaDevs.remove(dev);
	                }
	               
	                System.out.printf("Desenvolvedor excluído com sucesso!");
	                System.in.read();
	            }
	            else if (opcao == 4) {
	                for (Desenvolvedor a: listaDevs) {
	                    System.out.printf("ID: %s - Nome: %s - E-mail: %s - Qtd. Repos: %s \n", a.getId(), a.getNome(), a.getEmail(), a.getPublic_repos());
	                }
	               
	                System.in.read();
	            }
	        }while(opcao != 5);       
	        
	        ler.close();
	    }
	}