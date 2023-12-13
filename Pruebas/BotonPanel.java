package Pruebas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonPanel extends JPanel {

    private BotonCallback botonCallback;

    public BotonPanel(BotonCallback botonCallback) {
        this.botonCallback = botonCallback;

        setLayout(new FlowLayout());

        // Crear botón para enviar el identificador
        JButton enviarIdentificadorButton = new JButton("Enviar Identificador");
        JTextField identificadorTextField = new JTextField(10);

        // Agregar ActionListener al botón
        enviarIdentificadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonCallback.enviarIdentificador(identificadorTextField.getText());
            }
        });

        // Agregar componentes al panel
        add(identificadorTextField);
        add(enviarIdentificadorButton);
    }

    public interface BotonCallback {
        void enviarIdentificador(String identificador);
    }
}
