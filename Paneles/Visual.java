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
    PanelHorarios panelHorarios = new PanelHorarios();
    JPanel cardPanel = new JPanel(cardLayout);

    Recorrido rec;
    Horario hor;
    TipoAsiento asi;
    TipoBus bus;

    private int currentPanelIndex;  // Variable para almacenar el índice del panel actual

    /**
     *
     */
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
        cardPanel.add(panelRecorrido,"Panel1");
        cardPanel.add(panelHorarios, "Panel2");
        cardPanel.add(panel2, "Panel3");

        // Crear botones para cambiar entre las tarjetas
        JButton retroPanel = new JButton("Retro");
        AvanzarBot avanPanel = new AvanzarBot("Siguiente");


        // Agregar ActionListener para cambiar entre las paneles


        retroPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cardLayout.previous(cardPanel);
                showPreviousPanel();
            }
        });

        // Crear un panel para los botones de cambio de tarjeta
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(retroPanel);
        buttonPanel.add(avanPanel);

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

    public class AvanzarBot extends JButton{
        public AvanzarBot(String text){
            super(text);
            //this.setEnabled(false);
            this.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    rec=panelRecorrido.getRec();

                    if(rec!=null && (currentPanelIndex==0 )){

                        System.out.println(rec.getPresio() + rec.getRecorrido());
//                        panelHorarios=new PanelHorarios();
                        panelHorarios.setRec(rec);
                        panelHorarios.mostrarPanelHorario();
                        cardLayout.next(cardPanel);
                        currentPanelIndex=currentPanelIndex+1;
                    } else if (rec!=null && currentPanelIndex == 1) {
//                        panelHorarios.setRec(rec);

                    }
//                    if (currentPanelIndex < cardPanel.getComponentCount() - 1) {
//                        currentPanelIndex++;
//                        cardLayout.show(cardPanel, "Panel" + (currentPanelIndex + 1));
//
//                        // Activar o desactivar el botón "Next" según el estado de tuObjeto
//
//                    }
                }
            });
        }
    }

    private void showPreviousPanel() {
        // Realizar la lógica específica para el botón Prev según el panel actual
        if (currentPanelIndex > 0) {
            currentPanelIndex--;
            cardLayout.show(cardPanel, "Panel" + (currentPanelIndex + 1));
            System.out.println("retroseo");
        }
    }

    private void showNextPanel(JButton but) {
        // Realizar la lógica específica para el botón Next según el panel actual

        if (currentPanelIndex < cardPanel.getComponentCount() - 1){
//            but = (JButton) ((Container) getContentPane().getComponent(1)).getComponent(1);
            but.setEnabled(rec != null);
            currentPanelIndex++;
            cardLayout.show(cardPanel, "Panel" + (currentPanelIndex + 1));
            System.out.println("anavso");

        }


//        if (currentPanelIndex < cardPanel.getComponentCount() - 1) {
//            currentPanelIndex++;
//            cardLayout.show(cardPanel, "Panel" + (currentPanelIndex + 1));
//            System.out.println("anavso");
//        }

    }



}