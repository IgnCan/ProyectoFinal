//package Paneles;
//
//import javax.swing.*;
//import java.awt.*;
//import java.util.ArrayList;
//
//public class Ventana3 extends JFrame {
//
//    ArrayList<ArrayList<Object>> listaPrincipal = new ArrayList<>();
//    PanelReserva bob = new PanelReserva(this);
//    //PanelAsientos asientos = new PanelAsientos();
//
//    public Ventana3()  {
//        this.setSize(1000, 800);//Ancho y largo respectivamente
//        setBackground(Color.CYAN);//Color de fondo
//        setTitle("Coso de buses"); //Titulo
//        setLocationRelativeTo(null); //Centra el programa al abrirlo
//        setDefaultCloseOperation(EXIT_ON_CLOSE); //Cierra el programa al cerrar la ventana
//        setLayout(new BorderLayout());//Permite organizar los JPanel
//        //add(rec,BorderLayout.WEST);
//        //add(hor,BorderLayout.CENTER);
////        add(asientos);
//
//        add(bob);
//
//    }
//
//    /**
//     * Se encarga de recibir la lista con los "pasajes" (botones desactivados)
//     * ya comprados, y asi guardarlos al realizar compras multiples
//     * @param lista Lista con botones "Asientos" y un string identificatorio al principio del array
//     */
//    public void recibirLista(ArrayList lista){
//        listaPrincipal.add(lista);
//    }
//
//    public ArrayList<ArrayList<Object>> getListaPrincipal() {
//        return listaPrincipal;
//    }
//}