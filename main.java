import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {



    public static void main(String[] args) {
//        Ventana v1 = new Ventana();
//        v1.setVisible(true);
        // Crear la instancia del frame en el hilo de despacho de eventos
        //javax.swing.SwingUtilities.invokeLater(() -> new Ventana());

//        MainFrame v2 = new MainFrame();
        javax.swing.SwingUtilities.invokeLater(() -> new BotonesInteractivos(1));

    }
}
