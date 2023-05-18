package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Cinema;

public class CinemaUI {

    private Cinema cinema;
    private JFrame frame;

    public void UIdoCinema() {

        cinema = new Cinema();
        JLabel SelecioneAsala = new JLabel("Sala Numero:");
        SelecioneAsala.setBounds(20, 30, 35, 25);
        Integer[] NumerodasSalas = cinema.getSalasIds();
        JComboBox<Integer> comboBoxdeSelecaodeSala = new JComboBox<Integer>(NumerodasSalas);
        comboBoxdeSelecaodeSala.setBounds(65, 30, 35, 25);

        frame = new JFrame("Cinema");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 450);
        frame.setVisible(true);
        frame.add(SelecioneAsala);
        frame.add(comboBoxdeSelecaodeSala);
    }

}
