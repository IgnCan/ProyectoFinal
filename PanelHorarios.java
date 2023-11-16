import javax.swing.*;
import java.awt.*;

public class PanelHorarios extends JPanel {
    JButton BotonPruebaH = new JButton("SeleccionHorario");
    JButton BotonPuebaSig = new JButton("Siguiente");
    public PanelHorarios() {
        setBackground(Color.RED);
        setPreferredSize(new Dimension(500, 400));
        add(BotonPruebaH);
        add(BotonPuebaSig);

    }
}
