package model;

public class SalaMedia extends Sala {

    public SalaMedia() {
        super(300);
    }

    @Override
    public int getQuantidadeDecadeirasDisponiveis() {
        return getQuantidadedeCadeiras();
    }
}