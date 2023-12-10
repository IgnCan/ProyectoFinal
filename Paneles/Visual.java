package Paneles;

import Enums.Recorrido;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Es el Jframe principal donde se ejecutara todo, usa cardlayout para moverse entre paneles
 */
public class Visual extends JFrame {

    CardLayout cardLayout = new CardLayout();
    PanelRecorrido panelRecorrido =new PanelRecorrido();
    PanelHorarios panelHorarios=new PanelHorarios();
    JPanel cardPanel = new JPanel(cardLayout);

    Recorrido rec;

    public Visual()  {
        this.setSize(1000, 800);//Ancho y largo respectivamente
        setBackground(Color.CYAN);//Color de fondo
        setTitle("Coso de buses"); //Titulo
        setLocationRelativeTo(null); //Centra el programa al abrirlo
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Cierra el programa al cerrar la ventana
        setLayout(new BorderLayout());//Permite organizar los JPanel

        this.add(panelRecorrido);
        this.add(panelHorarios);

        // Crear dos paneles con contenido diferente

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Contenido de la tarjeta 2"));

        // Agregar los paneles al contenedor con CardLayout
        // Le agrego el panel de Recorrido
        cardPanel.add(panelRecorrido,"PanelRecorrido.....");
        cardPanel.add(panelHorarios, "PanelHorarios.....");
        cardPanel.add(panel2, "tarjeta2");

        // Crear botones para cambiar entre las tarjetas
        JButton mostrarTarjeta1 = new JButton("prev");
        JButton mostrarTarjeta2 = new JButton("next");

        // Agregar ActionListener para cambiar entre las tarjetas
        mostrarTarjeta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.previous(cardPanel);
            }
        });

        mostrarTarjeta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });

        // Crear un panel para los botones de cambio de tarjeta
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(mostrarTarjeta1);
        buttonPanel.add(mostrarTarjeta2);

        // Agregar el contenedor con CardLayout y el panel de botones al frame
        this.add(cardPanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);

        // Hacer visible el frame
        this.setVisible(true);
    }
}