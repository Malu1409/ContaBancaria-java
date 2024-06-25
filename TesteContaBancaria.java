package ContaBancaria;

// Classe principal para testar a hierarquia de classes
public class TesteContaBancaria {

    public static void main(String[] args) {
        // Exemplo de polimorfismo: referência do tipo ContaBancaria apontando para objetos de suas subclasses
        ContaBancaria conta1 = new ContaCorrente("12345-6", "João Silva");
        ContaBancaria conta2 = new ContaPoupanca("54321-0", "Maria Souza");

        // Realizando operações
        conta1.depositar(1000.0);
        conta2.depositar(500.0);
        conta1.sacar(300.0);
        conta2.sacar(100.0);

        // Exibindo informações das contas
        conta1.exibirInfo();
        conta2.exibirInfo();
    }
}
