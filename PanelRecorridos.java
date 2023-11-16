import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelRecorridos extends JPanel {
    private Ventana mainFrame;

    public PanelRecorridos(Ventana frame) {
        this.mainFrame = frame;
        setBackground(Color.PINK);
        setPreferredSize(new Dimension(500, 400));

        JButton BotonPruebaR = new JButton("Selecciona  Recorrido");
        BotonPruebaR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Al hacer clic en el botón, cambiar al Panel2
                //mainFrame.getContentPane().removeAll();
                //mainFrame.getContentPane().add(new PanelHorarios());
                //mainFrame.revalidate();
                //mainFrame.repaint();
                for (Component component : getComponents()) {
                    if (component instanceof JButton) {
                        component.setEnabled(false);
                    }
                }
            }
        });

        add(BotonPruebaR);
    }
}
