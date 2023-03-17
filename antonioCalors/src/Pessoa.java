public abstract class Pessoa {
    private String nome;
    private String cpf;
    private int registro;

    Pessoa(String nome, int registro) {
        this.nome = nome;
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    abstract void empregadosSubordinados();

    abstract void listarEmpregadosDiretos();

    abstract void addEmpregado(Empregado empregada);
}
