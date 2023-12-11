package Pruebas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//public class SubListPanel extends JPanel {
//
//    private SubListCallback subListCallback;
//    private ArrayList<ArrayList<Object>> listaPrincipal;
//    private String nuevoIdentificador;
//
//    public SubListPanel(SubListCallback subListCallback, ArrayList<ArrayList<Object>> listaPrincipal, String nuevoIdentificador) {
//        this.subListCallback = subListCallback;
//        this.listaPrincipal = listaPrincipal;
//        this.nuevoIdentificador = nuevoIdentificador;
//
//        setLayout(new FlowLayout());
//
//        // Crear botón para agregar nueva sub-lista
//        JButton agregarSubListaButton = new JButton("Agregar Sub-Lista");
//        agregarSubListaButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                subListCallback.mostrarSubLista(nuevoIdentificador);
//            }
//        });
//        add(agregarSubListaButton);
//    }
//
//    public interface SubListCallback {
//        void mostrarSubLista(String nuevoIdentificador);
//    }
//}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SubListPanel extends JPanel {

    private SubListCallback subListCallback;
    private ArrayList<ArrayList<Object>> listaPrincipal;
    private String nuevoIdentificador;

    // Componentes para mostrar botones
    private JButton boton1;
    private JButton boton2;

    public SubListPanel(SubListCallback subListCallback, ArrayList<ArrayList<Object>> listaPrincipal, String nuevoIdentificador) {
        this.subListCallback = subListCallback;
        this.listaPrincipal = listaPrincipal;
        this.nuevoIdentificador = nuevoIdentificador;

        setLayout(new FlowLayout());

        // Crear campo de texto para el identificador
        JTextField identificadorTextField = new JTextField(10);
        add(identificadorTextField);

        // Crear botón para agregar nueva sub-lista
        JButton agregarSubListaButton = new JButton("Agregar Sub-Lista");
        agregarSubListaButton.addActionListener(e -> subListCallback.mostrarSubLista(nuevoIdentificador));
        add(agregarSubListaButton);

        // Inicializar los botones (se muestran después)
        boton1 = new JButton("Botón 1");
        boton2 = new JButton("Botón 2");
    }

    public interface SubListCallback {
        void mostrarSubLista(String nuevoIdentificador);
    }

    // Método para mostrar los botones de la sublista
    public void mostrarBotones(ArrayList<Object> subLista) {
        removeAll(); // Limpiar el panel antes de agregar componentes
        // Obtener identificador y botones de la sublista
        String identificador = (String) subLista.get(0);
        boton1 = (JButton) subLista.get(1);
        boton2 = (JButton) subLista.get(2);

        // Agregar el identificador y los botones al panel
        add(new JLabel("Identificador: " + identificador));
        add(boton1);
        add(boton2);

        // Volver a validar el layout
        revalidate();
        repaint();
    }
}




