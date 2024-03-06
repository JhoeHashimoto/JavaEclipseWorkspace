package Override;

public class Programa {

	public static void main(String[] args) {

		
		ContaCorrente  cc = new ContaCorrente();
		ContaPoupanca  cp = new ContaPoupanca();
		
		cc.Depositar(40);
		cp.Depositar(40);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}

}
