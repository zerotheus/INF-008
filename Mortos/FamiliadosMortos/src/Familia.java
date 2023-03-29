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
        Pessoa random = null;
        Pessoa viva = null;
        Pessoa vivatambem = null;

        try {
            viva = fegalvao.cadastraFilho('f', "vivaTambem");
            vivatambem = fegalvao.cadastraFilho('f', "viva");
            random = fegalvao.cadastraFilho('m', "random");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            fegalvao.listaFilhos();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

}
