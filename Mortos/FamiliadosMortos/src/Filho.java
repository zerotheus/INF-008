import java.util.Random;

public class Filho extends Pessoa {

    public Filho(String nome, Pessoa antecessor) throws Exception {
        super(nome, antecessor, 'm');
    }

    public Filho() throws Exception {
        super();
    }

    @Override
    protected boolean seraNatimorto() throws Exception {
        if ((this.getAntecessor().getSexo() == 'f' && (this.getSexo() == 'm') || (this.getSexo() == 'M'))
                || (this.getAntecessor().getSexo() == 'F' && (this.getSexo() == 'm') || (this.getSexo() == 'M'))) {
            Random numero = new Random();
            if (numero.nextInt(2) == 1) {
                return true;
            }
            return false;
        }
        if (this.getAntecessor().getSexo() == 'm' || this.getAntecessor().getSexo() == 'M') {
            if (this.getAntecessor().getFilhos().size() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public Pessoa cadastraFilho(char sexo, String nome) throws Exception {
        if (sexo == 'f' || sexo == 'F') {
            Pessoa filha = new Filha(nome, this);
            if (filha.seraNatimorto()) {
                filha = new NatiMorto(nome, this, sexo);
            }
            filha.adicionaPrefixo();
            this.getFilhos().add(filha);
            return filha;
        } else if (sexo == 'm' || sexo == 'M') {
            Pessoa filho = new Filho(nome, this);
            if (filho.seraNatimorto()) {
                filho = new NatiMorto(nome, this, sexo);
            }
            filho.adicionaPrefixo();
            this.getFilhos().add(filho);
            return filho;
        }
        throw new Exception("Erro de digitação do sexo");
    }

    @Override
    protected void adicionaPrefixo() {
        this.setNome("Sr. " + this.getNome());
    }

}
