package POO_HERANCA;


//SUPERCLASSE
public class Empregado {


		private double salario;
		
		
		//CONSTRUTORES
		
		
		public Empregado() {
			
		}
		
		public Empregado(double salario) {
			this.salario = salario;
		}
		
		
		public double getProventos() {
			return salario;
		}
		
		
		//MÉTODOS ACESSORES getters and setters
		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		
		
		//TO STRING

		@Override
		public String toString() {
			return "Empregado [salario=" + salario + ", getSalario()=" + getSalario() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		
		

	}


