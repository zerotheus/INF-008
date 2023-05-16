package model;

public class Sessoes {

    private int precoDevenda;
    private int quantidadedeCadeiras;
    private int quantidadeDeIngressosTotalDisponiveisaVenda;
    private int horario;
    private Sala sala;

    public Sessoes(int horario, Sala sala) {
        setHorario(horario);
        setTipodaSala(sala);
        setQuantidadedeCadeiras();
        setQuantidadeDeIngressosTotalDisponiveisaVenda();
        definevalordoIngresso(horario, sala);
    }

    public int getHorario() {
        return horario;
    }

    private void setHorario(int horario) {
        this.horario = horario;
    }

    public Sala getTipodaSala() {
        return sala;
    }

    private void setTipodaSala(Sala sala) {
        this.sala = sala;
    }

    public int getQuantidadedeCadeiras() {
        return quantidadedeCadeiras;
    }

    public void setQuantidadedeCadeiras() {
        this.quantidadedeCadeiras = sala.getQuantidadedeCadeiras();
    }

    public int getQuantidadeDeIngressosTotalDisponiveisaVenda() {
        return quantidadeDeIngressosTotalDisponiveisaVenda;
    }

    public void setQuantidadeDeIngressosTotalDisponiveisaVenda() {
        this.quantidadeDeIngressosTotalDisponiveisaVenda = sala.getQuantidadeDecadeirasDisponiveis();
    }

    public void vendeIngresso(int quantidadedeIngressosVendidos) {
        this.quantidadeDeIngressosTotalDisponiveisaVenda -= quantidadedeIngressosVendidos;
    }

    private void definevalordoIngresso(int horario, Sala sala) {

        if (sala instanceof SalaPequena) {
            precoDevenda = 9;
            return;
        }
        if (sala instanceof SalaGrande) {
            precoDevenda = 12;
            return;
        }
        // se for sala media
        if (horario < 18) {
            precoDevenda = 9;
            return;
        }
        precoDevenda = 12;
        return;

    }

}
