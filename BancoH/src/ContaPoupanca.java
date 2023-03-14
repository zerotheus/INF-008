public class ContaPoupanca extends Conta {

    public ContaPoupanca(String nome, String cpf, int num) {
        super(nome, cpf, num);

    }

    @Override
    public double atualizacaoMensal() {
        return super.saldo * 1.01;
    }
}
