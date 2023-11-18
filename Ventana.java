import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {




    PanelAsientos asientos = new PanelAsientos();

    public Ventana()  {
        this.setSize(1000, 800);//Ancho y largo respectivamente
        setBackground(Color.CYAN);//Color de fondo
        setTitle("Coso de buses"); //Titulo
        setLocationRelativeTo(null); //Centra el programa al abrirlo
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Cierra el programa al cerrar la ventana
        setLayout(new BorderLayout());//Permite organizar los JPanel
        //add(rec,BorderLayout.WEST);
        //add(hor,BorderLayout.CENTER);
        add(asientos);


    }

}