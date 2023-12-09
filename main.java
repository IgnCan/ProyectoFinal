import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class main {
//
//
//
//    public static void main(String[] args) {
//
//        Ventana v1 = new Ventana();
//        v1.setVisible(true);
//        // Crear la instancia del frame en el hilo de despacho de eventos
//        //javax.swing.SwingUtilities.invokeLater(() -> new Ventana());
//
////        MainFrame v2 = new MainFrame();
////        javax.swing.SwingUtilities.invokeLater(() -> new BotonesInteractivos(1));
//
//    }
//}

import javax.swing.*;
import java.awt.*;


public class main {
    public static void main(String[] args) {
        // Crear el frame principal
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crear el contenedor con CardLayout
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        // Crear dos paneles con contenido diferente
        JPanel panel1 = new JPanel();

        for (int i=1;i<=9;i=i+1){
            panel1.add(new JButton("recorrido " +i));
        }

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Contenido de la tarjeta 2"));

        // Agregar los paneles al contenedor con CardLayout
        cardPanel.add(panel1, "tarjeta1");
        cardPanel.add(panel2, "tarjeta2");

        // Crear botones para cambiar entre las tarjetas
        JButton mostrarTarjeta1 = new JButton("Mostrar Tarjeta 1");
        JButton mostrarTarjeta2 = new JButton("Mostrar Tarjeta 2");

        // Agregar ActionListener para cambiar entre las tarjetas
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

        // Crear un panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(mostrarTarjeta1);
        buttonPanel.add(mostrarTarjeta2);

        // Agregar el contenedor con CardLayout y el panel de botones al frame
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Hacer visible el frame
        frame.setVisible(true);
    }
}


