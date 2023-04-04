import java.util.Random;

public class Filha extends Pessoa {

    public Filha(String nome, Pessoa antecessor) {
        super(nome, antecessor);
    }

    @Override
    public Pessoa cadastraFilho(String nome, char sexo) {
        Pessoa filho = adicionaFilho(nome, this, sexo);
        if (filho == null) {
            System.out.println("Error na digitacao do sexo");
            // throw new Exception("Por favor digitar o sexo corretamente");
            return null;
        }
        this.getDescendentes().add(filho);
        return filho;
    }

    @Override
    protected Pessoa adicionaFilho(String nome, Pessoa antecessor, char sexo) {
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
        if ((sexo == 'm' || sexo == 'M')) {
            Random random = new Random();
            if (random.nextInt(2) == 1) {
                return true;
            }
            if (sexo == 'f' || sexo == 'F') {
                return false;
            }
        }
        return false;
    }

}
