import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Pessoa> empregados = new ArrayList<Pessoa>();
    private int geraRegistro;

    public Empregado adicionaEmpregado(String nome, Pessoa chefe) {
        geraRegistro++;
        Empregado novoEmpregado = new Empregado(nome, chefe, geraRegistro);
        chefe.addEmpregado(novoEmpregado);
        return novoEmpregado;
    }

    public void adicionaEmpregados() {

    }

    public Pessoa AntonioCarlos() {
        Pessoa AC = new Chefe("Antonio Carlos", geraRegistro);
        empregados.add(AC);
        geraRegistro++;
        return AC;
    }

    public void Empresamain() {

        Pessoa AC = AntonioCarlos();
        Empregado r = adicionaEmpregado("Romilson", AC);
        Empregado f = adicionaEmpregado("Flavia", r);
        Empregado g = adicionaEmpregado("Renato", f);

        AC.empregadosSubordinados();

        // System.out.println(f.getChefe().getNome());

    }

    public void listarTodosOsEmpregados() {
        for (int i = 0; i < empregados.size(); i++) {
            final Pessoa empregadoaListar = empregados.get(i);
            System.out.println(empregadoaListar.getNome());
            System.out.println(empregadoaListar.getClass());
        }
    }

}
