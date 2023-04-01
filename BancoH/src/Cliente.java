public class Cliente {
    private String nome;
    private Conta conta;

    private Cliente(String nome, Conta conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public static Cliente clienteComContaPoupanca(String nome, String numero) {
        Conta conta = new ContaPoupanca(numero);
        Cliente cliente = new Cliente(nome, conta);
        return cliente;
    }

    public static Cliente clienteComContaCorrente(String nome, String numero) {
        Conta conta = new ContaCorrente(numero);
        Cliente cliente = new Cliente(nome, conta);
        return cliente;
    }

    public String getNome() {
        return nome;
    }

    public Conta getConta() {
        return conta;
    }
}
