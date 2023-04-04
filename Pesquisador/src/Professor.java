public class Professor extends Pesquisador {

    public Professor(String nome, Coordenador coordenador) {
        super(nome, coordenador);
    }

    @Override
    public Pesquisador pegaMara() throws Exception {
        throw new Exception("Esta classe nao pode instanciar Mara");
    }

    @Override
    public void inserirPesquisador(Pesquisador pesquisador) {
        System.out.println("Professores nao inserem pesquisadores");
        return;
    }

    @Override
    public double getValorPago() {
        double valor;
        valor = 220 + (0.3 * this.getCoordenador().getValorPago());
        return 0;
    }

}
