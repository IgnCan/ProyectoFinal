import Enums.Horario;
import Enums.Recorrido;
import Enums.TipoAsiento;
import Enums.TipoBus;
import java.util.*;

public class ReservaPasajesApp {
    // Clase para representar una asignación de horario, tipo de asiento y tipo de bus a un recorrido


    // Clase para representar un trío de horario, tipo de asiento y tipo de bus

    public static void main(String[] args) {
        // Crear una instancia de AsignacionHorarios

        Asignaciones asig = new Asignaciones();


        // Obtener horarios, tipos de asientos y tipos de buses asignados al Recorrido_1
        List<AsignacionFinal> asignacionesRecorrido1 = asig.obtenerAAsignacionFinal(Recorrido.RECORRIDO1);
        List<AsignacionFinal> asignacionesRecorrido2 = asig.obtenerAAsignacionFinal(Recorrido.RECORRIDO2);
        List<AsignacionFinal> asignacionesRecorrido3 = asig.obtenerAAsignacionFinal(Recorrido.RECORRIDO3);
        List<AsignacionFinal> asignacionesRecorrido4 = asig.obtenerAAsignacionFinal(Recorrido.RECORRIDO4);
        List<AsignacionFinal> asignacionesRecorrido5 = asig.obtenerAAsignacionFinal(Recorrido.RECORRIDO5);


        //Imprimir asignaciones para RECORRIDO1
        System.out.println("Asignaciones para " + Recorrido.RECORRIDO1.getRecorrido() + ":");
        for (AsignacionFinal asignacion : asignacionesRecorrido1) {
            System.out.println("- " + asignacion);
        }
        //Imprimir asignaciones para RECORRIDO2
        System.out.println("Asignaciones para " + Recorrido.RECORRIDO2.getRecorrido() + ":");
        for (AsignacionFinal asignacion : asignacionesRecorrido2) {
            System.out.println("- " + asignacion);
        }
        //Imprimir asignaciones para RECORRIDO3
        System.out.println("Asignaciones para " + Recorrido.RECORRIDO3.getRecorrido() + ":");
        for (AsignacionFinal asignacion : asignacionesRecorrido3) {
            System.out.println("- " + asignacion);
        }
        //Imprimir asignaciones para RECORRIDO4
        System.out.println("Asignaciones para " + Recorrido.RECORRIDO4.getRecorrido() + ":");
        for (AsignacionFinal asignacion : asignacionesRecorrido4) {
            System.out.println("- " + asignacion);
        }
        //Imprimir Asignaciones para RECORRIDO5
        System.out.println("Asignaciones para " + Recorrido.RECORRIDO5.getRecorrido() + ":");
        for (AsignacionFinal asignacion : asignacionesRecorrido5) {
            System.out.println("- " + asignacion);
        }

    }
}
