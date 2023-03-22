import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Pessoa> empregados = new ArrayList<Pessoa>();

    public void insereEmpregado(Pessoa empregado, Pessoa chefe) {
        this.empregados.add(empregado);
        try {
            chefe.insereEmpregado(empregado);
        } catch (Exception e) {
            e.toString();
        }
    }

    public void EmpresaMain() {

        Pessoa AC = new Chefe("AC");
        Pessoa emp = new Empregado("empregado", AC);
        Pessoa b = new Chefe("Batista", AC);
        Pessoa c = new Chefe("Carlos", b);
        Pessoa a = new Chefe("Antonio", AC);
        Pessoa d = new Empregado("daniel", c);
        Pessoa f = new Empregado("farcos", b);

        insereEmpregado(emp, AC);
        insereEmpregado(b, AC);
        insereEmpregado(c, b);
        insereEmpregado(a, AC);
        insereEmpregado(d, c);
        insereEmpregado(f, b);

        try {
            AC.listaEmpregados();
            System.out.println("c chefes");
            c.listaChefes();
        } catch (Exception e) {
            e.toString();
        }

    }

}
