public class Professor extends Pesquisador {

    public Professor(String nome, Pesquisador orientador) {
        super(nome, orientador);
    }

    @Override
    public double getPagameto() {

        return 220 + 0.3 + super.getOrientador().getPagameto();
    }

    @Override
    public void listaPesquisadores() throws Exception {
        throw new UnsupportedOperationException("Esta pessoa nao tem pesquisadores");
    }

    @Override
    public void adicionaPesquisador(Pesquisador pesquisador) throws Exception {
        throw new UnsupportedOperationException("Esta pessoa nao pode adicionar pesquisadores");
    }

}
