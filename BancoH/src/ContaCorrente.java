public class ContaCorrente extends Conta {

    public ContaCorrente(String nome, String cpf, int num) {
        super(nome, cpf, num);
    }

    @Override
    public double atualizacaoMensal() {
        return super.saldo - 1;
    }

}
