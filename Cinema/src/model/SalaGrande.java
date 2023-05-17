package model;

public class SalaGrande extends Sala {

    public SalaGrande() {
        super(500);
        for (int i = 0, horario = Cinema.getHorariodeAbertura(); i < 10; i++, horario++) {
            getSessoes().add(new Sessoes(horario, TipodaSala(), this.getQuantidadedeCadeiras()));
        }
    }

    @Override
    public int getQuantidadeDecadeirasDisponiveis() {
        final int quantidadedeCadeiras = getQuantidadedeCadeiras();
        final int quantidadeDecadeirasDisponiveis = quantidadedeCadeiras - quantidadedeCadeiras / 10;
        return quantidadeDecadeirasDisponiveis;
    }

    @Override
    public String TipodaSala() {
        return "Sala Grande";
    }

}
