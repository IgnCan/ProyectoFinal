import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelAsientos extends JPanel {
    public PanelAsientos(){

    }

    public class asiento extends JButton{
        int contador=0;
        int reservado=0;
        public asiento(){
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(contador==0){
                        contador=1;
                    } else {
                        contador=0;
                    }
                }
            });
        }
    }
}
