public class BancoH {

    private Cliente clientes[];

    public BancoH() {
        clientes = new Cliente[4];
    }

    public void mainBanco() {
        adicionaClienteCorrente("null", "cpf 0", 0);
        adicionaClientePoupanca("brasileiro", "Collor vai pegar o dinheiro", 1);
        for (int i = 0; i < 2; i++) {
            System.out.println(clientes[i].getNome());
            System.out.println(clientes[i].getConta().getSaldo());
        }
    }

    public void adicionaClientePoupanca(String nome, String cpf, int pos) {
        ContaPoupanca c = new ContaPoupanca(nome, cpf, pos);
        c.deposita(100);
        clientes[pos] = c;
        clientes[pos].setConta(c);
    }

    public void adicionaClienteCorrente(String nome, String cpf, int pos) {
        ContaCorrente c = new ContaCorrente(nome, cpf, pos);
        c.deposita(100);
        clientes[pos] = c;
        clientes[pos].setConta(c);
    }
}
