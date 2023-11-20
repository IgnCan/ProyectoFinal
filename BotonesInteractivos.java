//import javax.swing.JButton;
//import javax.swing.JFrame;
//import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class BotonesInteractivos extends JFrame {
//    private JButton boton1;
//    private JButton boton2;
//
//    public BotonesInteractivos() {
//        setTitle("Botones Interactivos");
//        setSize(300, 200);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        boton1 = new JButton("Botón 1");
//        boton1.setBackground(Color.RED);
//
//        // Agregar ActionListener para el primer botón
//        boton1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Cambiar el color al presionar el botón
//                boton1.setBackground(boton1.getBackground() == Color.RED ? Color.GREEN : Color.RED);
//            }
//        });
//
//        boton2 = new JButton("Botón 2");
//        // Agregar ActionListener para el segundo botón
//        boton2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Desactivar el primer botón si es verde
//                if (boton1.getBackground() == Color.GREEN) {
//                    boton1.setEnabled(false);
//                }
//            }
//        });
//
//        // Configurar el diseño del frame (puedes usar otros layouts según tus necesidades)
//        setLayout(new java.awt.FlowLayout());
//
//        // Agregar los botones al frame
//        add(boton1);
//        add(boton2);
//
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        javax.swing.SwingUtilities.invokeLater(() -> new BotonesInteractivos());
//        BotonesInteractivos v1 =new BotonesInteractivos();
//    }
//}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BotonesInteractivos extends JPanel {
    private List<Object> asientos;
    private buses bus;
    private int PrecioTotal=0;

    private String Recorrido= "Talca-Concepcion";

    private String Horario= "08:00";

    private int precioBoleto;
    public BotonesInteractivos(int id) {

        precioBoleto=bus.getPresioPorID(id);
        System.out.println("El precio por ticket es: " + precioBoleto);
        System.out.println("El recorrido y horario es: "+ Recorrido+" "+Horario);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //Esto crea una lista con los botones, la idea es dejarla a parte para ir modificando los botones//
        //en masa de ser necesario//
        asientos = new ArrayList<>();
        int NumeroAsiento=1;
        for (int i=1; i<=41;i=i+1){
            if (i==1){
                asientos.add(Recorrido+" "+Horario);
            } else {
                asientos.add(new Asientos("Asiento " + NumeroAsiento));
                NumeroAsiento = NumeroAsiento + 1;
            }
        }


        // Todo esto crea el panel de botones con una bonita matriz
        int Columna=0;
        int Fila=0;
        int y=1;

        for (int i = 1; i <= 50; i++) {
            gbc.gridy = Columna;
            gbc.gridx = Fila;
            if (i%5==3){
                JLabel relleno = new JLabel("                     ");
                add(relleno,gbc);
                Fila=Fila+1;
            } else {

                add((Component) asientos.get(y),gbc);
                Fila=Fila+1;
                NumeroAsiento=NumeroAsiento+1;
                y=y+1;

            }
            if (i%5==0){Columna=Columna+1;Fila=0;}
        }

        gbc.gridy = 10;
        gbc.gridx = 10;
        add(new Reservador());

    }
    public class Reservador extends JButton{
        public Reservador(){
            setText("reservar");
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    for (Object elemento : asientos) {
                        if(elemento instanceof Asientos){
                            Asientos bot = (Asientos) elemento;
                            if (bot.getBackground() == Color.GREEN) {
                                bot.setEnabled(false);
                                bot.setBackground(Color.RED);
                                PrecioTotal=PrecioTotal+precioBoleto;
                                System.out.println(PrecioTotal);
                            }
                        }else if(elemento instanceof String){
                                System.out.println(elemento);
                        }
                    }
                    System.out.println("El precio total de la compra es: " + PrecioTotal);

                    PrecioTotal=0;
                }
            });

        }
    }

}


