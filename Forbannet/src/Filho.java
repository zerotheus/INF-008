import java.util.Random;

public class Filho extends Pessoa {

    Filho() {
        super();
    }

    Filho(String nome, Pessoa antecessor) {
        super(nome, antecessor);
        this.setNome("Sr" + this.getNome());
    }

    @Override
    public Pessoa instanceJoao() throws Exception {
        if (Pessoa.getSobrenome() != null) {
            throw new Exception("Joao ja instanciado");
        }
        Filho joao = new Filho();
        return joao;
    }

    @Override
    public void cadastraFilho(String nome, char sexo) {
        Pessoa filho = adicionaFilho(nome, this, sexo);
        if (filho == null) {
            System.out.println("Error na digitacao do sexo");
        }
        this.getDescendentes().add(filho);
    }

    @Override
    public Pessoa adicionaFilho(String nome, Pessoa antecessor, char sexo) {
        if (seraNatimorto(sexo, antecessor)) {
            Pessoa filho = new Natimorto(nome, antecessor);
            return filho;
        }
        if (sexo == 'm' || sexo == 'M') {
            Pessoa filho = new Filho(nome, antecessor);
            return filho;
        }
        if (sexo == 'f' || sexo == 'F') {
            Pessoa filha = new Filha(nome, antecessor);
            return filha;
        }
        return null;
    }

    @Override
    protected boolean seraNatimorto(char sexo, Pessoa antecessor) {
        if (antecessor instanceof Filha && (sexo == 'm' || sexo == 'M')) {
            Random random = new Random();
            if (random.nextInt(2) == 1) {
                return true;
            }
            return false;
        }
        if (antecessor instanceof Filho && antecessor.getDescendentes().size() == 1) {
            return true;
        }
        return false;
    }

}
