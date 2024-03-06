package Override;

public class ContaCorrente extends Conta{
	//HERDANDO OS ATRIBUTOS, MÉTODOS E CONSTRUTORES DA CLASSE CONTA

	    private double chequeEspecial;


	    public double getChequeEspecial() {
	        return chequeEspecial;
	    }


	    public void setChequeEspecial(double chequeEspecial) {
	        this.chequeEspecial = chequeEspecial;
	    }
	   
	    public ContaCorrente() {
	    }
	   
	    public ContaCorrente(String agencia, String numero, double salario, double chequeEspecial) {
	        super(agencia, numero, salario);
	       
	        this.chequeEspecial = chequeEspecial;
	    }
	   
	    //SOBREESCREVENDO O MÉTODO DEPOSITAR (TIPO DE POLIMORFISMO)
	    //CHAMANDO A ASSINATURA ORIGINAL DO MÉTODO DA CLASSE PAI
	    public void Depositar(double valor) {
	    	
	    	//CHAMANDO O MÉTODO DA CLASSE PAI
	        super.Depositar(valor);
	       
	        //PASSANDO UM NOVO COMPORTAMENTO PARA O MÉTODO
	        valor = valor - 0.10;
	        
	        //SETANDO NOVO VALOR PARA O MÉTODO
	        this.setSaldo(valor);
	    }
	}

