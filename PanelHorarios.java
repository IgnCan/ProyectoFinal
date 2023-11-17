import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelHorarios extends JPanel {
    private Ventana mainFrame;
    JButton BotonPruebaH = new JButton("SeleccionHorario");
    JButton BotonPuebaSig = new JButton("Siguiente");
    public PanelHorarios(Ventana frame) {
        this.mainFrame = frame;

        setBackground(Color.RED);
        setPreferredSize(new Dimension(500, 400));
        add(BotonPruebaH);
        add(BotonPuebaSig);
        revalidate();
        repaint();
        BotonPuebaSig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Al hacer clic en el botón, cambiar al Panel2
                mainFrame.getContentPane().removeAll();
                mainFrame.getContentPane().add(new PanelEleccionBus(frame));
                mainFrame.revalidate();
                mainFrame.repaint();
            }
        });

    }
}
