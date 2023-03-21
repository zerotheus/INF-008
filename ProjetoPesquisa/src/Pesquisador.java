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

    public void getOrientadoresSuperiores(){
        if(this.orientador != null){
        System.out.println(this.orientador.getNome());
            this.orientador.getOrientadoresSuperiores();
        }
    }

    public abstract double getPagameto();

    public abstract void listaPesquisadores() throws Exception;

    public abstract void adicionaPesquisador(Pesquisador pesquisador) throws Exception;

}
