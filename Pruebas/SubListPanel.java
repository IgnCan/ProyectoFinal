package Pruebas;//package Pruebas;

//import Botones.Asientos;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//public class SubListPanel extends JPanel {
//
//    private SubListCallback subListCallback;
//    private ArrayList<ArrayList<Object>> listaPrincipal;
//    private String nuevoIdentificador;
//
//    // Componentes para mostrar botones
//    private JButton boton1;
//    private JButton boton2;
//
//    public SubListPanel(SubListCallback subListCallback, ArrayList<ArrayList<Object>> listaPrincipal, String nuevoIdentificador) {
//        this.subListCallback = subListCallback;
//        this.listaPrincipal = listaPrincipal;
//        this.nuevoIdentificador = nuevoIdentificador;
//
//        setLayout(new FlowLayout());
//
//        // Crear campo de texto para el identificador
//        //JTextField identificadorTextField = new JTextField(10);
//        //add(identificadorTextField);
//
//        // Crear botón para agregar nueva sub-lista
//        JButton agregarSubListaButton = new JButton("Agregar Sub-Lista");
//        agregarSubListaButton.addActionListener(e -> subListCallback.mostrarSubLista(nuevoIdentificador));
//        add(agregarSubListaButton);
//
////        subListCallback.mostrarSubLista(nuevoIdentificador);
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
//    // Método para mostrar los botones de la sublista
//    public void mostrarBotones(ArrayList<Object> subLista) {
//        removeAll(); // Limpiar el panel antes de agregar componentes
//        // Obtener identificador y botones de la sublista
//        String identificador = (String) subLista.get(0);
////        Agregar el identificador y los botones al panel
////        add(new JLabel("Identificador: " + identificador));
//
//        setLayout(new GridBagLayout());
//        GridBagConstraints gbc = new GridBagConstraints();
//
//        int Columna=0;
//        int Fila=0;
//        int y=1;
//        int a=1;
//        for (int i = 1; i <= 50; i++) {
//            gbc.gridy = Columna;
//            gbc.gridx = Fila;
//
//            if (i%5==3){
//                JLabel relleno = new JLabel("                     ");
//                add(relleno,gbc);
//                Fila=Fila+1;
//            } else {
//                Object elemento = subLista.get(a);
//                if (elemento instanceof Asientos) {
//                    Asientos boton = (Asientos) elemento;
//                    add(boton, gbc);
//                    a=a+1;
//                }
////                add((Component) elementoObjetivo.get(y),gbc);
//                Fila=Fila+1;
//                //NumeroAsiento=NumeroAsiento+1;
//                y=y+1;
//
//            }
//            if (i%5==0){Columna=Columna+1;Fila=0;}
//
//        }
//        a=1;
//
////        gbc.gridy = 10;
////        gbc.gridx = 10;
//        add(new Reservador(subLista));
//
//        // Volver a validar el layout
//        revalidate();
//        repaint();
//    }
//
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
//}
//
//
//
//

import Botones.Asientos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

        add(new Reservador(subLista));


        // Volver a validar el layout
        revalidate();
        repaint();
    }

    /**
     * Este boton finaliza la reserva de los pasajes
     */
    public class Reservador extends JButton{
        public Reservador(ArrayList<Object> subLista){
            setText("Reservar");
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    for (Object elemento : subLista) {
                        if(elemento instanceof Asientos){
                            Asientos bot = (Asientos) elemento;
                            if (bot.getBackground() == Color.GREEN) {
                                bot.Desactivacion();
                                //NO BORRAR HASTA PRUEBA EN CARDLAYOUT
                                //bot.setEnabled(false);
                                //bot.setBackground(Color.RED);
                                //PrecioTotal=PrecioTotal+precioPorBoleto;
                                //System.out.println(PrecioTotal);
                            }
                        }else if(elemento instanceof String){
                            System.out.println(elemento);
                        }
                    }
//                    vent.recibirLista(asientos);
//
//                    System.out.println(listaPrincipal().get(0).get(0) + "dfhsjadgh");
                    //System.out.println("El precio total de la compra es: " + PrecioTotal);
                    //PrecioTotal=0;
                }
            });

        }
    }


}



