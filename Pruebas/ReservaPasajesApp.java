package Pruebas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReservaPasajesApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        // Panel1 con un botón que se desactiva al presionarlo
        JPanel panel1 = new JPanel();
        JButton botonPanel1 = new JButton("Desactivar Botón");

        panel1.add(new JLabel("Contenido de la tarjeta 1"));
        panel1.add(botonPanel1);

        // Panel2
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Contenido de la tarjeta 2"));

        cardPanel.add(panel1, "tarjeta1");
        cardPanel.add(panel2, "tarjeta2");

        JButton mostrarTarjeta1 = new JButton("Mostrar Tarjeta 1");
        JButton mostrarTarjeta2 = new JButton("Mostrar Tarjeta 2");
        mostrarTarjeta2.setEnabled(false); // Inicialmente desactivado

        botonPanel1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonPanel1.setEnabled(false);
                mostrarTarjeta2.setEnabled(true);
            }
        });

        mostrarTarjeta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "tarjeta1");
            }
        });

        mostrarTarjeta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "tarjeta2");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(mostrarTarjeta1);
        buttonPanel.add(mostrarTarjeta2);

        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}

