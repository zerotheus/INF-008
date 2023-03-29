public class Filho extends Pessoa{

    public Filho(String nome, Pessoa antecessor) {
        super(nome, antecessor, 'm');
        //TODO Auto-generated constructor stub
    }

    public Filho(String nome, String sobrenome){
        super(nome, sobrenome);
    }

    @Override
    protected boolean nasceNatimorto() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nasceNatimorto'");
    }

    @Override
    public Pessoa cadastraFilho(char sexo, String nome) throws Exception {
        if(sexo == 'f'){
            Pessoa filha = new Filha(nome, this);
            return filha;
        }else{
            Pessoa filho = new Filho(nome, this);
            return filho;
        }
        throw new Exception("Erro de digitação do sexo");
    }
    
}
