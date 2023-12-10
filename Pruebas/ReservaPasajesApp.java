package Pruebas;
import Enums.Horario;
import Enums.Recorrido;
import Enums.TipoAsiento;
import Enums.TipoBus;
import java.util.*;

public class ReservaPasajesApp {
    // Clase para representar una asignación de horario, tipo de asiento y tipo de bus a un recorrido
    public static class AsignacionHorarios {
        private Map<Recorrido, List<AsignacionFinal>> asignaciones = new HashMap<>();

        public void AsingnacionFinal(Recorrido recorrido, Horario horario, TipoAsiento tipoAsiento, TipoBus tipoBus) {
            List<AsignacionFinal> asignacionFinal = asignaciones.getOrDefault(recorrido, new ArrayList<>());
            asignacionFinal.add(new AsignacionFinal(recorrido, horario, tipoAsiento, tipoBus));
            asignaciones.put(recorrido, asignacionFinal);
        }

        public List<AsignacionFinal> obtenerAsignacionFinal(Recorrido recorrido) {
            return asignaciones.getOrDefault(recorrido, Collections.emptyList());
        }
    }

    // Clase para representar un trío de horario, tipo de asiento y tipo de bus
    public static class AsignacionFinal {
        private Horario horario;
        private TipoAsiento tipoAsiento;
        private TipoBus tipoBus;
        private int presioCasiTotal;

        public AsignacionFinal(Recorrido recorrido, Horario horario, TipoAsiento tipoAsiento, TipoBus tipoBus) {
            this.horario = horario;
            this.tipoAsiento = tipoAsiento;
            this.tipoBus = tipoBus;
            this.presioCasiTotal= tipoAsiento.getPresio()+tipoBus.getPresio()+recorrido.getPresio();
        }
        public Horario getHorario() {
            return horario;
        }
        public TipoAsiento getTipoAsiento() {
            return tipoAsiento;
        }
        public TipoBus getTipoBus() {
            return tipoBus;
        }
        @Override
        public String toString() {
            return "Horario: " + horario.getHora() + ", Tipo de Asiento: " + tipoAsiento.getNombre() + ", Tipo de Bus: " + tipoBus.getNombre() + "; Precio del pasaje: "+ presioCasiTotal;
        }
    }

    public static void main(String[] args) {
        // Crear una instancia de AsignacionHorarios
        AsignacionHorarios asignacionHorarios = new AsignacionHorarios();

        // Asignar horarios, tipos de asientos y tipos de buses al Recorrido_1
        asignacionHorarios.AsingnacionFinal(Recorrido.RECORRIDO5, Horario.HORARIO_1, TipoAsiento.SEMI_CAMA, TipoBus.UNO_PISO);
        asignacionHorarios.AsingnacionFinal(Recorrido.RECORRIDO5, Horario.HORARIO_2, TipoAsiento.NORMAL, TipoBus.DOS_PISOS);

        // Obtener horarios, tipos de asientos y tipos de buses asignados al Recorrido_1
        List<AsignacionFinal> asignacionesRecorrido1 = asignacionHorarios.obtenerAsignacionFinal(Recorrido.RECORRIDO5);

        // Imprimir las asignaciones para el Recorrido_1
        System.out.println("Asignaciones para " + Recorrido.RECORRIDO5.getRecorrido() + ":");
        for (AsignacionFinal asignacion : asignacionesRecorrido1) {
            System.out.println("- " + asignacion);
        }
    }
}
