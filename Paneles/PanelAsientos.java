package Paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelAsientos extends JPanel {
    public PanelAsientos(){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        int NumeroAsiento=1;
        int Columna=0;
        int Fila=0;
        for (int i = 1; i <= 50; i++) {
            gbc.gridy = Columna;
            gbc.gridx = Fila;
            if (i%5==3){
                JLabel relleno = new JLabel("                     ");
                add(relleno,gbc);
                Fila=Fila+1;
            } else {
                JButton botonAcomprobar = new JButton("Asiento " + NumeroAsiento);
                add(botonAcomprobar,gbc);
                Fila=Fila+1;
                NumeroAsiento=NumeroAsiento+1;
            }
            if ((i)%5==0){Columna=Columna+1;Fila=0;}
        }

    }

}
