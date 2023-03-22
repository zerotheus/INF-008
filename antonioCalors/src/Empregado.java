import java.util.ArrayList;
import java.util.List;

public class Empregado extends Pessoa {

    Empregado(String nome, Pessoa chefe) {
        super(nome, chefe);
    }

    @Override
    public void listaEmpregados() throws Exception {
        throw new Exception("Este empregado nao possui subordinados");
    }

    @Override
    public void insereEmpregado(Pessoa empregado) throws Exception {
        throw new Exception("Empregados nao podem adicionar empregados");
    }

}
