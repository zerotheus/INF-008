public class Coordenador extends Pesquisador {

    public Coordenador(String nome, Coordenador coordenador) {
        super(nome, coordenador);
    }

    private Coordenador() {
        super();
    }

    @Override
    public Pesquisador pegaMara() throws Exception {
        if (Pesquisador.isMaraIstanciate()) {
            throw new Exception("So pode ter uma mara");
        }
        Pesquisador mara = new Coordenador();
        return mara;
    }

    @Override
    public void inserirPesquisador(Pesquisador pesquisador) {
        pesquisadores.add(pesquisador);
    }

    @Override
    public double getValorPago() {
        double valor;
        valor = 300 - (300 * (0.025) * this.getQuantidadedePesquisadores());
        if (valor < 0) {
            return 0;
        }
        return valor;
    }

}
