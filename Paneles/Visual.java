package Paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Es el Jframe principal donde se ejecutara todo, usa cardlayout para moverse entre paneles
 */
public class Visual extends JFrame {

    CardLayout cardLayout = new CardLayout();

    public Visual()  {
        this.setSize(1000, 800);//Ancho y largo respectivamente
        setBackground(Color.CYAN);//Color de fondo
        setTitle("Coso de buses"); //Titulo
        setLocationRelativeTo(null); //Centra el programa al abrirlo
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Cierra el programa al cerrar la ventana
        setLayout(new BorderLayout());//Permite organizar los JPanel


        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crear el contenedor con CardLayout

        JPanel cardPanel = new JPanel(cardLayout);

        // Crear dos paneles con contenido diferente
        JPanel panel1 = new JPanel();
        for (int i=1;i<=9;i=i+1){
            panel1.add(new JButton("recorrido" +i));
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