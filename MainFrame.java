import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainFrame extends JFrame {

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();

    public MainFrame() {
        setTitle("Ejemplo de creación de botones");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.RED);

        // Crear los paneles

        //add(panel1);
        //add(panel2);


        // Crear el botón en el primer panel
        JButton addButton = new JButton("Agregar Botones");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Al hacer clic en el botón, crear y agregar botones al segundo panel
                agregarBotones();
            }
        });

        panel1.add(addButton);
        setVisible(true);
    }

    public void agregarBotones() {
        // Crear y agregar botones al segundo panel
        for (int i = 1; i <= 5; i++) {
            JButton nuevoBoton = new JButton("Botón " + i);
            panel2.add(nuevoBoton);
        }

        // Revalidar y repintar el segundo panel para actualizar la interfaz
        panel2.revalidate();
        panel2.repaint();
    }

//    public static void main(String[] args) {
//        JFrame v2 = new MainFrame();
//        v2.setVisible(true);
//        //javax.swing.SwingUtilities.invokeLater(() -> new MainFrame());
//    }
}
