package model;

public class Sessoes {

    private int precoDevenda;
    private int quantidadedeCadeiras;
    private int quantidadeDeIngressosTotalDisponiveisaVenda;
    private int totaldeIngressosVendidos;
    private int horario;
    private String tipodeSala;

    public Sessoes(int horario, String tipodeSala, int quantidadeDecadeiras) {
        setHorario(horario);
        setTipodaSala(tipodeSala);
        setQuantidadedeCadeiras(quantidadeDecadeiras);
        setQuantidadeDeIngressosTotalDisponiveisaVenda();
        definevalordoIngresso(horario);
    }

    public int getHorario() {
        return horario;
    }

    private void setHorario(int horario) {
        this.horario = horario;
    }

    public String getTipodaSala() {
        return tipodeSala;
    }

    private void setTipodaSala(String tipodeSala) {
        this.tipodeSala = tipodeSala;
    }

    public int getQuantidadedeCadeiras() {
        return quantidadedeCadeiras;
    }

    public void setQuantidadedeCadeiras(int quantidadeDecadeiras) {
        this.quantidadedeCadeiras = quantidadeDecadeiras;
    }

    public int getQuantidadeDeIngressosTotalDisponiveisaVenda() {
        return quantidadeDeIngressosTotalDisponiveisaVenda;
    }

    public void setQuantidadeDeIngressosTotalDisponiveisaVenda() {
        if (!this.tipodeSala.equalsIgnoreCase("Sala Grande")) {
            this.quantidadeDeIngressosTotalDisponiveisaVenda = quantidadedeCadeiras;
            return;
        }
        this.quantidadeDeIngressosTotalDisponiveisaVenda = (quantidadedeCadeiras * 9) / 10;
        return;
    }

    public void vendeIngresso(int quantidadedeIngressosVendidos) {
        this.totaldeIngressosVendidos += quantidadedeIngressosVendidos;
    }

    private void definevalordoIngresso(int horario) {

        if (this.tipodeSala.equalsIgnoreCase("Sala Pequena")) {
            precoDevenda = 9;
            return;
        }
        if (this.tipodeSala.equalsIgnoreCase("Sala Grande")) {
            precoDevenda = 12;
            return;
        }
        // se for tipo de Sala for media
        if (horario < 18) {
            precoDevenda = 9;
            return;
        }
        precoDevenda = 12;
        return;

    }

    public int totalFaturado() {
        return totaldeIngressosVendidos * precoDevenda;
    }

}
