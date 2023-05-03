package views;

import javax.swing.JFrame;
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
        myFrame.setBounds(0, 0, 450, 600);
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel cadastrodePesquisadoresPanel = new JPanel(null);
        JPanel consultadePesquisadoresPanel = new JPanel(null);
        tabbedPane.add("Cadastro", cadastrodePesquisadoresPanel);
        tabbedPane.add("Consulta", consultadePesquisadoresPanel);

        myFrame.add(tabbedPane);
        myFrame.setVisible(true);
    }

}
