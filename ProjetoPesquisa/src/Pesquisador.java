public abstract class Pesquisador {
    String nome;
    Pesquisador orientador;

    public Pesquisador(String nome, Pesquisador orientador) {
        this.nome = nome;
        this.orientador = orientador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pesquisador getOrientador() {
        return orientador;
    }

    public void setOrientador(Pesquisador orientador) {
        this.orientador = orientador;
    }

    public abstract double getPagameto();

    public abstract void listaPesquisadores() throws Exception;

}
