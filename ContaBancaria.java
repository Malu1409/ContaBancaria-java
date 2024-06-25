package ContaBancaria;

// Classe abstrata ContaBancaria (abstração)
public abstract class ContaBancaria {

    // Encapsulamento dos atributos
    private String numeroConta;
    private String titular;
    protected double saldo; // Atributo protegido para ser acessível às subclasses

    // Construtor
    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0; // Saldo inicial é zero
    }

    // Métodos getters
    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos abstratos (abstração)
    public abstract void depositar(double valor);

    public abstract void sacar(double valor);

    // Método para exibir informações da conta
    public void exibirInfo() {
        System.out.println("Conta Bancária - Número: " + numeroConta + ", Titular: " + titular + ", Saldo: R$" + saldo);
    }
}
