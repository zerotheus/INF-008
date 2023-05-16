package model;

public class SalaPequena extends Sala {

    public SalaPequena() {
        super(100);
    }

    @Override
    public int getQuantidadeDecadeirasDisponiveis() {
        return getQuantidadedeCadeiras();
    }

}
