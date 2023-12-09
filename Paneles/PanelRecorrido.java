package Paneles;

import Enums.Buses;
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
//            button.addActionListener(new ActionListener() {
//                public void actionPerformed(ActionEvent e) {
//                    // Lógica cuando se presiona un botón
//                    System.out.println("Botón presionado: " + tipoAsiento);
//                }
//            });
            this.add(button);
        }
//        for (int i=1;i<=9;i=i+1){
//            this.add(new JButton("recorrido" +i));
//        }
//        String rec = Recorrido.RECORRIDO4.getRecorrido();
    }
}
