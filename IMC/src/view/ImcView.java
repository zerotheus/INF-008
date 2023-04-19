package view;

import javax.swing.*;

public class ImcView {

    public void imcUi() {

        // pode ser simplificado para uma linha utilizando herença

        JLabel labelNome = new JLabel("Nome: ");
        labelNome.setVisible(true);
        labelNome.setBounds(20, 20, 50, 50);
        JTextField textoNome = new JTextField(20);
        JTextField textoPeso = new JTextField(20);
        JTextField textoAltura = new JTextField(20);

        JFrame imcFrame = new JFrame("Calculador de imc");
        imcFrame.setSize(340, 450);
        imcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imcFrame.setLayout(null);// definindo posicionamento absoluto
        imcFrame.add(labelNome);
        imcFrame.add(textoPeso);
        imcFrame.add(textoAltura);
        imcFrame.setVisible(true);

    }

}
