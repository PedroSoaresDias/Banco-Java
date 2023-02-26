import Models.Cliente;
import Models.Conta;
import Models.ContaCorrente;
import Models.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");

        Conta cc = new ContaCorrente(pedro);
        Conta poupanca = new ContaPoupanca(pedro);

        cc.Depositar(1000);
        cc.Transferir(100, poupanca);

        cc.ImprimirExtrato();
        poupanca.ImprimirExtrato();
    }
}
