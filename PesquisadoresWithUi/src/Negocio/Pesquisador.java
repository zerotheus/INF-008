package Negocio;

import java.util.ArrayList;
import java.util.List;

public abstract class Pesquisador {
    private String nome;
    private Coordenador coordenador;
    protected List<Pesquisador> pesquisadores;
    private static boolean isMaraIstanciate = false;

    protected Pesquisador() {
        this.setNome("Mara Andrade");
        this.coordenador = null;
        pesquisadores = new ArrayList<Pesquisador>();
        isMaraIstanciate = true;
    }

    protected Pesquisador(String nome, Coordenador coordenador) {
        this.setNome(nome);
        this.coordenador = coordenador;
        pesquisadores = new ArrayList<Pesquisador>();
    }

    public static Pesquisador pegaMara() throws Exception {
        if (!isMaraIstanciate) {
            return Coordenador.pegaMaraCordenadora();
        }
        throw new Exception("mara ja instanciada");
    }

    public String getNome() {
        return nome;
    }

    public Pesquisador procuraPesquisador(String nome) {
        System.out.println(nome);
        Pesquisador pesquisador = null;
        if (this.getNome().equalsIgnoreCase(nome)) {
            return this;
        }
        for (int i = 0; i < this.pesquisadores.size(); i++) {
            if (this.pesquisadores.get(i).getNome().equalsIgnoreCase(nome)) {
                pesquisador = this.pesquisadores.get(i);
                return pesquisador;
            }
            pesquisador = this.pesquisadores.get(i).procuraPesquisador(nome);
        }
        return pesquisador;
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

    public abstract Pesquisador cadastraPesquisador(String nome, int tipo) throws Exception;

    public abstract void listaTodosPesquisadores();

    protected abstract void inserirPesquisador(Pesquisador pesquisador);

    public abstract double getValorPago();

}
