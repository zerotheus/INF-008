import java.util.ArrayList;
import java.util.List;

public abstract class Pesquisador {
    private String nome;
    private Coordenador coordenador;
    protected List<Pesquisador> pesquisadores;
    private static boolean isMaraIstanciate;

    protected Pesquisador() {
        this.setNome("Mara Andrade");
        this.coordenador = null;
        pesquisadores = new ArrayList<Pesquisador>();
    }

    public Pesquisador(String nome, Coordenador coordenador) {
        this.setNome(nome);
        this.coordenador = coordenador;
        pesquisadores = new ArrayList<Pesquisador>();
    }

    public abstract Pesquisador pegaMara() throws Exception;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pesquisador getCoordenador() {
        return coordenador;
    }

    public List<Pesquisador> getPesquisadores() {
        return pesquisadores;
    }

    public static boolean isMaraIstanciate() {
        return isMaraIstanciate;
    }

    public int getQuantidadedePesquisadores() {

        int quantidade = 0;
        quantidade = pesquisadores.size();

        for (int i = 0; i < pesquisadores.size(); i++) {
            quantidade += pesquisadores.get(i).getQuantidadedePesquisadores();
        }

        return quantidade;
    }

    public abstract void inserirPesquisador(Pesquisador pesquisador);

    public abstract double getValorPago();

}
