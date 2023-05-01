package Negocio;

public class Familia {
    Pessoa joao;

    public void FamiliaMain() {
        final Pessoa ana;
        final Pessoa maria;
        final Pessoa carlos;
        final Pessoa lucio;
        final Pessoa andre;
        final Pessoa paulo;
        final Pessoa roberta;

        try {
            joao = Pessoa.instanceJoao();
            ana = joao.cadastraFilho("Ana", 'f');
            maria = joao.cadastraFilho("Maria", 'f');
            carlos = ana.cadastraFilho("Ana", 'm');
            lucio = ana.cadastraFilho("lucio", 'm');
            andre = carlos.cadastraFilho("andre", 'm');
            paulo = carlos.cadastraFilho("paulo", 'm');
            roberta = carlos.cadastraFilho("roberta", 'f');

            System.out.println("lucio class" + lucio.getClass());
            System.out.println("carlos" + carlos.getClass());
            System.out.println(roberta.getClass());

        } catch (Exception e) {
            e.toString();
        }
        System.out.println(joao.getNome());

    }

}
