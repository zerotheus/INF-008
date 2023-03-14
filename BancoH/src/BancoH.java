public class BancoH {

    private Cliente clientes[];

    public BancoH() {
        clientes = new Cliente[4];
    }

    public void mainBanco() {
        adicionaClienteCorrente("null", "cpf 0", 0);
        adicionaClientePoupanca("brasileiro", "Collor vai pegar o dinheiro", 1);
        adicionaClientePoupanca("agiota", "dinheiro", 2);
        adicionaClientePoupanca("poupanca", "1% ano mes mt bom", 3);

        sacadeumaConta();
        depositaemUmaConta();

        for (int i = 0; i < clientes.length; i++) {
            System.out.println(clientes[i].getNome());
            System.out.println(clientes[i].getConta().getSaldo());
            System.out.println("Att mensal");
            clientes[i].getConta().atualizacaoMensal();
            System.out.println(clientes[i].getConta().getSaldo());
        }

        exibeTotaldoBanco();

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

    public Conta procuraConta(int num) {
        for (int i = 0; i < clientes.length; i++) {
            if (num == clientes[i].getConta().getNum()) {
                return clientes[i].getConta();
            }
        }
        System.out.println("conta nao encontrada");
        return null;
    }

    public boolean depositaemUmaConta() {
        System.out.println("Digite o numero da conta onde Deseja depositar");
        final int input = 1;
        Conta c = procuraConta(input);
        if (c != null) {
            c.deposita(34);
            return true;
        }
        return false;
    }

    public boolean sacadeumaConta() {
        System.out.println("Digite o numero da conta onde deseja sacar");
        final int input = 0;
        Conta c = procuraConta(input);
        if (c != null) {
            c.saca(30);
            return true;
        }
        return false;
    }

    public void exibeTotaldoBanco() {
        double total = 0;
        for (int i = 0; i < clientes.length; i++) {
            total += clientes[i].getConta().getSaldo();
        }
        System.out.println(total);
    }
}
