public class App {
    public static void main(String[] args) throws Exception {
        ProjetoPesquisa pesquisa = new ProjetoPesquisa();
        pesquisa.projetoMain();
        pesquisa.InsereOrientador("nao acessivel", pesquisa.pesquisadores.get(0)); //problema de acesso
        System.out.println(pesquisa.getQuantidadedePesquisadores());
        System.out.println(pesquisa.pesquisadores.get(0).nome);//apesar da variavel mara estar sendo adicionada na pos 0 ELA É UMA COPIA
        //Isso acarreta em que tudo que fiz com MARA foi jogado no lixo; 
        System.out.println(pesquisa.pesquisadores.get(0).retorno());
        pesquisa.pesquisadores.get(0).listaPesquisadores();
    }
}
