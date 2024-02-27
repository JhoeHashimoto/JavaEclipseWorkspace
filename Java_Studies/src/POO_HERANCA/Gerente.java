package POO_HERANCA;


//Gerente herda da classe empregado  extends referencia a superclasse
public class Gerente extends Empregado{

	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Gerente(double salario, double bonus) {
		
		//HERDANDO O ATRIBUTO DA SUPERCLASSE, poderiamos herdar todos utilizando virgula aqui em baixo e no construtor passando o tipo e o atributo
		super(salario);
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		
		final StringBuilder sb = new StringBuilder("Gerente{");
				sb.append("bonus=").append(bonus);
				sb.append(super.toString());
				sb.append('}');
		return sb.toString();
	}
}