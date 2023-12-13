package Pruebas;//package Pruebas;

//import Botones.Asientos;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//
//public class SubListPanel extends JPanel {
//
//    private SubListCallback subListCallback;
//    private ArrayList<ArrayList<Object>> listaPrincipal;
//
//    // Componentes para mostrar botones
//    private JButton boton1;
//    private JButton boton2;
//
//    String hola = "hola";
//
//    public SubListPanel(SubListCallback subListCallback, ArrayList<ArrayList<Object>> listaPrincipal) {
//        this.subListCallback = subListCallback;
//        this.listaPrincipal = listaPrincipal;
//
//        setLayout(new FlowLayout());
//
//        // Crear campo de texto para el identificador
////        JTextField identificadorTextField = new JTextField(10);
////        add(identificadorTextField);
//
//        // Crear botón para agregar nueva sub-lista
////        JButton agregarSubListaButton = new JButton("Agregar Sub-Lista");
////        agregarSubListaButton.addActionListener(e -> subListCallback.mostrarSubLista(hola));
////        add(agregarSubListaButton);
//
////        subListCallback.mostrarSubLista(hola);
//
//        // Inicializar los botones (se muestran después)
//        boton1 = new JButton("Botón 1");
//        boton2 = new JButton("Botón 2");
//    }
//
//    public interface SubListCallback {
//        void mostrarSubLista(String nuevoIdentificador);
//    }
//
//    // Método para mostrar todos los componentes de la sublista
//    public void mostrarBotones(ArrayList<Object> subLista) {
//        removeAll(); // Limpiar el panel antes de agregar componentes
//        String identificador = (String) subLista.get(0);
//        add(new JLabel("Identificador: " + identificador));
//
//        // Iterar sobre los elementos de la sublista y agregarlos al panel
//        for (int i = 1; i < subLista.size(); i++) {
//            Object elemento = subLista.get(i);
//            if (elemento instanceof JButton) {
//                JButton boton = (JButton) elemento;
//                add(boton);
//            } else {
//                // Puedes agregar lógica para otros tipos de elementos aquí
//            }
//        }
//
//        add(new Reservador(subLista));
//
//
//        // Volver a validar el layout
//        revalidate();
//        repaint();
//    }
//
//    /**
//     * Este boton finaliza la reserva de los pasajes
//     */
//    public class Reservador extends JButton{
//        public Reservador(ArrayList<Object> subLista){
//            setText("Reservar");
//            addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//
//                    for (Object elemento : subLista) {
//                        if(elemento instanceof Asientos){
//                            Asientos bot = (Asientos) elemento;
//                            if (bot.getBackground() == Color.GREEN) {
//                                bot.Desactivacion();
//                                //NO BORRAR HASTA PRUEBA EN CARDLAYOUT
//                                //bot.setEnabled(false);
//                                //bot.setBackground(Color.RED);
//                                //PrecioTotal=PrecioTotal+precioPorBoleto;
//                                //System.out.println(PrecioTotal);
//                            }
//                        }else if(elemento instanceof String){
//                            System.out.println(elemento);
//                        }
//                    }
////                    vent.recibirLista(asientos);
////
////                    System.out.println(listaPrincipal().get(0).get(0) + "dfhsjadgh");
//                    //System.out.println("El precio total de la compra es: " + PrecioTotal);
//                    //PrecioTotal=0;
//                }
//            });
//
//        }
//    }
//
//
//}


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SubListPanel extends JPanel {

    private SubListCallback subListCallback;
    private ArrayList<ArrayList<Object>> listaPrincipal;

    // Componentes para mostrar botones
    private JButton boton1;
    private JButton boton2;

    public SubListPanel(SubListCallback subListCallback, ArrayList<ArrayList<Object>> listaPrincipal) {
        this.subListCallback = subListCallback;
        this.listaPrincipal = listaPrincipal;

        setLayout(new FlowLayout());

        // Crear campo de texto para el identificador
        JTextField identificadorTextField = new JTextField(10);
        add(identificadorTextField);

        // Crear botón para agregar nueva sub-lista
        JButton agregarSubListaButton = new JButton("Agregar Sub-Lista");
        agregarSubListaButton.addActionListener(e -> subListCallback.mostrarSubLista(identificadorTextField.getText()));
        add(agregarSubListaButton);

        // Inicializar los botones (se muestran después)
        boton1 = new JButton("Botón 1");
        boton2 = new JButton("Botón 2");
    }

    public interface SubListCallback {
        void mostrarSubLista(String nuevoIdentificador);
    }

    // Método para mostrar todos los componentes de la sublista
    public void mostrarBotones(ArrayList<Object> subLista) {
        removeAll(); // Limpiar el panel antes de agregar componentes
        String identificador = (String) subLista.get(0);
        add(new JLabel("Identificador: " + identificador));

        // Iterar sobre los elementos de la sublista y agregarlos al panel
        for (int i = 1; i < subLista.size(); i++) {
            Object elemento = subLista.get(i);
            if (elemento instanceof JButton) {
                JButton boton = (JButton) elemento;
                add(boton);
            } else {
                // Puedes agregar lógica para otros tipos de elementos aquí
            }
        }

        // Volver a validar el layout
        revalidate();
        repaint();
    }
}
