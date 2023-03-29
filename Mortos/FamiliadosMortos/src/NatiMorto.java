public class NatiMorto extends Pessoa {

    public NatiMorto(String nome, Pessoa antecessor, char sexo) throws Exception {
        super(nome, antecessor, sexo);
    }

    @Override
    protected boolean seraNatimorto() throws Exception {
        throw new Exception("");
    }

    @Override
    public Pessoa cadastraFilho(char sexo, String nome) throws Exception {
        throw new UnsupportedOperationException("natimorto nao tem filhos");
    }

}
