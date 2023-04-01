public class App {
    public static void main(String[] args) throws Exception {
        BancoH banco = new BancoH();
        banco.adicionaClientePoupanca("null", "0");
        banco.adicionaClientePoupanca("Cliente", "1");
        banco.adicionaClientePoupanca("PlaceHolder", "2");
        banco.adicionaClienteCorrente("endividado", "3");

        banco.getCliente("0").getConta().saca(30);
        banco.getCliente("0").getConta().deposita(34);
        banco.atualizaTodasAsContas();
        System.out.println(banco.getCliente("0").getConta().getSaldo());
        banco.valorTotaldobanco();

    }
}
