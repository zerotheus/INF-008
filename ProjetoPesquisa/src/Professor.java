public class Professor extends Pesquisador {

    public Professor(String nome, Pesquisador orientador) {
        super(nome, orientador);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double getPagameto() {

        return 220 + 0.3 + super.getOrientador().getPagameto();
    }

    @Override
    public void listaPesquisadores() throws Exception {
        throw new UnsupportedOperationException("Unimplemented method 'listaPesquisadores'");
    }

}
