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

    public int totaldeIngressosVendidos() {
        int totaldeIngressosVendidos = 0;
        for (int i = 0; i < sessoes.size(); i++) {
            totaldeIngressosVendidos += sessoes.get(i).getTotaldeIngressosVendidos();
        }
        return totaldeIngressosVendidos;
    }

    public int totalFaturado() {
        int faturamento = 0;
        for (int i = 0; i < sessoes.size(); i++) {
            faturamento += sessoes.get(i).totalFaturado();
        }
        return faturamento;
    }

    public abstract String TipodaSala();

    public abstract int getQuantidadeDecadeirasDisponiveis();

}
