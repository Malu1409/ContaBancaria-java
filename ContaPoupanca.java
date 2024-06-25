package ContaBancaria;

// Subclasse ContaPoupanca que herda de ContaBancaria
public class ContaPoupanca extends ContaBancaria {

    // Construtor específico para ContaPoupanca
    public ContaPoupanca(String numeroConta, String titular) {
        super(numeroConta, titular); // Chama o construtor da superclasse
    }

    // Polimorfismo: Implementação do método depositar
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " na Conta Poupança realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Polimorfismo: Implementação do método sacar
    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " na Conta Poupança realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }
}
