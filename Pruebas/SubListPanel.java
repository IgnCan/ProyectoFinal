package Pruebas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SubListPanel extends JPanel {

    private ArrayList<ArrayList<Integer>> listaPrincipal;
    private SubListCallback crearNuevaSubListaCallback;

    public SubListPanel(ArrayList<ArrayList<Integer>> listaPrincipal, SubListCallback crearNuevaSubListaCallback) {
        this.listaPrincipal = listaPrincipal;
        this.crearNuevaSubListaCallback = crearNuevaSubListaCallback;

        setLayout(new FlowLayout());

        // Crear botón para crear una nueva sub-lista
        JButton nuevoIdentificadorButton = new JButton("Crear Nueva Sub-Lista");
        nuevoIdentificadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Al presionar el botón, solicitar un nuevo identificador
                String nuevoIdentificador = JOptionPane.showInputDialog("Ingrese el nuevo identificador:");
                if (nuevoIdentificador != null && !nuevoIdentificador.trim().isEmpty()) {
                    // Llamar a la función para crear una nueva sub-lista
                    crearNuevaSubListaCallback.crearNuevaSubLista(nuevoIdentificador);
                }
            }
        });
        add(nuevoIdentificadorButton);
    }

    // Interfaz funcional para manejar la acción de crear una nueva sub-lista
    public interface SubListCallback {
        void crearNuevaSubLista(String nuevoIdentificador);
    }
}




