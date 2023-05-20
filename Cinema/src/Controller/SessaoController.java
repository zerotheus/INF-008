package Controller;

import model.Sessoes;

public class SessaoController {

    public static Sessoes controledeVendaDeIngressos(Sessoes sessao, int quantidadedeIngressosaSeremComprados)
            throws Exception {
        if (quantidadedeIngressosaSeremComprados < 0) {
            throw new Exception("Nao se pode vender uma quantidade negativa");
        }
        if (sessao.getTotaldeIngressosVendidos() + quantidadedeIngressosaSeremComprados > sessao
                .getQuantidadeDeIngressosTotalDisponiveisaVenda()) {
            throw new Exception("Quantidade excede a quantidade de ingressos disponiveis");
        }
        sessao.vendeIngresso(quantidadedeIngressosaSeremComprados);
        return sessao;
    }

}
