package Paneles;

import AsignacionDeHorarios.AsignacionFinal;
import AsignacionDeHorarios.Asignaciones;
import Enums.Horario;
import Enums.Recorrido;
import Enums.TipoAsiento;
import Enums.TipoBus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Panel donde se muestran los horarios disponibles
 */
public class PanelHorarios extends JPanel {
    public Asignaciones oa = new Asignaciones();
//    List<AsignacionFinal> asignacionesRecorrido1 = oa.obtenerAAsignacionFinal(Recorrido.RECORRIDO5);
    List<AsignacionFinal> asignacionesRecorrido1;

    Recorrido rec;
    Horario hor;
    TipoAsiento asi;
    TipoBus bus;

    /**
     * Método constructor del panel
     */
    public PanelHorarios(){
//        this.setLayout(new GridLayout(0, 1));
//        asignacionesRecorrido1=oa.obtenerAAsignacionFinal(rec);
//        for (AsignacionFinal asignacion : asignacionesRecorrido1) {
//            JButton boton = new JButton(asignacion.toString());
//
//             //Método para agregar acciones al presionar le jbutton del hora
//            boton.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    System.out.println(asignacion.getHorario().getHora());
//                    hor=asignacion.getHorario();
//                    asi=asignacion.getTipoAsiento();
//                    bus=asignacion.getTipoBus();
//
//                }
//            });
//            this.add(boton);
//        }
    }

    public void mostrarPanelHorario() {
        // Crear botones en el segundo panel basado en el número seleccionado
        this.removeAll();
        this.setLayout(new GridLayout(0, 1));
        asignacionesRecorrido1=oa.obtenerAAsignacionFinal(rec);
        for (AsignacionFinal asignacion : asignacionesRecorrido1) {
            JButton boton = new JButton(asignacion.toString());

            //Método para agregar acciones al presionar le jbutton del hora
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(asignacion.getHorario().getHora());
                    hor=asignacion.getHorario();
                    asi=asignacion.getTipoAsiento();
                    bus=asignacion.getTipoBus();

                }
            });
            this.add(boton);
        }
//        // Cambiar al segundo panel
//        this.show(mainPanel, "Panel2");

        // Repintar el frame para que los cambios sean visibles
        revalidate();
        repaint();
    }

    public void setRec(Recorrido rec) {
        this.rec = rec;
    }
}
