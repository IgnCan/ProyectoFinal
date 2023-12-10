package AsignacionDeHorarios;

import AsignacionDeHorarios.AsignacionFinal;
import Enums.Horario;
import Enums.Recorrido;
import Enums.TipoAsiento;
import Enums.TipoBus;
import java.util.*;

public class AsignacionHorarios {
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