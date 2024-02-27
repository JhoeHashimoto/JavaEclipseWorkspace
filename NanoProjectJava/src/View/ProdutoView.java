package View;

/*import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import Model.Categoria;
import Model.Produto;
import Repositorio.ProdutoRepositorio;
import Repositorio.RepositorioCategoria;

import javax.swing.JOptionPane;

public class ProdutoView {
	
	public static Produto form() {
		
		
		Categoria categoria = CategoriaView.form();
		
		do {
			categoria = CategoriaView.form();
			
		}while(categoria==null);
		String nome = "";
		
		do {
			 nome = JOptionPane.showInputDialog(null, "Informe o nome do produto: ");
		}while (nome.equals(""));
		
		
		String descricao = "";
		
		do {
			 descricao = JOptionPane.showInputDialog(null, "Informe a descricao do produto: ");
		}while (descricao.equals(""));
		
		double preco = 0;
		
		do {
		try {
			 preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preco do produto: "));
		}catch (Exception e) {
			preco = 0;
		}
		}while (preco<=0);
		
		
		
		
		Produto ret = new Produto();
		
		ret.setCategoria(categoria);
		ret.setNome(nome);
		ret.setDescricao(descricao);
		ret.setDataCadastro(LocalDateTime.now());
		ret.setPreco(BigDecimal.valueOf(preco));
		
		return ret;
	}
	
	  public void sucesso() {
	        JOptionPane.showMessageDialog(null, "Produto foi salva com sucesso!");
	    }

	  public void sucesso(Produto produto) {
	        JOptionPane.showMessageDialog(null, "Produto " + produto.getNome() + " foi salvo com sucesso!");
	    }
	  
	  public static Produto select(Produto produto) {
	        //@formatter:off

	        List<Produto> produtos = RepositorioCategoria.findAll();

	        Produto ret = (Produto) JOptionPane.showInputDialog(
	                null, // componente pai . Como não temos será null
	                "Selecione uma categoria",
	                "Menu",
	                JOptionPane.QUESTION_MESSAGE,
	                null, // ícone
	                ProdutoRepositorio.toArray(), // Número da opção
	                produto == null ? produtos.get(0) : produto);

	        return ret;
	        //@formatter:on
}
*/
