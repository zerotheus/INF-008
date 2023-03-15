public class Empresa {
    private Empregado empregados[]; 

    public static void main(String[] args) {
        Pessoa AC = new Chefe("Antonio Carlos");
        
        Empregado e = new Empregado("Romilson", AC);

        Empregado f = new Empregado("Renato", e);

        System.out.println(f.getChefe().getNome());

        
    }

    public void adicionaEmpregados() {
        
    }

}
