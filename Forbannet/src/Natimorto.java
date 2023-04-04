public class Natimorto extends Pessoa {

    public Natimorto(String nome, Pessoa antecessor) {
        super(nome, antecessor);
    }

    @Override
    public Pessoa cadastraFilho(String nome, char sexo) {
        throw new UnsupportedOperationException("Natimorto n gera filhos");
    }

    @Override
    protected Pessoa adicionaFilho(String nome, Pessoa antecessor, char sexo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionaFilho'");
    }

    @Override
    protected boolean seraNatimorto(char sexo, Pessoa antecessor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'seraNatimorto'");
    }

}
