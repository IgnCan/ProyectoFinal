package Paneles;

import Enums.Horario;
import Enums.Recorrido;
import Enums.TipoAsiento;
import Enums.TipoBus;

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
    Horario hor;
    TipoAsiento asi;
    TipoBus bus;



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
                rec=panelRecorrido.getRec();
                System.out.println(rec.getPresio() + rec.getRecorrido());
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

    public void setRec(Recorrido rec) {
        this.rec = rec;
    }

    public void setHor(Horario hor) {
        this.hor = hor;
    }

    public void setAsi(TipoAsiento asi) {
        this.asi = asi;
    }

    public void setBus(TipoBus bus) {
        this.bus = bus;
    }

    private void showPreviousPanel() {
        // Realizar acción específica para el botón "Prev" en función del panel actual
        if ("Panel1".equals(currentCard)) {
            System.out.println("Acción para Prev en Panel1");
            // Agrega aquí la lógica específica para Panel1 y el botón "Prev"
        } else if ("Panel2".equals(currentCard)) {
            System.out.println("Acción para Prev en Panel2");
            // Agrega aquí la lógica específica para Panel2 y el botón "Prev"
        } else if ("Panel3".equals(currentCard)) {
            System.out.println("Acción para Prev en Panel3");
            // Agrega aquí la lógica específica para Panel3 y el botón "Prev"
        }

        // Cambiar al panel anterior
        cardLayout.previous(cardPanel);
        currentCard = cardLayout.getCurrent(cardPanel);
    }

    private void showNextPanel() {
        // Realizar acción específica para el botón "Next" en función del panel actual
        if ("Panel1".equals(currentCard)) {
            System.out.println("Acción para Next en Panel1");
            // Agrega aquí la lógica específica para Panel1 y el botón "Next"
        } else if ("Panel2".equals(currentCard)) {
            System.out.println("Acción para Next en Panel2");
            // Agrega aquí la lógica específica para Panel2 y el botón "Next"
        } else if ("Panel3".equals(currentCard)) {
            System.out.println("Acción para Next en Panel3");
            // Agrega aquí la lógica específica para Panel3 y el botón "Next"
        }

        // Cambiar al siguiente panel
        cardLayout.next(cardPanel);
        currentCard = cardLayout.getCurrent(cardPanel);
    }


}