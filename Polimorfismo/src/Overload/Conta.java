package Overload;
//NÃO UTILIZA HERANÇA
//2 ou mais MÉTODOS COM O MESMO NOME, NO ENTANTO COM DIFERENTES PARÂMETROS

public class Conta {

    private String agencia;
    private String numero;
    private double saldo;
   
    public String getAgencia() {
        return agencia;
    }


    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    protected String exibirMensagem() {
        return "Bem vindo ao Internet Banking do Prof. Joseffe!";
    }  
   
    Conta(){
       
    }
   
    Conta(String agencia, String numero, double salario){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = salario;
    }
   
    
    //3 TIPOS DE MÉTODOS COM O MESMO NOME, NO ENTANTO COM PARÂMETROS DIFERENTES com base no tipo, 
    // o TIPO DEVE SER DIFERENTE
    public void Depositar(double valor) {
        this.saldo += valor;
    }
   
    public void Depositar(double valor, String nomeDepositante) {
        this.saldo += valor;
    }
   
    public void Depositar(double valor, String nomeDepositante, String telefoneDepositante) {
        this.saldo += valor;
    }

}
