package Negocio;

public class Coordenador extends Pesquisador {

    protected Coordenador(String nome, Coordenador coordenador) {
        super(nome, coordenador);
        coordenador.inserirPesquisador(this);
    }

    private Coordenador() {
        super();
    }

    public static Pesquisador pegaMaraCordenadora() throws Exception {
        if (Pesquisador.isMaraIstanciate()) {
            throw new Exception("So pode ter uma mara");
        }
        Pesquisador mara = new Coordenador();
        return mara;
    }

    @Override
    protected void inserirPesquisador(Pesquisador pesquisador) {
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

    @Override
    public void listaTodosPesquisadores() {
        for (int i = 0; i < pesquisadores.size(); i++) {
            pesquisadores.get(i).listaTodosPesquisadores();
            System.out.println(pesquisadores.get(i).getNome());
        }
        return;
    }

    @Override
    protected Pesquisador cadastraPesquisador(String nome, int tipo) {
        Pesquisador pesquisador;
        if (tipo == 1) {
            pesquisador = new Coordenador(nome, this);
        } else {
            pesquisador = new Professor(nome, this);
        }
        return pesquisador;
    }

}
