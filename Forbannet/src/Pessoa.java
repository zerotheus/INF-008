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

    public static Pessoa instanceJoao() throws Exception {
        if (Pessoa.getSobrenome() != null) {
            throw new Exception("Joao ja instanciado");
        }
        Filho joao = new Filho();
        return joao;
    }

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

    public void listAtecessores() {
        Pessoa antecessor = getAntecessor();
        if (antecessor != null) {
            System.out.println(antecessor.getNome());
            antecessor.listAtecessores();
        }
    }

    public abstract Pessoa cadastraFilho(String nome, char sexo) throws Exception;

    protected abstract Pessoa adicionaFilho(String nome, Pessoa antecessor, char sexo) throws Exception;

    protected abstract boolean seraNatimorto(char sexo, Pessoa antecessor) throws Exception;

}
