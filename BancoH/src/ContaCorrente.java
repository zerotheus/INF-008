public class ContaCorrente extends Conta {

    public ContaCorrente(String numero) {
        super(numero);
    }

    @Override
    public void atualizacaoMensal() {
        saca(1);
    }

}
