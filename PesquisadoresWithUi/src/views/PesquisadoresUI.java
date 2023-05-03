package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

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

        JLabel nomedoNovoPesquisadorLabel = new JLabel("Pesquisador:");
        nomedoNovoPesquisadorLabel.setBounds(20, 30, 75, 25);

        JLabel tipodoNovoPesquisaodorLabel = new JLabel("Tipo:");
        tipodoNovoPesquisaodorLabel.setBounds(20, 70, 50, 25);

        JLabel textodaSelecaodeCoordenadorLabel = new JLabel("Coordenador:");
        textodaSelecaodeCoordenadorLabel.setBounds(20, 110, 90, 25);

        JButton botaoCadastrar = new JButton("Cadastrar");

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel cadastrodePesquisadoresPanel = new JPanel(null);
        cadastrodePesquisadoresPanel.add(nomedoNovoPesquisadorLabel);
        cadastrodePesquisadoresPanel.add(tipodoNovoPesquisaodorLabel);
        cadastrodePesquisadoresPanel.add(textodaSelecaodeCoordenadorLabel);

        JPanel consultadePesquisadoresPanel = new JPanel(null);
        tabbedPane.add("Cadastro", cadastrodePesquisadoresPanel);
        tabbedPane.add("Consulta", consultadePesquisadoresPanel);

        myFrame.add(tabbedPane);
        myFrame.setVisible(true);
    }

}
