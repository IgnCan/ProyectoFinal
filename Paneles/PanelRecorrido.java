package Paneles;

import Enums.Horario;
import Enums.TipoAsiento;
import Enums.TipoBus;
import Enums.Recorrido;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Es el panel donde se muestran los recorridos disponibles (Hasta 10)
 */

public class PanelRecorrido extends JPanel {
    private Recorrido rec;

    public PanelRecorrido(){
        Recorrido[] recorridos = Recorrido.values();
        this.setLayout(new GridLayout(0, 1));
        for (Recorrido reco : recorridos) {
            JButton button = new JButton(reco.getRecorrido());
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(reco.getRecorrido());
                    rec=reco;
                }
            });
            this.add(button);
        }
    }
    public Recorrido getRec() {
        return rec;
    }
}
