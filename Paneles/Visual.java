//package Paneles;
//
//import AsignacionDeHorarios.AsignacionFinal;
//import Botones.Asientos;
//import Enums.Horario;
//import Enums.Recorrido;
//import Enums.TipoAsiento;
//import Enums.TipoBus;
////import Pruebas.PanelReserva;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//
//
///**
// * Es el Jframe principal donde se ejecutara todo, usa cardlayout para moverse entre paneles
// */
//public class Visual extends JFrame {
//    //Variabe Marcada
//
//    private ArrayList<ArrayList<Object>> listaPrincipal;
//
//    String nuevoIdentificador = "voilá";
//    // Estos son los paneles
//    CardLayout cardLayout = new CardLayout();
//
//
//    //Variable Marcada
//    PanelReserva panelReserva;// =new PanelReserva(listaPrincipal,this::mostrarSubLista);
//
//
//
//    //El cardLayout
//    JPanel cardPanel = new JPanel(cardLayout);
//    //Las variables que se iran modificando en el proceso
//    private Recorrido rec =null;
//    private Horario hor=null;
//    private TipoAsiento asi=null;
//    private TipoBus bus=null;
//    private AsignacionFinal asignacionFinal=null;
//
//    //Variable que identifica el Jpanen en el que estamos
//    private int currentPanelIndex;
//
//    /**
//     *
//     */
//
//    public Visual()  {
//
//        listaPrincipal = new ArrayList<>();
//        this.setSize(1000, 800);//Ancho y largo respectivamente
//        setBackground(Color.CYAN);//Color de fondo
//        setTitle("Coso de buses"); //Titulo
//        setLocationRelativeTo(null); //Centra el programa al abrirlo
//        setDefaultCloseOperation(EXIT_ON_CLOSE); //Cierra el programa al cerrar la ventana
//        setLayout(new BorderLayout());//Permite organizar los JPanel
//
//        listaPrincipal = new ArrayList<>();
//
////        panelReserva = new PanelReserva(this::agregarNuevaSubLista, listaPrincipal, nuevoIdentificador);
//
//        this.add(panelRecorrido);
//        this.add(panelHorarios);
//        this.add(panelReserva);
//
//        // Agregar los paneles al contenedor con CardLayout
//        // Le agrego el panel de Recorrido
//        cardPanel.add(panelRecorrido,"Panel1");
//        cardPanel.add(panelHorarios, "Panel2");
//        cardPanel.add(panelReserva, "Panel3");
//
//        // Crear botones para cambiar entre las tarjetas
//        RetroBot retroPanel = new RetroBot("Retroceder");
//        AvanzarBot avanPanel = new AvanzarBot("Siguiente");
//
//        // Crear un panel para los botones de cambio de tarjeta
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.add(retroPanel);
//        buttonPanel.add(avanPanel);
//
//        // Agregar el contenedor con CardLayout y el panel de botones al frame
//        this.add(cardPanel, BorderLayout.CENTER);
//        this.add(buttonPanel, BorderLayout.SOUTH);
//
//        // Hacer visible el frame
//        this.setVisible(true);
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    public void setRec(Recorrido rec) {
//        this.rec = rec;
//    }
//
//    public void setHor(Horario hor) {
//        this.hor = hor;
//    }
//
//    public void setAsi(TipoAsiento asi) {
//        this.asi = asi;
//    }
//
//    public void setBus(TipoBus bus) {
//        this.bus = bus;
//    }
//
//    public class AvanzarBot extends JButton{
//        public AvanzarBot(String text){
//            super(text);
//            //this.setEnabled(false);
//            this.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//
//                    rec=panelRecorrido.getRec();
//                    bus=panelHorarios.getBus();
//                    asi=panelHorarios.getAsi();
//                    hor=panelHorarios.getHor();
//                    asignacionFinal = panelHorarios.getAsignacionFinal();
//
//                    if(rec!=null && (currentPanelIndex==0 )){
//
//                        System.out.println(rec.getPresio() + rec.getRecorrido());
//                        panelHorarios.setRec(rec);
//                        panelHorarios.mostrarPanelHorario();
//                        cardLayout.next(cardPanel);
//                        currentPanelIndex=currentPanelIndex+1;
//
//                    } else if (rec!=null && bus!=null && asi!=null && hor!=null && currentPanelIndex == 1) {
////                        panelHorarios.setRec(rec);
////                        panelReserva.setRec(rec);
////                        panelReserva.setAsi(asi);
////                        panelReserva.setBus(bus);
////                        panelReserva.setHor(hor);
////                        panelReserva.setAsignacionFinal(asignacionFinal);
////                        panelReserva.mostrarPanelReserva();
//                        cardLayout.next(cardPanel);
//
//
//
//                        currentPanelIndex=currentPanelIndex+1;
//
//                    } else if (currentPanelIndex == 2 ) {
//                        cardLayout.show(cardPanel,"Panel1");
//                        rec=null;
//                        bus=null;
//                        asi=null;
//                        hor=null;
//                        asignacionFinal = null;
//                        currentPanelIndex=0;
//                    }
//                }
//            });
//        }
//    }
//
//    public class RetroBot extends JButton{
//        public RetroBot(String text){
//            super(text);
//            this.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    if(currentPanelIndex==1){
//                        rec=null;
//                        currentPanelIndex=currentPanelIndex-1;
//                        cardLayout.previous(cardPanel);
//                    } else if (currentPanelIndex==2) {
//                        bus=null;
//                        asi=null;
//                        hor=null;
//                        asignacionFinal = null;
//                        currentPanelIndex=currentPanelIndex-1;
//                        cardLayout.previous(cardPanel);
//                    }
//                }
//            });
//        }
//    }
//
//
//}