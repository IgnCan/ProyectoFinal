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
public class BotonesInteractivos extends JPanel {
    private List<BotonAcomprobar> botonesAcomprobar;
    private JButton Reservador;
    private buses bus;
    private int PrecioTotal=0;
    private int precioBoleto;
    public BotonesInteractivos(int id) {
//        setTitle("Botones Interactivos");
        setSize(800, 800);

        precioBoleto=bus.getPresioPorID(id);
        System.out.println(precioBoleto);

        botonesAcomprobar = new ArrayList<>();

//        setLayout(new GridBagLayout());
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.gridx = 0; // Columna 0

        // Crear varios BotonesAcomprobar
//        for (int i = 1; i <= 5; i++) {
//            BotonAcomprobar botonAcomprobar = new BotonAcomprobar("Asiento " + i);
//            gbc.gridy = i;
//            add(botonAcomprobar,gbc);
//            botonesAcomprobar.add(botonAcomprobar);
//        }

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        int NumeroAsiento=1;
        int Columna=0;
        int Fila=0;
        for (int i = 1; i <= 50; i++) {
            gbc.gridy = Columna;
            gbc.gridx = Fila;
            if (i%5==3){
                JLabel relleno = new JLabel("                     ");
                add(relleno,gbc);
                Fila=Fila+1;
            } else {
                BotonAcomprobar botonAcomprobar = new BotonAcomprobar("Asiento " + NumeroAsiento);
                add(botonAcomprobar,gbc);
                Fila=Fila+1;
                NumeroAsiento=NumeroAsiento+1;
                botonesAcomprobar.add(botonAcomprobar);
            }
            if ((i)%5==0){Columna=Columna+1;Fila=0;}
        }

        Reservador = new JButton("Reservar");
        // Agregar ActionListener para el segundo botón
        Reservador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Verificar y desactivar BotonesAcomprobar según cierta condición
                for (BotonAcomprobar boton : botonesAcomprobar) {
                    if (boton.getBackground() == Color.GREEN) {
                        boton.setEnabled(false);
                        boton.setBackground(Color.RED);
                        PrecioTotal=PrecioTotal+precioBoleto;
                        System.out.println(PrecioTotal);
                    }
                }
                PrecioTotal=0;
            }
        });

        // Configurar el diseño del frame (puedes usar otros layouts según tus necesidades)
        //setLayout(new java.awt.FlowLayout());



        // Agregar los BotonesAcomprobar al frame
//        for (BotonAcomprobar boton : botonesAcomprobar) {
//            add(boton);
//        }
        // Agregar el botón 2 al frame
        gbc.gridy = 10;
        gbc.gridx = 10;
        add(Reservador);

//        setVisible(true);
    }


}


