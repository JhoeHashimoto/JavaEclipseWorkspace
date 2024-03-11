package CadProd;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
 
	public class Programa {
	 
	    public static void main(String[] args) throws IOException{
	        Scanner ler = new Scanner(System.in);
	       
	        HashMap<Integer, Produto> listaProdutos = new HashMap<Integer, Produto>();
	       
	        int opcao;
	        int id;
	        Produto prod;
	        int id_produto=0;
	        int id_categoria=0;
	        String possuiCategoria;
	 
	        do {        
	           System.out.printf("===> Sistema de Cadastro de Produtos <===\n\n");
	           System.out.printf("Escolha uma opção:\n");          
	           System.out.printf("1 - Incluir \n" +
	                             "2 - Atualizar \n" +
	                             "3 - Excluir \n" +
	                             "4 - Exibir \n" +
	                             "5 - Sair\n\n");


	           System.out.printf("Digite a opção desejada: ");
	           opcao = ler.nextInt();
	           
	           if (opcao == 1) {
	               Produto produto = new Produto();
	               
	               id_produto++;
	               produto.setId(id_produto);
	               
	               System.out.print("Digite o nome do produto: ");
	               produto.setNome(ler.next());
	               
	               System.out.print("Digite o preço do produto: ");
	               produto.setPreco(ler.nextDouble());
	               
	               System.out.print("Digite a quantidade do produto: ");
	               produto.setQuantidade(ler.nextDouble());
	               
	               System.out.print("Possui categoria? S/N");
	               possuiCategoria = ler.next().toUpperCase();
	               
	               if(possuiCategoria.equals("S")) {
	                   Categoria categoria = new Categoria();
	                   
	                   id_categoria++;
	                   categoria.setId(id_categoria);
	                   
	                   System.out.print("Digite o nome da categoria: ");
	                   categoria.setNome(ler.next());
	                                     
	                   produto.setCategoria(categoria);
	               }
	               else {
	            	   produto.setCategoria(null);                
	               }
	               
	               listaProdutos.put(id_produto, produto);
	               
	               System.out.printf("Produto incluído com sucesso!");
	               System.in.read();
	           }
	           else if(opcao == 2) {              
	        	   listaProdutos.forEach((chave, valor) -> {
	                   System.out.println("ID: " + chave + " - " + valor.exibirNomePreco());
	                 });

	               
	               System.out.print("Digite o ID do produto que você deseja atualizar: ");
	               id = ler.nextInt();
	               
	               if (listaProdutos.containsKey(id)) {
	            	   prod = listaProdutos.get(id);   
	                   
	                   System.out.print("Digite novo nome do produto: ");
	                   prod.setNome(ler.next());
	                   
	                   System.out.print("Digite o novo preço do produto: ");
	                   prod.setPreco(ler.nextDouble());
	                   
	                   System.out.print("Digite a nova quantidade do produto: ");
	                   prod.setQuantidade(ler.nextDouble());
	                   
	                   System.out.printf("Produto atualizado com sucesso!");
	               }
	               else {
	                   System.out.printf("Produto não encontrado!");
	               }
	               System.in.read();
	           }
	           else if(opcao == 3) {
	        	   listaProdutos.forEach((chave, valor) -> {
	                   System.out.println("ID: " + chave + " - " + valor.exibirNomePreco());
	                 });
	               
	               System.out.print("Digite o ID do produto que você deseja excluir: ");
	               id = ler.nextInt();
	               
	               if (listaProdutos.containsKey(id)) {
	            	   listaProdutos.remove(id);
	            	   System.out.printf("Produto excluído com sucesso!");
	               }
	               else
	            	   System.out.printf("Produto não encontrado!");
	               
	               System.in.read();
	           }
	           else if(opcao == 4) {
	        	   listaProdutos.forEach((chave, valor) -> {
	                   System.out.println("ID: " + chave + " - " + valor.exibirNomePreco());
	                   
	                   if (valor.getCategoria() != null)
	                	   System.out.println(valor.exibirProdutoCategoria());
	                 });

	               System.in.read();
	           }
	           
	        }while( (opcao >= 1) && (opcao <= 4) );
	    }
	}