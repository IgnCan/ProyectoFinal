import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Asientos extends JButton {
    public Asientos(String text) {
        super(text);
        setBackground(Color.WHITE);
        // Agregar ActionListener para cambiar el color al presionar
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //setBackground(getBackground() == Color.RED ? Color.GREEN : Color.RED);
                setBackground(getBackground() == Color.WHITE ? Color.GREEN : Color.WHITE);
            }
        });
    }

    public void activacion(){

    }
}