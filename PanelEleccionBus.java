import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelEleccionBus extends JPanel {
    JButton BotonNormal = new JButton("BotonNormal");
    JButton BotonSalonCama = new JButton("BotonSalonCama");
    JButton BotonDosPisos = new JButton("BotonDosPisos");
    JButton BotonSiguiente = new JButton("siguiente");
    JButton BotonVolver =new JButton("volver");

    private Ventana mainFrame;
    public PanelEleccionBus(Ventana frame){
        this.mainFrame = frame;
        setBackground(Color.CYAN);
        add(BotonVolver);
        add(BotonNormal);
        add(BotonSalonCama);
        add(BotonDosPisos);
        add(BotonSiguiente);

        BotonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Al hacer clic en el botón, cambiar al Panel2
                mainFrame.getContentPane().removeAll();
                mainFrame.getContentPane().add(new PanelRecorridos(frame));
                //mainFrame.getContentPane().add(new PanelHorarios(frame));
                mainFrame.revalidate();
                mainFrame.repaint();
            }
        });

    }
}
