public class ContaPoupanca extends Conta {

    public ContaPoupanca(String nome, String cpf, int num) {
        super(nome, cpf, num);

    }

    @Override
    public void atualizacaoMensal() {
        super.saldo = super.saldo * 1.01;
        return;
    }
}
