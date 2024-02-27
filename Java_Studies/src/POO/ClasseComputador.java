package POO;

public class ClasseComputador {

		
		/*                   CLASSES
		 *Utilizada para o molde de criação do OBJETO 
		 */
		
		//            DECLARAÇÃO DE ATRIBUTOS
		
		
						private String modelo;
						private String marca;
						private double preco;
						private int memoriaRam;
						private int espacoHD;
						private String processador;
						private boolean placaDeVideoDedicada;
						
						//Adicionando um relacionamento entre classes a partir de outra classe
						ClasseFabricante fabricante;
						
						
						//MÉTODOS ACESSORES PERMITEM ACESSAR OS ATRIBUTOS PRIVADOS
						
						
						public String getModelo() {
							return modelo;
						}

						public void setModelo(String modelo) {
							this.modelo = modelo;
						}

						public String getMarca() {
							return marca;
						}

						public void setMarca(String marca) {
							this.marca = marca;
						}

						public double getPreco() {
							return preco;
						}

						public void setPreco(double preco) {
							this.preco = preco;
						}

						public int getMemoriaRam() {
							return memoriaRam;
						}

						public void setMemoriaRam(int memoriaRam) {
							this.memoriaRam = memoriaRam;
						}

						public int getEspacoHD() {
							return espacoHD;
						}

						public void setEspacoHD(int espacoHD) {
							this.espacoHD = espacoHD;
						}

						public String getProcessador() {
							return processador;
						}

						public void setProcessador(String processador) {
							this.processador = processador;
						}

						public boolean isPlacaDeVideoDedicada() {
							return placaDeVideoDedicada;
						}

						public void setPlacaDeVideoDedicada(boolean placaDeVideoDedicada) {
							this.placaDeVideoDedicada = placaDeVideoDedicada;
						}

						public ClasseFabricante getFabricante() {
							return fabricante;
						}

						public void setFabricante(ClasseFabricante fabricante) {
							this.fabricante = fabricante;
						}
						
						//CONSTRUTORES 
						
						//construtores são necessários para apoiar na hora de instaciar o objeto e popular os atributos
	

						//Construtor padrão que não espera nenhum parametro para o objeto e atribuição de valores nos atributos
						public ClasseComputador() {
							
						}
						
						//Esse construtor permite atribuir variaveis aos atributos do novo objeto
						public ClasseComputador(String modelo, String marca, double preco, int memoriaRam, int espacoHD, String processador, boolean placaDeVideoDedicada) {
							this.modelo = modelo;
							this.marca = marca;
							this.preco = preco;
							this.memoriaRam = memoriaRam;
							this.espacoHD = espacoHD;
							this.processador = processador;
							this.placaDeVideoDedicada = placaDeVideoDedicada;
						}
						
						
				
		//                  MÉTODOS
						
						
						public double calcularDesconto(double desconto) {
							return preco * desconto;
						}
						
						boolean adicionarMemoriaRam(int quantidade) {
							if (quantidade % 2 == 1) {
								return false;
							}
							else {
								memoriaRam += quantidade;
								preco += quantidade * 150;
								return true;
							}
							}
	//MÉTODO TOSTRING  permite ver todos os atributos de uma vez, ao printar o objeto
					/*	#método to string

						toda classe é filha da classe object, sendo assim a object tem um método toString() que é a representação textual de um objeto.

						quanto printamos o objeto somente, ele chama o método tostring da classe object, printando o nome da Classe que estamos chamando o objeto+ endereço da memória “Pessoa@12323443”

						então…

						precisamos sobrescrever o método toString()    através do comando @overrride
						para que o return seja uma String legível com os atributos que desejamos. */


	@Override
	public String toString() {
		return "ClasseComputador [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";

	}
	
	}

