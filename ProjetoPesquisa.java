import java.util.ArrayList;
import java.util.List;

public class ProjetoPesquisa {
    List<Pesquisador> pesquisadores;

    ProjetoPesquisa(){
        this.pesquisadores = new ArrayList<Pesquisador>();
    }

    public void InserePesquisador(String nome, Pesquisador orientador) throws Exception{
        Pesquisador pesquisador = new Professor(nome, orientador);
        pesquisadores.add(pesquisador);
        orientador.adicionaPesquisador(pesquisador);
      
    }

    public void InsereOrientador(String nome, Pesquisador chefe) throws Exception{
        Pesquisador pesquisadorOrientador = new Orientador(nome, chefe);
        pesquisadores.add(pesquisadorOrientador);
        if(chefe!=null){
            chefe.adicionaPesquisador(pesquisadorOrientador);
        }
    }

    public int getQuantidadedePesquisadores() {
        return pesquisadores.size();
    }

    public void listaTodosPesquisadores(){
        for(int i = 0; i < pesquisadores.size();i++){
            System.out.println(pesquisadores.get(i).getNome());
        }
    }

    public void projetoMain() {
        Pesquisador mara = new Orientador("Mara", null);
        Pesquisador petra = new Orientador("Petra", mara);
        Pesquisador cayde = new Professor("cayde", petra);
        Pesquisador venj = new Professor("venj", mara);
        Pesquisador vuvu = new Professor("vuvu", petra);
        Pesquisador pesq = new Professor("null", mara);
        try {
        this.InsereOrientador("mara", null);
        this.InsereOrientador(petra.getNome(), mara);
        this.InserePesquisador("cayde", petra);
        this.InserePesquisador("venj", mara);
        this.InserePesquisador("vuvu", petra);
        this.InserePesquisador("null", mara);
        this.listaTodosPesquisadores();
        System.out.println();
        System.out.println();
        mara.listaPesquisadores();
        } catch (Exception e) {

        }
        try {
            System.out.println();
            System.out.println();
            vuvu.getOrientadoresSuperiores();
            System.out.println(vuvu.getPagameto());
            System.out.println(mara.getPagameto());
            System.out.println(petra.getPagameto());
        } catch (Exception e) {
            System.err.println(e.toString());
        }
        
    }

}
