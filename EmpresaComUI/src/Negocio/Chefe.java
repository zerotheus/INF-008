package Negocio;

public class Chefe extends Pessoa {

    public Chefe(String nome, Pessoa superior) {
        super(nome, superior);
    }

    @Override
    public Pessoa adicionaEmpregado(String nome) throws Exception {
        Pessoa empregado = new Empregado(nome, this);
        getEmpregados().add(empregado);
        return empregado;
    }

    @Override
    public Pessoa adicionaEmpregadoChefe(String nome) throws Exception {
        Pessoa empregado = new Chefe(nome, this);
        getEmpregados().add(empregado);
        return empregado;
    }

}
