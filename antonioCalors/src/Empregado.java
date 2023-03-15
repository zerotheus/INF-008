public class Empregado extends Pessoa{
   
    private Pessoa chefe;
    private Empregado empregados[];
    private int contaEmpregados;

    Empregado(String nome, Pessoa chefe){
        super(nome);
        this.chefe = chefe;
        Empregado empregados[] = new Empregado[4];
    }

    @Override
    void empregadosSubordinados() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void listarChefes() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void listarEmpregados() {
        // TODO Auto-generated method stub
        
    }

    public Pessoa getChefe() {
        return this.chefe;
    }

    public Empregado[] getEmpregados() {
        return empregados;
    }

    public void setEmpregadosUm(Empregado empregados, int pos) {
        this.empregados[pos] = empregados;
    }

}
