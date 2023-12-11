package Pruebas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import java.awt.*;

public class MainFrame extends JFrame {

    private List<List<Object>> listaPrincipal;

    public MainFrame() {
        listaPrincipal = new ArrayList<>();

        // Agregar sub-listas con identificadores
        agregarSubLista("identificador1", new Objeto("A"));
        agregarSubLista("identificador2", new Objeto("B"));
        agregarSubLista("identificador3", new Objeto("C"));

        // Configurar el JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Acceder y Modificar Sub-Listas");
        setSize(400, 300);

        // Crear un JPanel
        JPanel panel = new JPanel(new GridLayout(3, 1));

        // Crear botones para acceder a cada sublista
        for (List<Object> subLista : listaPrincipal) {
            String identificador = (String) subLista.get(0);
            JButton button = new JButton(identificador);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mostrarSubLista(identificador);
                }
            });
            panel.add(button);
        }

        // Agregar el JPanel al JFrame
        add(panel);

        // Mostrar el JFrame
        setVisible(true);
    }

    private void agregarSubLista(String identificador, Object objeto) {
        List<Object> subLista = new ArrayList<>();
        subLista.add(identificador);
        subLista.add(objeto);
        listaPrincipal.add(subLista);
    }

    private void mostrarSubLista(String identificador) {
        List<Object> subListaEncontrada = buscarSubListaPorIdentificador(identificador);

        if (subListaEncontrada != null) {
            // Mostrar los elementos de la sub-lista en un diálogo o de alguna otra manera
            JOptionPane.showMessageDialog(this, "Sub-Lista para " + identificador + ": " + subListaEncontrada);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró ninguna sub-lista para " + identificador);
        }
    }

    private List<Object> buscarSubListaPorIdentificador(String identificadorBuscado) {
        for (List<Object> subLista : listaPrincipal) {
            String identificador = (String) subLista.get(0);
            if (identificador.equals(identificadorBuscado)) {
                return subLista;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }

    // Clase de ejemplo para los objetos en las sub-listas
    static class Objeto {
        String nombre;

        Objeto(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "Objeto{" +
                    "nombre='" + nombre + '\'' +
                    '}';
        }
    }
}

