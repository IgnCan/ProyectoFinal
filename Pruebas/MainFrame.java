package Pruebas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {

    private ArrayList<ArrayList<Object>> listaPrincipal;

    public MainFrame() {
        listaPrincipal = new ArrayList<>();

        // Agregar sublistas predefinidas con JButton
        JButton boton1 = new JButton("Botón 1");
        JButton boton2 = new JButton("Botón 2");

        agregarSubListaPredefinida("identificador1", boton1, boton2);
        agregarSubListaPredefinida("identificador2", boton1, boton2);
        agregarSubListaPredefinida("identificador3", boton1, boton2);

        // Configurar el JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Agregar Sub-Lista");
        setSize(300, 200);

        // Crear un JPanel con un botón
        JPanel panel = new JPanel();
        JButton agregarSubListaButton = new JButton("Agregar Sub-Lista");
        agregarSubListaButton.addActionListener(e -> agregarNuevaSubLista());
        panel.add(agregarSubListaButton);

        // Agregar el JPanel al JFrame
        add(panel);

        // Mostrar el JFrame
        setVisible(true);
    }

    private void agregarNuevaSubLista() {
        String nuevoIdentificador = "hola"; // Puedes cambiar esto por una entrada del usuario
        if (!existeIdentificador(nuevoIdentificador)) {
            // Si el identificador no existe, crear una nueva sub-lista
            ArrayList<Object> nuevaSubLista = new ArrayList<>();
            nuevaSubLista.add(nuevoIdentificador);

            // Agregar dos JButton como elementos a la sublista
            nuevaSubLista.add(new JButton("Botón 1"));
            nuevaSubLista.add(new JButton("Botón 2"));

            // Puedes agregar más elementos a la sublista si es necesario
            listaPrincipal.add(nuevaSubLista);

            JOptionPane.showMessageDialog(this, "Nueva sub-lista creada con identificador " + nuevoIdentificador);
        } else {
            JOptionPane.showMessageDialog(this, "Ya existe una sub-lista con el identificador " + nuevoIdentificador);
        }
    }

    private void agregarSubListaPredefinida(String identificador, JButton boton1, JButton boton2) {
        // Crear una sublista predefinida
        ArrayList<Object> subLista = new ArrayList<>();
        subLista.add(identificador);

        // Agregar los botones a la sublista
        subLista.add(boton1);
        subLista.add(boton2);

        // Puedes agregar más elementos a la sublista si es necesario

        // Agregar la sublista predefinida a la lista principal
        listaPrincipal.add(subLista);
    }

    private boolean existeIdentificador(String identificador) {
        for (ArrayList<Object> subLista : listaPrincipal) {
            String subListaIdentificador = (String) subLista.get(0); // Suponiendo que el identificador está en la posición 0
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
