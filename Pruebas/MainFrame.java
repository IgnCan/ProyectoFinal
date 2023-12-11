package Pruebas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {

    private ArrayList<ArrayList<Integer>> listaPrincipal;

    public MainFrame() {
        listaPrincipal = new ArrayList<>();

        // Agregar sub-listas con identificadores
        agregarSubLista("identificador1", 1);
        agregarSubLista("identificador2", 2);
        agregarSubLista("identificador3", 3);

        // Configurar el JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Acceder y Modificar Sub-Listas");
        setSize(400, 300);

        // Crear un JPanel utilizando la clase SubListPanel
        SubListPanel subListPanel = new SubListPanel(listaPrincipal, this::mostrarSubLista, this::agregarNuevaSubLista);
        add(subListPanel);

        // Mostrar el JFrame
        setVisible(true);
    }

    private void agregarSubLista(String identificador, int valor) {
        ArrayList<Integer> subLista = new ArrayList<>();
        subLista.add(valor);
        listaPrincipal.add(subLista);
    }

    private void mostrarSubLista(String identificador) {
        ArrayList<Integer> subListaEncontrada = buscarSubListaPorIdentificador(identificador);

        if (subListaEncontrada != null) {
            // Mostrar los elementos de la sub-lista en un diálogo o de alguna otra manera
            JOptionPane.showMessageDialog(this, "Sub-Lista para " + identificador + ": " + subListaEncontrada);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró ninguna sub-lista para " + identificador);
        }
    }

    private void agregarNuevaSubLista(String nuevoIdentificador) {
        // Si el identificador es "hola", llamar a la función mostrarSubLista
        if ("hola".equals(nuevoIdentificador)) {
            mostrarSubLista(nuevoIdentificador);
        } else {
            // Verificar si ya existe una sub-lista con el identificador
            if (existeIdentificador(nuevoIdentificador)) {
                // Si existe, llamar a la función mostrarSubLista
                mostrarSubLista(nuevoIdentificador);
            } else {
                // Si no existe, crear una nueva sub-lista
                ArrayList<Integer> nuevaSubLista = new ArrayList<>();
                nuevaSubLista.add(0);  // Valor inicial para la nueva sub-lista (puedes ajustarlo según tus necesidades)
                listaPrincipal.add(nuevaSubLista);

                JOptionPane.showMessageDialog(this, "Nueva sub-lista creada con identificador " + nuevoIdentificador);
            }
        }
    }

    private ArrayList<Integer> buscarSubListaPorIdentificador(String identificadorBuscado) {
        for (ArrayList<Integer> subLista : listaPrincipal) {
            String identificador = Integer.toString(subLista.get(0));
            if (identificador.equals(identificadorBuscado)) {
                return subLista;
            }
        }
        return null;
    }

    private boolean existeIdentificador(String identificador) {
        for (ArrayList<Integer> subLista : listaPrincipal) {
            String subListaIdentificador = Integer.toString(subLista.get(0));
            if (subListaIdentificador.equals(identificador)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
