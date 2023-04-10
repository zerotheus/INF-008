public class Empresa {
    Pessoa chefe;

    public void empresaMain() {
        Pessoa davi = null;
        Pessoa manoel = null;
        Pessoa roberto = null;
        Pessoa jose = null;
        Pessoa maria = null;
        Pessoa marcus = null;

        try {
            chefe = Chefe.getAntonioCarlos();
            davi = chefe.adicionaEmpregadoChefe("davi");
            manoel = chefe.adicionaEmpregado("Manoel");
            roberto = davi.adicionaEmpregado("Roberto");
            jose = davi.adicionaEmpregadoChefe("Jose");
            maria = jose.adicionaEmpregado("Maria");
            marcus = jose.adicionaEmpregado("Marcus");
        } catch (Exception e) {
            e.toString();
        }

        chefe.ListaEmpregados();
        System.out.println("sup");
        marcus.listaSuperiores();

    }
}
