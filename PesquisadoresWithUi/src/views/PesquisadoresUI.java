package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import Negocio.Pesquisador;

public class PesquisadoresUI {

    Pesquisador mara;
    JFrame myFrame;

    public void PesquisadoresUIMain() {

        try {
            mara = Pesquisador.pegaMara();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        myFrame = new JFrame("Pesquisadores");
        myFrame.setBounds(0, 0, 450, 500);

        final JLabel nomedoNovoPesquisadorLabel = new JLabel("Pesquisador:");
        nomedoNovoPesquisadorLabel.setBounds(20, 30, 75, 25);

        JTextField nomedoNovoPesquisadorText = new JTextField();
        nomedoNovoPesquisadorText.setBounds(120, 30, 170, 20);

        final JLabel tipodoNovoPesquisaodorLabel = new JLabel("Tipo:");
        tipodoNovoPesquisaodorLabel.setBounds(20, 70, 50, 25);

        final String[] tiposdePesquisadoStrings = { "Pesquisador", "Coordenador" };

        final JComboBox<String> tipodePesquisadorComboBox = new JComboBox<String>(tiposdePesquisadoStrings);
        tipodePesquisadorComboBox.setBounds(120, 70, 170, 25);

        final JLabel textodaSelecaodeCoordenadorLabel = new JLabel("Coordenador:");
        textodaSelecaodeCoordenadorLabel.setBounds(20, 110, 90, 25);

        JComboBox<String> CoordenadoresComboBox = new JComboBox<String>();
        CoordenadoresComboBox.setBounds(120, 110, 120, 25);
        CoordenadoresComboBox.addItem(mara.getNome());

        final JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setBounds(175, 250, 90, 25);
        // Consultas

        final JLabel nomeDoPesquisadoraConsultarLabel = new JLabel("Nome pesquisador:");
        nomeDoPesquisadoraConsultarLabel.setBounds(20, 30, 120, 25);

        JComboBox<String> todosComboBox = new JComboBox<String>();
        todosComboBox.addItem(mara.getNome());
        todosComboBox.setBounds(160, 30, 120, 25);

        final JLabel quantidadeDePesquisadoresLabel = new JLabel("Quantidade de Pesquisadores:");
        quantidadeDePesquisadoresLabel.setBounds(20, 70, 180, 25);

        JTextField quantidadeDePesquisadoresText = new JTextField(30);
        quantidadeDePesquisadoresText.setBounds(260, 70, 130, 25);
        quantidadeDePesquisadoresText.setEditable(false);

        final JLabel valoraSerPagoLabel = new JLabel("Valor a Pagar:");
        valoraSerPagoLabel.setBounds(20, 110, 90, 25);

        JTextField valoraSerPagoTextField = new JTextField();
        valoraSerPagoTextField.setBounds(120, 110, 90, 25);
        valoraSerPagoTextField.setEditable(false);

        final JButton consultarButton = new JButton("Consultar");
        consultarButton.setBounds(145, 200, 90, 25);

        botaoCadastrar.addActionListener(new ActionListener() {
            Pesquisador superior;
            Pesquisador novoPesquisador;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() != botaoCadastrar) {
                    return;
                }
                final String nomedoNovoPesquisador = nomedoNovoPesquisadorText.getText();
                superior = mara.procuraPesquisador((String) CoordenadoresComboBox.getSelectedItem());
                try {
                    System.out.println(nomedoNovoPesquisador);
                    System.out.println(superior.getNome());
                    novoPesquisador = superior.cadastraPesquisador(nomedoNovoPesquisador,
                            tipodePesquisadorComboBox.getSelectedIndex());
                } catch (Exception e1) {
                    System.out.println(e1.toString());
                }
                System.out.println(tipodePesquisadorComboBox.getSelectedIndex());
                if (tipodePesquisadorComboBox.getSelectedIndex() == 1) {
                    CoordenadoresComboBox.addItem(novoPesquisador.getNome());
                }
                todosComboBox.addItem(novoPesquisador.getNome());
            }
        });

        consultarButton.addActionListener(new ActionListener() {
            Pesquisador consultado;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() != consultarButton) {
                    return;
                }
                consultado = mara.procuraPesquisador((String) todosComboBox.getSelectedItem());
                valoraSerPagoTextField.setText(Double.toString(consultado.getValorPago()));
                quantidadeDePesquisadoresText.setText(Integer.toString(consultado.getQuantidadedePesquisadores()));
            }
        });

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel cadastrodePesquisadoresPanel = new JPanel(null);
        cadastrodePesquisadoresPanel.add(nomedoNovoPesquisadorLabel);
        cadastrodePesquisadoresPanel.add(tipodoNovoPesquisaodorLabel);
        cadastrodePesquisadoresPanel.add(textodaSelecaodeCoordenadorLabel);
        cadastrodePesquisadoresPanel.add(botaoCadastrar);
        cadastrodePesquisadoresPanel.add(nomedoNovoPesquisadorLabel);
        cadastrodePesquisadoresPanel.add(nomedoNovoPesquisadorText);
        cadastrodePesquisadoresPanel.add(tipodePesquisadorComboBox);
        cadastrodePesquisadoresPanel.add(CoordenadoresComboBox);

        JPanel consultadePesquisadoresPanel = new JPanel(null);
        consultadePesquisadoresPanel.add(nomeDoPesquisadoraConsultarLabel);
        consultadePesquisadoresPanel.add(quantidadeDePesquisadoresLabel);
        consultadePesquisadoresPanel.add(valoraSerPagoLabel);
        consultadePesquisadoresPanel.add(todosComboBox);
        consultadePesquisadoresPanel.add(quantidadeDePesquisadoresText);
        consultadePesquisadoresPanel.add(valoraSerPagoTextField);
        consultadePesquisadoresPanel.add(consultarButton);

        tabbedPane.add("Cadastro", cadastrodePesquisadoresPanel);
        tabbedPane.add("Consulta", consultadePesquisadoresPanel);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.add(tabbedPane);
        myFrame.setVisible(true);

    }

}
