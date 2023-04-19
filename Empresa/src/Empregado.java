public class Empregado extends Pessoa {

    public Empregado(String nome, Pessoa superior) {
        super(nome, superior);
    }

    @Override
    public Pessoa adicionaEmpregado(String nome) throws Exception {
        System.out.println("Este empregado nao possui essa permissao");
        throw new Exception();
    }

    @Override
    public Pessoa adicionaEmpregadoChefe(String nome) throws Exception {
        System.out.println("Este empregado nao possui essa permissao");
        throw new Exception();
    }

}
