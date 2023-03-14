public abstract class Cliente {
    // tornei impossivel de se instanciar um cliente sem instanciar uma conta
    private String nome;
    private String cpf;
    private Conta conta;

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /*
     * public Cliente(String nome, String cpf, ContaCorrente conta) {
     * this.nome = nome;
     * this.cpf = cpf;
     * this.conta = conta;
     * }
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
