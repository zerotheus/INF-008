public class ProjetodePesquisa {
    Pesquisador pesquisadoraChefeMara;

    public void ProjetodePesquisaMain() {

        try {
            pesquisadoraChefeMara = Pesquisador.pegaMara();
            Pesquisador davi = pesquisadoraChefeMara.cadastraPesquisador("davi", 1);
            Pesquisador manoel = pesquisadoraChefeMara.cadastraPesquisador("manoel", 0);
            Pesquisador roberto = davi.cadastraPesquisador("roberto", 0);
            Pesquisador jose = davi.cadastraPesquisador("jose", 1);
            Pesquisador maria = jose.cadastraPesquisador("maria", 0);
            Pesquisador marcus = jose.cadastraPesquisador("marcus", 0);
        } catch (Exception e) {
            e.toString();
        }
        System.out.println(pesquisadoraChefeMara.getQuantidadedePesquisadores());
        pesquisadoraChefeMara.listaTodosPesquisadores();
    }
}