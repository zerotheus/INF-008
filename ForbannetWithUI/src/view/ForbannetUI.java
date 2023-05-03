package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Negocio.Filho;
import Negocio.Pessoa;

public class ForbannetUI {

    Pessoa joao = null;

    public void ForbannetUImain() {
        try {
            joao = Filho.instanceJoao();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        JLabel familiaresLabel = new JLabel("Familiares:");
        familiaresLabel.setForeground(Color.decode("#FF00C6"));
        familiaresLabel.setBounds(20, 30, 70, 25);

        JComboBox<String> familiaresJComboBox = new JComboBox<String>();
        familiaresJComboBox.addItem(joao.getNome());
        familiaresJComboBox.setBounds(90, 30, 70, 23);

        JLabel novoNomedeUmFilhoLabel = new JLabel("Nome do Filho:");
        novoNomedeUmFilhoLabel.setForeground(Color.decode("#FF00C6"));
        novoNomedeUmFilhoLabel.setBounds(320, 30, 90, 25);

        JTextArea TextodoNomedoNovoFilho = new JTextArea(1, 45);
        TextodoNomedoNovoFilho.setBounds(420, 33, 155, 20);

        JLabel sexoLabel = new JLabel("Sexo:");
        sexoLabel.setBounds(50, 140, 35, 25);
        sexoLabel.setForeground(Color.decode("#FF00C6"));

        JRadioButton seletorMasculinoJRadioButton = new JRadioButton("Masculino");
        seletorMasculinoJRadioButton.setForeground(Color.decode("#FF00C6"));
        seletorMasculinoJRadioButton.setBounds(170, 140, 100, 25);

        JRadioButton seletorFemininoJRadioButton = new JRadioButton("Feminino");
        seletorFemininoJRadioButton.setForeground(Color.decode("#FF00C6"));
        seletorFemininoJRadioButton.setBounds(320, 140, 100, 25);

        ButtonGroup seletorDoSexoButtonGroup = new ButtonGroup();
        seletorDoSexoButtonGroup.add(seletorFemininoJRadioButton);
        seletorDoSexoButtonGroup.add(seletorMasculinoJRadioButton);

        JTextField TextodosAntecessores = new JTextField();
        TextodosAntecessores.setBounds(100, 315, 395, 75);
        TextodosAntecessores.setEditable(false);

        JButton adicionaFilhoJButton = new JButton("Adicionar Filho");
        adicionaFilhoJButton.setBounds(235, 275, 120, 25);
        adicionaFilhoJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final Pessoa genitor;
                if (e.getSource() != adicionaFilhoJButton) {
                    System.out.println("Fonte diferente do botao adiciona filho");
                    return;
                }
                String nomedoFilho = TextodoNomedoNovoFilho.getText();
                if (nomedoFilho == null || nomedoFilho.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Nome não informado",
                            "Informe o Nome por favor",
                            JOptionPane.INFORMATION_MESSAGE, null);
                    return;
                }
                if (!seletorFemininoJRadioButton.isSelected() && !seletorMasculinoJRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null,
                            "Sexo não informado",
                            "Informe o sexo por favor",
                            JOptionPane.INFORMATION_MESSAGE, null);
                    return;
                }
                System.out.println(TextodoNomedoNovoFilho.getText());
                genitor = joao.procuraPesoa((String) familiaresJComboBox.getSelectedItem());
                if (seletorFemininoJRadioButton.isSelected()) {
                    if (genitor == null) {
                        JOptionPane.showMessageDialog(null,
                                "Pessao nao encontrada",
                                "Informe confira o nome",
                                JOptionPane.INFORMATION_MESSAGE, null);
                        return;
                    }
                    Pessoa filha = null;
                    try {
                        filha = genitor.cadastraFilho(nomedoFilho, 'F');
                    } catch (Exception e3) {
                        e3.toString();
                        return;
                    }
                    familiaresJComboBox.addItem(filha.getNome());
                    return;
                }
                Pessoa filho;
                try {
                    filho = genitor.cadastraFilho(nomedoFilho, 'F');
                } catch (Exception e4) {
                    e4.toString();
                    return;
                }
                familiaresJComboBox.addItem(filho.getNome());
                return;
            }
        });

        familiaresJComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() != familiaresJComboBox) {
                    return;
                }
                if (familiaresJComboBox.getSelectedItem().equals(joao)) {
                    TextodosAntecessores.setText("");
                    return;
                }
                Pessoa pessoaSelecionada = joao.procuraPesoa((String) familiaresJComboBox.getSelectedItem());
                String antecessoresNomes = pessoaSelecionada.listAtecessores();
                TextodosAntecessores.setText(antecessoresNomes);
            }
        });

        JFrame forbannetsFrame = new JFrame("Forbannet");
        forbannetsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        forbannetsFrame.setLayout(null);
        forbannetsFrame.setSize(610, 550);
        forbannetsFrame.setVisible(true);
        forbannetsFrame.add(familiaresLabel);
        forbannetsFrame.add(novoNomedeUmFilhoLabel);
        forbannetsFrame.add(sexoLabel);
        forbannetsFrame.add(seletorMasculinoJRadioButton);
        forbannetsFrame.add(seletorFemininoJRadioButton);
        forbannetsFrame.add(TextodoNomedoNovoFilho);
        forbannetsFrame.add(adicionaFilhoJButton);
        forbannetsFrame.add(familiaresJComboBox);
        forbannetsFrame.add(TextodosAntecessores);
    }
}
