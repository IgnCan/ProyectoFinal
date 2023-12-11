package Paneles;

import AsignacionDeHorarios.AsignacionFinal;
import Enums.Horario;
import Enums.Recorrido;
import Enums.TipoAsiento;
import Enums.TipoBus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


/**
 * Es el Jframe principal donde se ejecutara todo, usa cardlayout para moverse entre paneles
 */
public class Visual extends JFrame {

    ArrayList<ArrayList<Object>> listaPrincipal = new ArrayList<>();


    // Estos son los paneles
    CardLayout cardLayout = new CardLayout();
    PanelRecorrido panelRecorrido =new PanelRecorrido();
    PanelHorarios panelHorarios = new PanelHorarios();
    PanelReserva panelReserva =new PanelReserva(this);
    //El cardLayout
    JPanel cardPanel = new JPanel(cardLayout);
    //Las variables que se iran modificando en el proceso
    private Recorrido rec;
    private Horario hor;
    private TipoAsiento asi;
    private TipoBus bus;
    private AsignacionFinal asignacionFinal;

    //Variable que identifica el Jpanen en el que estamos
    private int currentPanelIndex;

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
        this.add(panelReserva);

        // Agregar los paneles al contenedor con CardLayout
        // Le agrego el panel de Recorrido
        cardPanel.add(panelRecorrido,"Panel1");
        cardPanel.add(panelHorarios, "Panel2");
        cardPanel.add(panelReserva, "Panel3");

        // Crear botones para cambiar entre las tarjetas
        RetroBot retroPanel = new RetroBot("Retroceder");
        AvanzarBot avanPanel = new AvanzarBot("Siguiente");

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
                    bus=panelHorarios.getBus();
                    asi=panelHorarios.getAsi();
                    hor=panelHorarios.getHor();
                    asignacionFinal = panelHorarios.getAsignacionFinal();

                    if(rec!=null && (currentPanelIndex==0 )){

                        System.out.println(rec.getPresio() + rec.getRecorrido());
                        panelHorarios.setRec(rec);
                        panelHorarios.mostrarPanelHorario();
                        cardLayout.next(cardPanel);
                        currentPanelIndex=currentPanelIndex+1;

                    } else if (rec!=null && bus!=null && asi!=null && hor!=null && currentPanelIndex == 1) {
//                        panelHorarios.setRec(rec);
                        panelReserva.setRec(rec);
                        panelReserva.setAsi(asi);
                        panelReserva.setBus(bus);
                        panelReserva.setHor(hor);
                        panelReserva.setAsignacionFinal(asignacionFinal);

                        cardLayout.next(cardPanel);

                        panelReserva.mostrarPanelReserva();

                        currentPanelIndex=currentPanelIndex+1;

                    } else if (currentPanelIndex == 2 ) {
                        cardLayout.show(cardPanel,"Panel1");
                        rec=null;
                        bus=null;
                        asi=null;
                        hor=null;
                        asignacionFinal = null;
                        currentPanelIndex=0;
                    }
                }
            });
        }
    }

    public class RetroBot extends JButton{
        public RetroBot(String text){
            super(text);
            this.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(currentPanelIndex==1){
                        rec=null;
                        currentPanelIndex=0;
                    } else if (currentPanelIndex==2) {
                        bus=null;
                        asi=null;
                        hor=null;
                        asignacionFinal = null;
                        currentPanelIndex=1;
                    }
                }
            });
        }
    }

    /**
     * Se encarga de recibir la lista con los "pasajes" (botones desactivados)
     * ya comprados, y asi guardarlos al realizar compras multiples
     * @param lista Lista con botones "Asientos" y un string identificatorio al principio del array
     */
    public void recibirLista(ArrayList lista){
        listaPrincipal.add(lista);
    }

    public ArrayList<ArrayList<Object>> getListaPrincipal() {
        return listaPrincipal;
    }

}