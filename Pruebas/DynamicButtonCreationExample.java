package Pruebas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DynamicButtonCreationExample extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private JPanel panel1;
    private JPanel panel2;

    public DynamicButtonCreationExample() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Configurar el layout principal con CardLayout
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Configurar el primer panel con botones numerados del 1 al 5
        panel1 = new JPanel(new GridLayout(1, 5));
        for (int i = 1; i <= 5; i++) {
            JButton button = new JButton(Integer.toString(i));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    showPanel2(Integer.parseInt(button.getText()));
                }
            });
            panel1.add(button);
        }

        // Configurar el segundo panel (inicialmente vacío)
        panel2 = new JPanel();

        // Agregar los paneles al layout principal
        mainPanel.add(panel1, "Panel1");
        mainPanel.add(panel2, "Panel2");

        // Agregar el layout principal al frame
        add(mainPanel);

        // Mostrar el frame
        setVisible(true);
    }

    private void showPanel2(int numberOfButtons) {
        // Crear botones en el segundo panel basado en el número seleccionado
        panel2.removeAll();
        panel2.setLayout(new GridLayout(1, numberOfButtons));
        for (int i = 1; i <= numberOfButtons; i++) {
            JButton button = new JButton("Button " + i);
            panel2.add(button);
        }

        // Cambiar al segundo panel
        cardLayout.show(mainPanel, "Panel2");

        // Repintar el frame para que los cambios sean visibles
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DynamicButtonCreationExample());
    }
}

