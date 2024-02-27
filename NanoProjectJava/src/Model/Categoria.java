package Model;

import java.util.Objects;

public class Categoria {
	
		//ATRIBUTOS
	private Long id;
	private String categoria;
		
		//CONSTRUTORES
	public Categoria() {
		
	}
	
	public Categoria(Long id, String categoria) {
		this.id = id;
		this.categoria = categoria;
	}
	
	public Categoria(String categoria) {
		this.categoria = categoria;
	}

		//MÉTODOS ACESSORES GETTERS AND SETTERS
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
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
		return Objects.hash(categoria, id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(categoria, other.categoria) && Objects.equals(id, other.id);
	}


		

	
	
		//MÉTODO TOSTRING()
	


	@Override
	public String toString() {
		return "Categoria [id=" + id + ", categoria=" + categoria.toUpperCase()+ "]";
	}

	public String getNome() {
		
		return null;
	}
	
	
	
	
		
	
	
	
	
	
	
}
