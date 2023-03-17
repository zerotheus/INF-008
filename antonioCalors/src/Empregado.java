import java.util.ArrayList;
import java.util.List;

public class Empregado extends Pessoa {

    private Pessoa chefe;
    private List<Empregado> empregados;
    private int contaEmpregados;

    Empregado(String nome, Pessoa chefe, int registro) {
        super(nome, registro);
        this.chefe = chefe;
        this.empregados = new ArrayList<Empregado>();
    }

    @Override
    void empregadosSubordinados() {
        for (int i = 0; i < empregados.size(); i++) {
            Pessoa empregado = empregados.get(i);
            empregado.empregadosSubordinados();
            Empregado chefe = (Empregado) empregado;
            System.out.println(empregado.getNome() + " Chefe: " + chefe.getChefeName());
        }
    }

    @Override
    void listarChefes() {
        // TODO Auto-generated method stub

    }

    @Override
    void listarEmpregados() {
        // TODO Auto-generated method stub

    }

    public Pessoa getChefe() {
        return this.chefe;
    }

    public String getChefeName() {
        return this.chefe.getNome();
    }

    public List<Empregado> getEmpregados() {
        return empregados;
    }

    public void setEmpregadosUm(Empregado empregados) {
        this.empregados.add(empregados);
    }

    @Override
    void addEmpregado(Empregado empregada) {
        empregados.add(empregada);
    }

}
