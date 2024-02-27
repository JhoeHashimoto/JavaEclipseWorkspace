package Model;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Produto {
		
			//ATRIBUTOS
		private Long id;
		private String nome;
		private String descricao;
		private BigDecimal preco;
		private LocalDateTime dataCadastro;
		
		Categoria categoria;
		
		
			//CONSTRUTORES
		
		public Produto() {
			
		}
		
		public Produto(Long id, String nome, BigDecimal preco, LocalDateTime dataCadastro, Categoria categoria) {
			this.id = id;
			this.nome = nome;
			this.preco = preco;
			this.dataCadastro = dataCadastro;
			this.categoria = categoria;
			
		}
		public Produto( String nome, BigDecimal preco, LocalDateTime dataCadastro, Categoria categoria) {
			this.nome = nome;
			this.preco = preco;
			this.dataCadastro = dataCadastro;
			this.categoria = categoria;
			
			//MÉTODOS ACESSORES
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public BigDecimal getPreco() {
			return preco;
		}

		public void setPreco(BigDecimal preco) {
			this.preco = preco;
		}

		public LocalDateTime getDataCadastro() {
			return dataCadastro;
		}

		public void setDataCadastro(LocalDateTime dataCadastro) {
			this.dataCadastro = dataCadastro;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		
				//MÉTODO HASHCODE 
		
		
				/*MÉTODO HASHCODE AND EQUALS
				
				comparação de objetos diferentes com mesmo valores, cada objeto tem um hashcode(endereco) diferente
				apartir de atributos com tipos iguais.
				
				logo quando comparamos com equals de objeto diretamente no programa sem instanciar esse método, 
				o programa irá printar que os valores de objetos são diferentes mesmo sendo iguais.
					sendo assim devemos declarar sobreescrevendo os dois métodos nas classes antes de puxar no programa
					o método por ordem vem antes do tostring
					o hashcode será o mesmo a partir dos atributos iguais se tiver
					System.out.println(objeto1.equals(objeto2))
						ao fizer esta comparacao no programa ira retornar verdadeiro, ja que sobrescrevemos o programa, o hashcode será o mesmo

				*/
		
		
		@Override
		public int hashCode() {
			return Objects.hash(nome);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Produto other = (Produto) obj;
			return Objects.equals(nome, other.nome);
		}
		
		//MÉTODO TOSTRING() necessário para exibição quando printamos o objeto
		@Override
		public String toString() {
			return "Produto [id=" + id + ", nome=" + nome.toUpperCase() + ", descricao=" + descricao + ", preco=" + preco
					+ ", dataCadastro=" + dataCadastro + ", categoria=" + categoria + "]";
		}

		
		
		
		//INTELIJ consegue gerar um UML
}

