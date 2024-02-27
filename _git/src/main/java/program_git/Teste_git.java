package program_git;

import java.io.IOException;
import java.util.Scanner;
import model_git.Info;
import service_git.git_service;

public class Teste_git {


	    public static void main(String[] args) {


	        git_service gitservice = new git_service();
	       
	        Scanner ler = new Scanner(System.in);
	       
	        String login_git;
	       
	        System.out.print("Digite o login do github: ");
	        login_git = ler.next();
	       


	        try {
	            Info info = gitservice.getInfo(login_git);
	           
	            System.out.println(info.getLogin() + "\n");
	            System.out.println(info.getName() + "\n");
	            System.out.println(info.getFollowers() + "\n");
	            System.out.println(info.getPublic_repos());
	           
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }  
	        
	        ler.close();
	    }
	}




