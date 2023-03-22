import java.util.ArrayList;
import java.util.List;

class Chefe extends Pessoa {
    List<Pessoa> empregados;

    Chefe(String nome) {
        super(nome, null);
        empregados = new ArrayList<Pessoa>();
    }

    Chefe(String nome, Pessoa chefe) {
        super(nome, chefe);
        empregados = new ArrayList<Pessoa>();

    }

    @Override
    public void listaEmpregados() throws Exception {

        for (int i = 0; i < empregados.size(); i++) {
            System.out.println(empregados.get(i).getNome());
            try {
                empregados.get(i).listaEmpregados();
            } catch (Exception e) {
                e.toString();
            }
        }

    }

    @Override
    public void insereEmpregado(Pessoa empregado) throws Exception {
        this.empregados.add(empregado);
    }

}