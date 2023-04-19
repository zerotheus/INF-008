package negocio;

public class imcCalculator {
    private String nome;
    private double altura;
    private double peso;
    private double imc;

    public imcCalculator(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.imc = calculaImc();
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getImc() {
        return imc;
    }

    public double calculaImc() {
        return this.peso / (this.altura * this.altura);
    }

}
