import java.util.ArrayList;
import java.util.List;

public class BancoH {
    List<Cliente> clientes = new ArrayList<Cliente>();

    private void addClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void adicionaClientePoupanca(String nome, String numero) {
        Cliente cliente = Cliente.clienteComContaPoupanca(nome, numero);
        addClientes(cliente);
    }

    public void adicionaClienteCorrente(String nome, String numero) {
        Cliente cliente = Cliente.clienteComContaCorrente(nome, numero);
        addClientes(cliente);
    }

    public Cliente getCliente(String numero) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getConta().getNumero().equals(numero)) {
                return clientes.get(i);
            }
        }
        System.out.println("Cliente nao encontrado");
        return null;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void listaTodosClientes() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).getNome());
        }
    }

    public void valorTotaldobanco() {
        int total = 0;
        for (int i = 0; i < clientes.size(); i++) {
            total += clientes.get(i).getConta().getSaldo();
        }
        System.out.println("total " + total);
    }

    public void atualizaTodasAsContas() {
        for (int i = 0; i < clientes.size(); i++) {
            clientes.get(i).getConta().atualizacaoMensal();
        }
    }

}
