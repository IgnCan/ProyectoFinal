package Paneles;

import AsignacionDeHorarios.Asignaciones;

import javax.swing.*;

public class PanelHorarios extends JPanel {
    public Asignaciones oa = new Asignaciones;
    public PanelHorarios(){
        this.add(new JButton("oa"));
    }
}
