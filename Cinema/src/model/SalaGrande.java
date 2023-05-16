package model;

public class SalaGrande extends Sala {

    public SalaGrande() {
        super(500);
    }

    @Override
    public int getQuantidadeDecadeirasDisponiveis() {
        final int quantidadedeCadeiras = getQuantidadedeCadeiras();
        final int quantidadeDecadeirasDisponiveis = quantidadedeCadeiras - quantidadedeCadeiras / 10;
        return quantidadeDecadeirasDisponiveis;
    }

}
