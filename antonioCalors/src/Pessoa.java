public abstract class Pessoa {
    private String nome;
    private Pessoa chefe;

    Pessoa(String nome) {
        this.nome = nome;
        this.chefe = null;
    }

    Pessoa(String nome, Pessoa chefe) {
        this.nome = nome;
        this.chefe = chefe;
    }

    public abstract void listaEmpregados() throws Exception;

    public void listaChefes() {
        if (chefe != null) {
            System.out.println(this.chefe.getNome());
            this.getChefe().listaChefes();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getChefe() {
        return chefe;
    }

    public void setChefe(Pessoa chefe) {
        this.chefe = chefe;
    }

    public abstract void insereEmpregado(Pessoa empregado) throws Exception;

}
