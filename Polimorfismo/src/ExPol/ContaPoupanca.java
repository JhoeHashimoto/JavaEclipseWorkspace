package ExPol;

public class ContaPoupanca extends Conta{
	
    private double rentabilidade;


    public double getRentabilidade() {
        return rentabilidade;
    }


    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
   
    public ContaPoupanca() {
    }
   
    public ContaPoupanca(String agencia, String numero, double salario, double rentabilidade) {
        super(agencia, numero, salario);
       
        this.rentabilidade = rentabilidade;
    }
   
    
    //SOBREESCREVENDO O MÉTODO DEPOSITAR DA CLASSE CONTA
    //CHAMANDO A ASSINATURA PADRÃO DO MÉTODO NA CLASSE PAI
    
    public void Depositar(double valor) {
    
    	
    	//CHAMANDO O MÉTODO DA CLASSE PAI
        super.Depositar(valor);
       
        
        //PASSANDO UM NOVO PARAMETRO PARA O MÉTODO
        valor = valor + 0.50;
        
        //SETANDO UM NOVO VALOR PARA O MÉTODO
        this.setSaldo(valor);
    }
    
    public void Sacar(double valor) {
    	super.Sacar(valor);
    	
    	valor = valor - 5.00;
    	
    	this.setSaldo(valor);
}
}
