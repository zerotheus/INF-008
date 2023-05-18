package view;

import javax.swing.JFrame;

import model.Cinema;

public class CinemaUI {

    private Cinema cinema;
    private JFrame frame;

    public void UIdoCinema() {

        cinema = new Cinema();

        frame = new JFrame("Cinema");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 450);
        frame.setVisible(true);
    }

}
