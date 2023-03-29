import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    private String nome;
    private static String sobrenome = null;
    private List<Pessoa> filhos;
    private Pessoa antecessor;

    private char sexo;

    public Pessoa() throws Exception {
        if (sobrenome != null) {
            throw new Exception("So pode ter um joao");
        }
        this.nome = "Joao";
        Pessoa.sobrenome = "forbannet";
        filhos = new ArrayList<Pessoa>();
        this.antecessor = null;
        this.sexo = 'm';
    }

    public Pessoa(String nome, Pessoa antecessor, char sexo) throws Exception {
        if (antecessor == null) {
            throw new Exception("antecessor nao pode ser nulo");
        }
        this.nome = nome;
        filhos = new ArrayList<Pessoa>();
        this.antecessor = antecessor;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pessoa> getFilhos() {
        return filhos;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Pessoa getAntecessor() {
        return antecessor;
    }

    protected abstract boolean seraNatimorto() throws Exception;

    public abstract Pessoa cadastraFilho(char sexo, String nome) throws Exception;
}

// = 50% do bb menino morrer antes
// antecessor = 2 bb morrer
