package model;

public class SalaMedia extends Sala {

    public SalaMedia() {
        super(300);
        for (int i = 0, horario = Cinema.getHorariodeAbertura(); i < 10; i++, horario++) {
            getSessoes().add(new Sessoes(horario, TipodaSala(), this.getQuantidadedeCadeiras()));
        }
    }

    @Override
    public int getQuantidadeDecadeirasDisponiveis() {
        return getQuantidadedeCadeiras();
    }

    @Override
    public String TipodaSala() {
        return "Sala Media";
    }
}