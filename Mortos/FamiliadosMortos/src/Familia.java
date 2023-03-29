import java.util.ArrayList;
import java.util.List;

public class Familia {
    List<Pessoa> membrosdafamilia = new ArrayList<Pessoa>();

    public void familiaMain() {

        Pessoa joao = null;

        try {
            joao = new Filho();
            membrosdafamilia.add(joao);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        Pessoa celso = null;
        try {
            celso = joao.cadastraFilho('m', "celso");
        } catch (Exception e) {
        }
        Pessoa fegalvao = null;
        try {
            fegalvao = celso.cadastraFilho('f', "fegalvao");
        } catch (Exception e) {
            // TODO: handle exception
        }
        fegalvao.listaAntecessores();
    }

}
