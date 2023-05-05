package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Negocio.Chefe;
import Negocio.Pessoa;

public class EmpresaUI {

    private Pessoa flavia;
    private JFrame myFrame;

    public void EmpresaUIMain() {

        try {
            flavia = Pessoa.getFlavia();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        myFrame = new JFrame("Empresa");
        myFrame.setBounds(0, 0, 450, 500);

        final JLabel NomeDoEmpregadoCadastradoLabel = new JLabel("Nome do Empregado:");
        NomeDoEmpregadoCadastradoLabel.setBounds(20, 30, 130, 25);

        JTextField nomeDoNovoEmpregadoTextField = new JTextField(60);
        nomeDoNovoEmpregadoTextField.setBounds(180, 30, 150, 23);

        final JLabel selecaoDoSuperiorLabel = new JLabel("Superior:");
        selecaoDoSuperiorLabel.setBounds(20, 90, 70, 25);

        JComboBox<String> comboBoxdosSuperiores = new JComboBox<String>();
        comboBoxdosSuperiores.setBounds(120, 90, 180, 25);
        comboBoxdosSuperiores.addItem(flavia.getNome());

        final JLabel selecaoDoTipoLabel = new JLabel("Tipo:");
        selecaoDoTipoLabel.setBounds(20, 150, 50, 25);

        final String[] stringdaComboBoxdeTipo = { "Empregado", "Chefe" };
        final JComboBox<String> comboBoxdoTipo = new JComboBox<String>(stringdaComboBoxdeTipo);
        comboBoxdoTipo.setBounds(75, 150, 100, 25);

        final JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setBounds(200, 150, 90, 25);

        final JLabel nomedoFuncionarioaConsultar = new JLabel("Nome do funcionario");
        nomedoFuncionarioaConsultar.setBounds(20, 30, 120, 25);

        JComboBox<String> nomesdeTodososFuncionariosComboBox = new JComboBox<String>();
        nomesdeTodososFuncionariosComboBox.setBounds(180, 30, 120, 25);
        nomesdeTodososFuncionariosComboBox.addItem(flavia.getNome());

        final JLabel selecaodoTipodeConsultaLabel = new JLabel("Tipo de Consulta");
        selecaodoTipodeConsultaLabel.setBounds(20, 90, 150, 25);

        final String[] stringsdoTipodeConsulta = { "Subordinados", "Superiores" };
        final JComboBox<String> comboBoxdoTipodeConsulta = new JComboBox<String>(stringsdoTipodeConsulta);
        comboBoxdoTipodeConsulta.setBounds(170, 90, 130, 25);

        final JLabel listadeSuperioresLabel = new JLabel("Lista:");
        listadeSuperioresLabel.setBounds(20, 120, 60, 25);

        JTextArea listagemdeSuperioresTextField = new JTextArea(5, 30);
        listagemdeSuperioresTextField.setBounds(20, 140, 390, 90);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel cadastrodeEmpregadosPanel = new JPanel(null);
        cadastrodeEmpregadosPanel.add(NomeDoEmpregadoCadastradoLabel);
        cadastrodeEmpregadosPanel.add(selecaoDoSuperiorLabel);
        cadastrodeEmpregadosPanel.add(selecaoDoTipoLabel);
        cadastrodeEmpregadosPanel.add(comboBoxdoTipo);
        cadastrodeEmpregadosPanel.add(comboBoxdosSuperiores);
        cadastrodeEmpregadosPanel.add(nomeDoNovoEmpregadoTextField);
        cadastrodeEmpregadosPanel.add(cadastrarButton);

        JPanel consultadeEmpregadosPanel = new JPanel(null);
        consultadeEmpregadosPanel.add(nomedoFuncionarioaConsultar);
        consultadeEmpregadosPanel.add(selecaodoTipodeConsultaLabel);
        consultadeEmpregadosPanel.add(listadeSuperioresLabel);
        consultadeEmpregadosPanel.add(nomesdeTodososFuncionariosComboBox);
        consultadeEmpregadosPanel.add(comboBoxdoTipodeConsulta);
        consultadeEmpregadosPanel.add(listagemdeSuperioresTextField);

        tabbedPane.add("Cadastro", cadastrodeEmpregadosPanel);
        tabbedPane.add("Consulta", consultadeEmpregadosPanel);
        myFrame.setVisible(true);
        myFrame.add(tabbedPane);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
