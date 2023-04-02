import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    private String nome;
    private static String sobrenome = null;
    private Pessoa antecessor;
    private List<Pessoa> descendentes;

    protected Pessoa() {
        this.setNome("Joao");
        Pessoa.sobrenome = "Forbannet";
        this.antecessor = null;
        descendentes = new ArrayList<Pessoa>();
    }

    protected Pessoa(String nome, Pessoa antecessor) {
        this.setNome(nome);
        this.setAntecessor(antecessor);
        descendentes = new ArrayList<Pessoa>();
    }

    public abstract Pessoa instanceJoao() throws Exception;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String getSobrenome() {
        return sobrenome;
    }

    public Pessoa getAntecessor() {
        return antecessor;
    }

    protected void setAntecessor(Pessoa antecessor) {
        this.antecessor = antecessor;
    }

    public List<Pessoa> getDescendentes() {
        return descendentes;
    }

    public abstract void cadastraFilho(String nome, char sexo);

    public abstract Pessoa adicionaFilho(String nome, Pessoa antecessor, char sexo);

    protected abstract boolean seraNatimorto(char sexo, Pessoa antecessor);

}
