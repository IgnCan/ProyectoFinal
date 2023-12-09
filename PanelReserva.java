import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanelReserva extends JPanel {
    private ArrayList<Object> asientos = new ArrayList<>();
    private Buses bus;
    private int PrecioTotal=0;
    private String IdViajeCompleto;
    // agregado temporalmente en lo que logro el envio de listas.
    private Ventana vent;

    private int precioBoleto;
    public PanelReserva(int id, String Recorrido, String Horario, Ventana vent) {

        precioBoleto=bus.getPresioPorID(id);
        IdViajeCompleto =Recorrido+", "+Horario;
        this.vent=vent;
        System.out.println("El precio por ticket es: " + precioBoleto);
        System.out.println("El recorrido y horario es: "+ Recorrido+" "+Horario);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        //this.asientos= new BuscarRecorrido(vent.listaPrincipal,IdViajeCompleto);

        ArrayList<Object> elementoObjetivo = BuscarRecorrido(vent.listaPrincipal, IdViajeCompleto);
        this.asientos=elementoObjetivo;

        //Esto crea una lista con los botones, la idea es dejarla a parte para ir modificando los botones//
        //en masa de ser necesario, NO BORRAR HASTA PRUEBA CON CARDLAYOUT
//        int NumeroAsiento=1;
//        for (int i=1; i<=41;i=i+1){
//            if (i==1){
//                asientos.add(IdViajeCompleto);
//            } else {
//                asientos.add(new Asientos("Asiento " + NumeroAsiento));
//                NumeroAsiento = NumeroAsiento + 1;
//            }
//        }

        //Todo esto crea el panel de botones con una bonita matriz
        int Columna=0;
        int Fila=0;
        int y=1;

        for (int i = 1; i <= 50; i++) {
            gbc.gridy = Columna;
            gbc.gridx = Fila;
            if (i%5==3){
                JLabel relleno = new JLabel("                     ");
                add(relleno,gbc);
                Fila=Fila+1;
            } else {

                add((Component) elementoObjetivo.get(y),gbc);
                Fila=Fila+1;
                //NumeroAsiento=NumeroAsiento+1;
                y=y+1;

            }
            if (i%5==0){Columna=Columna+1;Fila=0;}
        }

        gbc.gridy = 10;
        gbc.gridx = 10;
        add(new Reservador());

    }
    public class Reservador extends JButton{
        public Reservador(){
            setText("reservar");
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    for (Object elemento : asientos) {
                        if(elemento instanceof Asientos){
                            Asientos bot = (Asientos) elemento;
                            if (bot.getBackground() == Color.GREEN) {
                                bot.Desactivacion();
                                //NO BORRAR HASTA PRUEBA EN CARDLAYOUT
                                //bot.setEnabled(false);
                                //bot.setBackground(Color.RED);
                                PrecioTotal=PrecioTotal+precioBoleto;
                                System.out.println(PrecioTotal);
                            }
                        }else if(elemento instanceof String){
                                System.out.println(elemento);
                        }
                    }
                    vent.recibirLista(asientos);
                    ;
                    System.out.println(vent.getListaPrincipal().get(0).get(0) + "dfhsjadgh");
                    System.out.println("El precio total de la compra es: " + PrecioTotal);
                    PrecioTotal=0;
                }
            });

        }
    }

    public ArrayList<Object> BuscarRecorrido (ArrayList<ArrayList<Object>> listaPrincipal, String letra) {

        for (ArrayList<Object> arrayObjetivo : listaPrincipal) {
            if (arrayObjetivo.contains(letra)) {
                return arrayObjetivo; // Encontro el recorrido y devolvera su arraylist
            }
        }
        System.out.println("No se encontro recorrido");
        int NumeroAsiento=1;
        for (int i=1; i<=41;i=i+1){
            if (i==1){
                asientos.add(letra);
            } else {
                asientos.add(new Asientos("Asiento " + NumeroAsiento));
                NumeroAsiento = NumeroAsiento + 1;
            }
        } return asientos;
    }



}


