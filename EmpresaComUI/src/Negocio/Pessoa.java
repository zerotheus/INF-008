package Negocio;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    private String nome;
    private List<Pessoa> empregados;
    private Pessoa superior;
    protected static boolean FlaviaInstance = false;

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

    public String listaSuperiores() {
        String ListadeSuperiores = "";
        Pessoa superior = getSuperior();
        if (superior != null) {
            System.out.println(superior.getNome());
            ListadeSuperiores += superior.getNome();
            ListadeSuperiores += "\n";
            ListadeSuperiores += superior.listaSuperiores();
        }
        return ListadeSuperiores;
    }

    public String ListaEmpregados() {
        String TodosSubordinados = "";
        for (int i = 0; i < empregados.size(); i++) {
            System.out.println(empregados.get(i).getNome());
            TodosSubordinados += empregados.get(i).getNome();
            TodosSubordinados += "\n";
            TodosSubordinados += empregados.get(i).ListaEmpregados();
        }
        return TodosSubordinados;
    }

    public Pessoa procuraEmpregado(String nome) {
        if (this.getNome().equals(nome)) {
            return this;
        }
        Pessoa pessoaProcurada;
        for (int i = 0; i < empregados.size(); i++) {
            pessoaProcurada = empregados.get(i).procuraEmpregado(nome);
            if (pessoaProcurada != null) {
                return pessoaProcurada;
            }
        }
        return null;
    }

    public static Pessoa getFlavia() throws Exception {
        if (FlaviaInstance) {
            throw new Exception("So pode ter uma Flavia");
        }
        Pessoa.FlaviaInstance = true;
        return new Chefe("Flavia", null);
    }

    public abstract Pessoa adicionaEmpregado(String nome) throws Exception;

    public abstract Pessoa adicionaEmpregadoChefe(String nome) throws Exception;

}
