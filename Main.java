
public class Main {

	public static void main(String[] args) {
		Cliente alberto = new Cliente();
		alberto.setNome("Alberto");
		
		Conta cc = new ContaCorrente(alberto);
		Conta poupanca = new ContaPoupanca(alberto);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}