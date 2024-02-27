package Model;
/*import java.time.LocalDateTime;

import Repositorio.ProdutoRepositorio;
import Repositorio.RepositorioCategoria;
import View.CategoriaView;
import View.Opcao;

import java.math.BigDecimal;


public class ProgramaProjeto {
	public static void main(String[] args) {
		
	
		Opcao opcao = null;
		
		do {
			
			switch(opcao) {
				case CADASTRAR_CATEGORIA -> cadastrarCategoria();
				case CADASTRAR_PRODUTO -> cadastrarProduto();
				case CONSULTAR_PRODUTO_POR_ID -> consultarProdutoPorId();
				case CONSULTAR_PRODUTO_POR_CATEGORIA -> consultarPordutoPorCategoria();
				case ENCERRAR_SISTEMA -> encerrarOSistema();
			}
			
		
		
		
		}while (opcao != Opcao.ENCERRAR_SISTEMA);
		
			{
			
			
			
		
			}
	}

	private static Object encerrarOSistema() {
		System.exit(0);
	}

	private static Object consultarPordutoPorCategoria() {
		
	}

	private static Object consultarProdutoPorId() {
		Produto produto = ProdutoView.form();
		ProdutoRepositorio.save(produto);
		ProdutoView.sucesso();
	}

	private static Object cadastrarProduto() {
		
	}

	private static Object cadastrarCategoria() {
		CategoriaView view = new CategoriaView();
		Categoria categoria = view.form();
		RepositorioCategoria.save(categoria);
		view.sucesso(categoria);
	}
	
}
*/