
public class Main {

	public static void main(String[] args) {
		Cliente Carlos = new Cliente();
		Carlos.setNome("Carlos");
		
		Conta cc = new ContaCorrente(Carlos);
		Conta poupanca = new ContaPoupanca(Carlos);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
