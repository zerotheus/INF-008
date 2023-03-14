public class ContaCorrente extends Conta {

    public ContaCorrente(String nome, String cpf, int num) {
        super(nome, cpf, num);
    }

    @Override
    public void atualizacaoMensal() {
        super.saldo = super.saldo - 1;
        return;
    }

}
