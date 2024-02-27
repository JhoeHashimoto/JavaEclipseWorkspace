package Repositorio;


import Model.Produto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;

import java.time.LocalDateTime;

public class ProdutoRepositorio {
	
	
	private static List<Produto> produtos;
	
	static {
		produtos = new Vector<>();
		
		Produto celular = new Produto();
		
		celular.setNome("Iphone 14 Pro Max");
		celular.setDescricao("Aparelho Celular");
		celular.setCategoria(RepositorioCategoria.findById(2l));
		celular.setDataCadastro(LocalDateTime.now());
		celular.setPreco(BigDecimal.valueOf(12000));
		
		
		
		save(celular);
		
	}
	public static Produto save(Produto produto) {
		if(!produtos.contains(produto)) {
			produto.setId((long) produtos.size() + 1);
			produtos.add(produto);
			return produto;
	
		
		}else {
			JOptionPane.showInternalMessageDialog(null, "Já existe produto cadastrado com o mesmo nome!");
			return null;
		}
	}
	public static Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	}
	
	

