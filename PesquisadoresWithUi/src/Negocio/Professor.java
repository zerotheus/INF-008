package Negocio;

public class Professor extends Pesquisador {

    protected Professor(String nome, Coordenador coordenador) {
        super(nome, coordenador);
        coordenador.inserirPesquisador(this);
    }

    @Override
    protected void inserirPesquisador(Pesquisador pesquisador) {
        System.out.println("Professores nao inserem pesquisadores");
        return;
    }

    @Override
    public double getValorPago() {
        double valor;
        valor = 220 + (0.3 * this.getCoordenador().getValorPago());
        return valor;
    }

    @Override
    public void listaTodosPesquisadores() {
        return;
    }

    @Override
    public Pesquisador cadastraPesquisador(String nome, int tipo) throws Exception {
        throw new Exception("professor nao insere pesquisador");
    }

}
