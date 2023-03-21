import java.util.ArrayList;
import java.util.List;

public class Orientador extends Pesquisador {

    List<Pesquisador> pesquisadores;

    public Orientador(String nome, Pesquisador orientador) {
        super(nome, orientador);
        pesquisadores = new ArrayList<Pesquisador>();
    }

    @Override
    public double getPagameto() {
        final double pagamento = 300 - 300 * 0.025 * pesquisadores.size();
        return pagamento;
    }

    @Override
    public void listaPesquisadores() throws Exception {
        for (int i = 0; i < pesquisadores.size(); i++) {

        }
    }

}
