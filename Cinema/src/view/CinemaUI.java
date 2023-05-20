package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controller.SessaoController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Cinema;
import model.Sessoes;

public class CinemaUI {

    private Cinema cinema;
    private JFrame frame;

    public void UIdoCinema() {

        cinema = new Cinema();
        final JLabel SelecioneaSala = new JLabel("Sala Numero:");
        SelecioneaSala.setBounds(20, 30, 80, 25);

        final Integer[] NumerodasSalas = cinema.getSalasIds();
        final JComboBox<Integer> comboBoxdeSelecaodeSala = new JComboBox<Integer>(NumerodasSalas);
        comboBoxdeSelecaodeSala.setBounds(110, 30, 35, 25);

        final Integer[] NumerodasSessoes = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        final JLabel selecioneaSessao = new JLabel("Sessao:");
        selecioneaSessao.setBounds(160, 30, 50, 25);

        JComboBox<Integer> comboBoxdeSelecaodeSessao = new JComboBox<Integer>(NumerodasSessoes);
        comboBoxdeSelecaodeSessao.setBounds(215, 30, 35, 25);
        final JLabel quantidadedeIngressosVendidosJLabel = new JLabel(
                "Ingressos vendidos: " + cinema.getSalas().get(0).getSessoes().get(0).getTotaldeIngressosVendidos());
        quantidadedeIngressosVendidosJLabel.setBounds(260, 30, 140, 25);

        JLabel faturamentodaSala = new JLabel("Total Faturado: " + cinema.getSalas().get(0).totalFaturado());
        faturamentodaSala.setBounds(20, 60, 130, 25);
        final JLabel quantosIngressosDesejaComprarJLabel = new JLabel("quantos ingressos deseja comprar:");
        quantosIngressosDesejaComprarJLabel.setBounds(20, 85, 210, 25);
        JTextField inputdaQuantidadeAserComprada = new JTextField(3);
        inputdaQuantidadeAserComprada.setBounds(240, 85, 25, 25);
        final JButton botaoComprar = new JButton("comprar");
        botaoComprar.setBounds(150, 125, 150, 25);
        final JLabel totalFaturadodoCinema = new JLabel("total faturado do cinema: " + cinema.totalFaturado());
        totalFaturadodoCinema.setBounds(20, 150, 175, 25);

        comboBoxdeSelecaodeSessao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() != comboBoxdeSelecaodeSessao) {
                    return;
                }
                final int iddaSala = comboBoxdeSelecaodeSala.getSelectedIndex();
                final int iddaSessao = comboBoxdeSelecaodeSessao.getSelectedIndex();
                final int faturamentodasalaAtual = cinema.getSalas().get(iddaSala).getSessoes().get(iddaSessao)
                        .totalFaturado();
                faturamentodaSala.setText("Total Faturado: " + faturamentodasalaAtual);
                final int ingressosVendidosSessaoAtual = cinema.getSalas().get(iddaSala).getSessoes().get(iddaSessao)
                        .getTotaldeIngressosVendidos();
                quantidadedeIngressosVendidosJLabel.setText("Ingressos vendidos: " + ingressosVendidosSessaoAtual);
            }
        });

        comboBoxdeSelecaodeSala.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() != comboBoxdeSelecaodeSala) {
                    return;
                }
                final int iddaSala = comboBoxdeSelecaodeSala.getSelectedIndex();
                final int iddaSessao = comboBoxdeSelecaodeSessao.getSelectedIndex();
                final int faturamentodasalaAtual = cinema.getSalas().get(iddaSala).getSessoes().get(iddaSessao)
                        .totalFaturado();
                faturamentodaSala.setText("Total Faturado: " + faturamentodasalaAtual);
                final int ingressosVendidosSessaoAtual = cinema.getSalas().get(iddaSala).getSessoes().get(iddaSessao)
                        .getTotaldeIngressosVendidos();
                quantidadedeIngressosVendidosJLabel.setText("Ingressos vendidos: " + ingressosVendidosSessaoAtual);
            }
        });

        botaoComprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() != botaoComprar) {
                    return;
                }
                int quantidadedeIngressosDesejada = 0;
                try {
                    quantidadedeIngressosDesejada = Integer.parseInt(inputdaQuantidadeAserComprada.getText());
                } catch (Exception e1) {
                    e1.printStackTrace();
                    return;
                }
                final int iddaSessao = comboBoxdeSelecaodeSessao.getSelectedIndex();
                final int iddaSala = comboBoxdeSelecaodeSala.getSelectedIndex();
                final Sessoes sessao = cinema.getSalas().get(iddaSala).getSessoes().get(iddaSessao);
                try {
                    SessaoController.controledeVendaDeIngressos(sessao, quantidadedeIngressosDesejada);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
                final int faturamentodasalaAtual = cinema.getSalas().get(iddaSala).getSessoes().get(iddaSessao)
                        .totalFaturado();
                faturamentodaSala.setText("Total Faturado: " + faturamentodasalaAtual);
                final int ingressosVendidosSessaoAtual = cinema.getSalas().get(iddaSala).getSessoes().get(iddaSessao)
                        .getTotaldeIngressosVendidos();
                quantidadedeIngressosVendidosJLabel.setText("Ingressos vendidos: " + ingressosVendidosSessaoAtual);
                totalFaturadodoCinema.setText("total faturado do cinema: " + cinema.totalFaturado());
            }
        });

        frame = new JFrame("Cinema");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 450);
        frame.setVisible(true);
        frame.add(SelecioneaSala);
        frame.add(comboBoxdeSelecaodeSala);
        frame.add(selecioneaSessao);
        frame.add(comboBoxdeSelecaodeSessao);
        frame.add(quantidadedeIngressosVendidosJLabel);
        frame.add(faturamentodaSala);
        frame.add(quantosIngressosDesejaComprarJLabel);
        frame.add(inputdaQuantidadeAserComprada);
        frame.add(botaoComprar);
        frame.add(totalFaturadodoCinema);
    }

}
