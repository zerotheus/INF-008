import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    private String nome;
    private List<Pessoa> empregados;
    private Pessoa superior;
    protected static boolean antonioInstance = false;

    protected Pessoa(String nome, Pessoa superior) {
        this.nome = nome;
        this.empregados = new ArrayList<Pessoa>();
        this.setSuperior(superior);

    }

    public String getNome() {
        return nome;
    }

    public List<Pessoa> getEmpregados() {
        return empregados;
    }

    public Pessoa getSuperior() {
        return superior;
    }

    public void setSuperior(Pessoa superior) {
        this.superior = superior;
    }

    public void listaSuperiores() {
        Pessoa superior = getSuperior();
        if (superior != null) {
            System.out.println(superior.getNome());
            superior.listaSuperiores();
        }
    }

    public void ListaEmpregados() {
        for (int i = 0; i < empregados.size(); i++) {
            System.out.println(empregados.get(i).getNome());
            empregados.get(i).ListaEmpregados();
        }
    }

    public abstract Pessoa adicionaEmpregado(String nome) throws Exception;

    public abstract Pessoa adicionaEmpregadoChefe(String nome) throws Exception;

}
