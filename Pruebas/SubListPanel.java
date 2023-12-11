package Pruebas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SubListPanel extends JPanel {

    private ArrayList<ArrayList<Integer>> listaPrincipal;
    private SubListCallback mostrarSubListaCallback;
    private SubListCallback agregarNuevaSubListaCallback;

    public SubListPanel(
            ArrayList<ArrayList<Integer>> listaPrincipal,
            SubListCallback mostrarSubListaCallback,
            SubListCallback agregarNuevaSubListaCallback) {
        this.listaPrincipal = listaPrincipal;
        this.mostrarSubListaCallback = mostrarSubListaCallback;
        this.agregarNuevaSubListaCallback = agregarNuevaSubListaCallback;

        setLayout(new GridLayout(listaPrincipal.size() + 1, 1));  // +1 para el botón adicional

        // Crear botones para acceder a cada sublista
        for (ArrayList<Integer> subLista : listaPrincipal) {
            String identificador = Integer.toString(subLista.get(0));
            JButton button = new JButton(identificador);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mostrarSubListaCallback.mostrarSubLista(identificador);
                }
            });
            add(button);
        }

        // Crear botón adicional para agregar nueva sub-lista
        JButton nuevoIdentificadorButton = new JButton("Nueva Sub-Lista");
        nuevoIdentificadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Al presionar el botón, verificar si la sublista ya existe
                if (!existeIdentificador("hola")) {
                    // Si no existe, llamar a la función agregarNuevaSubListaCallback
                    agregarNuevaSubListaCallback.mostrarSubLista("hola");
                } else {
                    // Si ya existe, llamar directamente a mostrarSubLista
                    mostrarSubListaCallback.mostrarSubLista("hola");
                }
            }
        });
        add(nuevoIdentificadorButton);
    }

    // Interfaz funcional para manejar la acción de mostrar una sub-lista o agregar una nueva
    public interface SubListCallback {
        void mostrarSubLista(String identificador);
    }

    // Método para verificar si un identificador ya existe en la lista principal
    private boolean existeIdentificador(String identificador) {
        for (ArrayList<Integer> subLista : listaPrincipal) {
            String subListaIdentificador = Integer.toString(subLista.get(0));
            if (subListaIdentificador.equals(identificador)) {
                return true;
            }
        }
        return false;
    }
}



