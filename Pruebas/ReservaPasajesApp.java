package Pruebas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReservaPasajesApp {
    private JFrame frame;
    private JPanel mainPanel;
    private CardLayout cardLayout;

    public ReservaPasajesApp() {
        frame = new JFrame("Sistema de Reserva de Pasajes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        mainPanel = new JPanel();
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);

        // Panel para los recorridos
        JPanel recorridosPanel = new JPanel();
        JButton recorrido1Button = new JButton("Recorrido 1");
        JButton recorrido2Button = new JButton("Recorrido 2");

        recorrido1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar horarios disponibles para el Recorrido 1
                cardLayout.show(mainPanel, "horariosRecorrido1");
            }
        });

        recorrido2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar horarios disponibles para el Recorrido 2
                cardLayout.show(mainPanel, "horariosRecorrido2");
            }
        });

        recorridosPanel.add(recorrido1Button);
        recorridosPanel.add(recorrido2Button);

        // Panel para los horarios del Recorrido 1
        JPanel horariosRecorrido1Panel = new JPanel();
        horariosRecorrido1Panel.add(new JLabel("Horarios disponibles para Recorrido 1"));

        // Panel para los horarios del Recorrido 2
        JPanel horariosRecorrido2Panel = new JPanel();
        horariosRecorrido2Panel.add(new JLabel("Horarios disponibles para Recorrido 2"));

        // Agregar paneles al CardLayout
        mainPanel.add(recorridosPanel, "recorridos");
        mainPanel.add(horariosRecorrido1Panel, "horariosRecorrido1");
        mainPanel.add(horariosRecorrido2Panel, "horariosRecorrido2");

        // Mostrar inicialmente el panel de recorridos
        cardLayout.show(mainPanel, "recorridos");

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ReservaPasajesApp();
            }
        });
    }
}
