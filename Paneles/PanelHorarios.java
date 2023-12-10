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

    private Recorrido rec;
    private Horario hor;
    private TipoAsiento asi;
    private TipoBus bus;

    AsignacionFinal asignacionFinal;

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

    /**
     * Metodo público que ej
     */

    public void mostrarPanelHorario() {
        // Crear botones en el segundo panel basado en el número seleccionado
        this.removeAll();
        this.setLayout(new GridLayout(0, 1));
        asignacionesRecorrido1=oa.obtenerAAsignacionFinal(rec);
        for (AsignacionFinal asignacion : asignacionesRecorrido1) {
            JButton boton = new JButton(asignacion.toString());

            /**
             * Método para agregar acciones al presionar le jbutton del hora
             */

            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(asignacion.toString());
                    asignacionFinal=asignacion;
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

    /**
     * setter de rec
     * @param rec
     */
    public void setRec(Recorrido rec) {
        this.rec = rec;
    }

    /**
     * getter de rec
     * @return Recorrido rec
     */
    public Recorrido getRec() {
        return rec;
    }

    /**
     * getter de variable hora
     * @return Horario hor
     */
    public Horario getHor() {
        return hor;
    }

    /**
     * getter de la varieble asi
     * @return TipoAsiento asi
     */
    public TipoAsiento getAsi() {
        return asi;
    }

    /**
     * getter de bus
     * @return TipoBus bus
     */
    public TipoBus getBus() {
        return bus;
    }

    public AsignacionFinal getAsignacionFinal(){
        return asignacionFinal;
    }
}
