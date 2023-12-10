package Pruebas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample extends JFrame {
    private JPanel cardPanel;
    private CardLayout cardLayout;
    private int currentPanelIndex;  // Variable para almacenar el índice del panel actual

    public CardLayoutExample() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Crear el panel principal con CardLayout
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Crear y agregar tres paneles al cardPanel
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Panel 1"));
        cardPanel.add(panel1, "Panel1");

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Panel 2"));
        cardPanel.add(panel2, "Panel2");

        JPanel panel3 = new JPanel();
        panel3.add(new JLabel("Panel 3"));
        cardPanel.add(panel3, "Panel3");

        // Configurar el frame
        add(cardPanel);

        // Botón Prev
        JButton prevButton = new JButton("Prev");
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPreviousPanel();
            }
        });

        // Botón Next
        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNextPanel();
            }
        });

        // Agregar botones al frame
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Mostrar el frame
        setVisible(true);
    }

    private void showPreviousPanel() {
        // Realizar la lógica específica para el botón Prev según el panel actual
        if (currentPanelIndex > 0) {
            currentPanelIndex--;
            cardLayout.show(cardPanel, "Panel" + (currentPanelIndex + 1));
            System.out.println("retroseo");
        }
    }

    private void showNextPanel() {
        // Realizar la lógica específica para el botón Next según el panel actual
        if (currentPanelIndex < cardPanel.getComponentCount() - 1) {
            currentPanelIndex++;
            cardLayout.show(cardPanel, "Panel" + (currentPanelIndex + 1));
            System.out.println("anavso");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CardLayoutExample());
    }
}
