package Paneles;

import AsignacionDeHorarios.AsignacionFinal;
import AsignacionDeHorarios.Asignaciones;
import Enums.Recorrido;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PanelHorarios extends JPanel {
    public Asignaciones oa = new Asignaciones();
    List<AsignacionFinal> asignacionesRecorrido1 = oa.obtenerAAsignacionFinal(Recorrido.RECORRIDO5);
    public PanelHorarios(){
        this.setLayout(new GridLayout(0, 1));
        for (AsignacionFinal asignacion : asignacionesRecorrido1) {
            JButton boton = new JButton(asignacion.toString());
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(asignacion.getHorario().getHora());
                }
            });
            this.add(boton);

//            for (AsignacionFinal asignacion : asignacionesRecorrido1) {
//                System.out.println("- " + asignacion.toString());
//            }
        }
    }


}
