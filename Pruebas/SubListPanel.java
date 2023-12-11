package Pruebas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SubListPanel extends JPanel {

    private MainFrame mainFrame;
    private SubListCallback subListCallback;
    private ArrayList<ArrayList<Object>> listaPrincipal;

    public SubListPanel(SubListCallback subListCallback, ArrayList<ArrayList<Object>> listaPrincipal) {
        this.subListCallback = subListCallback;
        this.listaPrincipal = listaPrincipal;

        setLayout(new FlowLayout());

        // Crear botón para agregar nueva sub-lista
        JButton agregarSubListaButton = new JButton("Agregar Sub-Lista");
        agregarSubListaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subListCallback.mostrarSubLista();
            }
        });
        add(agregarSubListaButton);
    }

    public interface SubListCallback {
        void mostrarSubLista();
    }
}
