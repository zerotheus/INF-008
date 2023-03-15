public abstract class Pessoa {
    private String nome;
    private String cpf;

    Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    abstract void empregadosSubordinados();
    
    abstract void listarEmpregados();
    
    abstract void listarChefes();
         
}
