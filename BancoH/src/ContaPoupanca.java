public class ContaPoupanca extends Conta {

    public ContaPoupanca(String numero) {
        super(numero);
    }

    @Override
    public void atualizacaoMensal() {
        this.deposita(0.01 * getSaldo());
    }

}
