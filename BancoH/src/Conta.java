public abstract class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0;
        deposita(100);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        if (valor <= 0) {
            System.out.println("nao é possivel depositar valores negativos");
            return;
        }
        this.saldo += valor;
    }

    public void saca(double valor) {
        if (valor <= 0) {
            System.out.println("nao é possivel sacar valores negativos");
            return;
        }
        if (valor > getSaldo()) {
            System.out.println("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public abstract void atualizacaoMensal();

}
