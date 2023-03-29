public class NatiMorto extends Pessoa{

    public NatiMorto(String nome, Pessoa antecessor, char sexo) {
        super(nome, antecessor, sexo);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected boolean nasceNatimorto() throws Exception {
        throw new Exception("");
    }

    @Override
    public Pessoa cadastraFilho(char sexo, String nome) throws Exception {
        throw new UnsupportedOperationException("natimorto nao tem filhos");
    }
    
}
