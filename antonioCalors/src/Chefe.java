import java.util.ArrayList;
import java.util.List;

class Chefe extends Pessoa {
    List<Pessoa> empregados;
    // Empregado Chefe;

    Chefe(String nome, int registro) {
        super(nome, registro);
        empregados = new ArrayList<Pessoa>();
    }

    @Override
    void empregadosSubordinados() {
        // System.out.println("chefe");
        for (int i = 0; i < empregados.size(); i++) {
            Pessoa empregado = empregados.get(i);
            empregado.empregadosSubordinados();
            System.out.println(empregado.getNome() + " Chefe: " + super.getNome());
        }
        // System.out.println("exit 0");
    }

    @Override
    void listarChefes() {
        // TODO Auto-generated method stub

    }

    @Override
    void listarEmpregados() {
        // TODO Auto-generated method stub

    }

    @Override
    void addEmpregado(Empregado empregada) {
        empregados.add(empregada);
    }
}