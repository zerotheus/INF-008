package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Sala {
    protected int quantidadedecadeiras;
    protected List<Sessoes> sessoes = new ArrayList<Sessoes>();

    public Sala(int quantidadedecadeiras) {
        this.quantidadedecadeiras = quantidadedecadeiras;
    }

    public int getQuantidadedeCadeiras() {
        return quantidadedecadeiras;
    }

    public int calculadasSessoesFaturamento() {
        return -1;
    }

    public List<Sessoes> getSessoes() {
        return sessoes;
    }

    public abstract String TipodaSala();

    public abstract int getQuantidadeDecadeirasDisponiveis();

}
