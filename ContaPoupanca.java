public class ContaPoupanca extends Conta {
 @Override
  public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Poupança === ");
    System.out.println(String.format("Agencia: %d", super.agencia));
    System.out.println(String.format("Numero: %d", super.numero));
    System.out.println(String.format("Saldo: %d", super.saldo));
  }
}