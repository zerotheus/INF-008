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

    void listarChefes() {
        Pessoa chefe = this.getChefe();
        while (chefe.getClass() == this.getClass()) {
            final Empregado chefeEmpregado = (Empregado) chefe;
            chefeEmpregado.listarChefes();
            System.out.println(this.getChefeName());
            return;
        }
        if (chefe.getClass() != this.getClass()) {
            System.out.println(chefe.getNome());
        }
    }

    @Override
    void listarEmpregadosDiretos() {
        for (int i = 0; i < empregados.size(); i++) {
            System.out.println(empregados.get(i).getNome());
        }
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
