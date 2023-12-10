package Paneles;

import Enums.TipoBus;
import Enums.Recorrido;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Es el panel donde se muestran los recorridos disponibles (Hasta 10)
 */

public class PanelRecorrido extends JPanel {
//    private Recorrido rec;
    public PanelRecorrido(){
        Recorrido[] recorridos = Recorrido.values();

        for (Recorrido tipoAsiento : recorridos) {
            JButton button = new JButton(tipoAsiento.getRecorrido());
            this.add(button);
        }
//        String rec = Recorrido.RECORRIDO4.getRecorrido();
    }
}
