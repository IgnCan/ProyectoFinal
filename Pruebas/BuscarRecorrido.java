//import java.util.ArrayList;
//
//public class BuscarRecorrido {
//
//    ArrayList<Object> asientos = new ArrayList<>();
//
//    public BuscarRecorrido(ArrayList<ArrayList<Object>> listaPrincipal, String letra) {
//
//        for (ArrayList<Object> arrayObjetivo : listaPrincipal) {
//            if (arrayObjetivo.contains(letra)) {
//                return arrayObjetivo; // Encontro el recorrido y devolvera su arraylist
//            }
//        }
//
//        System.out.println("No se encontro recorrido");
//
//        int NumeroAsiento=1;
//
//        ArrayList<Object> asientos = new ArrayList<>();
//
//        for (int i=1; i<=41;i=i+1){
//            if (i==1){
//                asientos.add(letra);
//            } else {
//                asientos.add(new Asientos("Asiento " + NumeroAsiento));
//                NumeroAsiento = NumeroAsiento + 1;
//            }
//        } return asientos;
//    }
//}
