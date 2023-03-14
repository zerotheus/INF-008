public abstract class Conta extends Cliente {

    protected double saldo;
    int num;

    public int getNum() {
        return num;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double deposito) {
        if (deposito < 0) {
            System.out.println("Por que????");
            return;
        }
        this.saldo += deposito;
    }

    public void saca(double saque) {
        if (saque <= 0) {
            System.out.println("nao e possivel sacar valores negativos");
            return;
        }
        if (this.saldo < saque) {
            System.out.println("saldo insuficiente");
        }
        this.saldo -= saque;
    }

    public Conta(String nome, String cpf, int num) {
        super(nome, cpf);
        this.num = num;
        this.saldo = 0;
    }

    public abstract void atualizacaoMensal();
}
