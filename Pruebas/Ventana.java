package Pruebas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    private String hola;  // Supongamos que esta es tu clase de objeto
    private JPanel miPanel;
    private JButton[] botones;  // Supongamos que estos son tus botones

    public Ventana() {
        this.hola = null;  // El objeto inicialmente es nulo

        // Inicializa tu JFrame y JPanel
        miPanel = new JPanel();

        // Inicializa tus botones
        botones = new JButton[5];  // Cambia el tamaño según la cantidad de botones que tengas

        for (int i = 0; i < botones.length; i++) {
            botones[i] = new JButton("Botón " + (i + 1));
            miPanel.add(botones[i]);
            botones[i].setEnabled(false);  // Desactiva los botones inicialmente
            final int botonIndex = i;  // Necesario para acceder al índice en el ActionListener

            // Agrega un ActionListener a cada botón
            botones[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Coloca aquí el código que deseas ejecutar cuando se presiona un botón
                    System.out.println("Botón " + (botonIndex + 1) + " presionado.");
                }
            });
        }

        // Configura tu JFrame y hazlo visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miPanel.add(new JButton("Cambiar Objeto"));
        miPanel.getComponent(5).setEnabled(true);
        setSize(400, 200);
        setLocationRelativeTo(null);
        add(miPanel);
        setVisible(true);

        // Agrega un ActionListener a un evento que cambie tu objeto
        // Por ejemplo, un botón que haga algo y establezca el objeto como no nulo
        JButton cambiarObjetoButton = new JButton("Cambiar Objeto");
        cambiarObjetoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hola = "hola" ; // Cambia esto según la lógica de tu aplicación
                // Activa los botones al cambiar el objeto
                for (JButton boton : botones) {
                    boton.setEnabled(true);

                }
                System.out.println(hola);
            }
        });
        miPanel.add(cambiarObjetoButton);
    }

    public static void main(String[] args) {
        new Ventana();
    }

}

