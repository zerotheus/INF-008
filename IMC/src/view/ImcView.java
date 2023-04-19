package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import negocio.imcCalculator;

public class ImcView {

    imcCalculator imc;

    public void imcUi() {

        // pode ser simplificado para uma linha utilizando herença

        JLabel labelNome = new JLabel("Nome: ");
        JLabel labelPeso = new JLabel("Peso: ");
        JLabel labelAltura = new JLabel("Altura: ");
        labelNome.setBounds(20, 20, 50, 20);
        labelPeso.setBounds(20, 60, 50, 20);
        labelAltura.setBounds(20, 100, 50, 20);

        JTextField textoNome = new JTextField(40);
        JTextField textoPeso = new JTextField(40);
        JTextField textoAltura = new JTextField(40);
        JFrame imcFrame = new JFrame("Calculador de imc");

        JButton confirmButton = new JButton("Confirm");

        textoNome.setBounds(60, 20, 100, 20);
        textoPeso.setBounds(60, 60, 100, 20);
        textoAltura.setBounds(60, 100, 100, 20);
        confirmButton.setBounds(40, 140, 130, 25);
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imc = new imcCalculator(textoNome.getText(), Double.parseDouble(textoAltura.getText()),
                        Double.parseDouble(textoPeso.getText()));
                String textodoIMC = imc.getNome() + " seu imc é " + imc.getImc();

                JOptionPane.showMessageDialog(null, textodoIMC, "imc Calculador", 0);

            }
        });

        imcFrame.setSize(220, 300);
        imcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imcFrame.setLayout(null);// definindo posicionamento absoluto
        imcFrame.add(labelNome);
        imcFrame.add(labelAltura);
        imcFrame.add(labelPeso);
        imcFrame.add(textoNome);
        imcFrame.add(textoPeso);
        imcFrame.add(textoAltura);
        imcFrame.add(confirmButton);
        imcFrame.setVisible(true);

    }

}
