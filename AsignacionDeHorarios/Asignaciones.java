package AsignacionDeHorarios;

import Enums.Horario;
import Enums.Recorrido;
import Enums.TipoAsiento;
import Enums.TipoBus;

import java.util.Collections;
import java.util.List;

/**
 * Clase Asignaciones
 */
public class Asignaciones {
    /**
     *
     */
    private AsignacionHorarios asing = new AsignacionHorarios();

    /**
     *
     */
    public Asignaciones(){
        // Asignacion a RECORRIDO1
        asing.AsingnacionFinal(Recorrido.RECORRIDO1, Horario.HORARIO_2, TipoAsiento.EJECUTIVO, TipoBus.DOS_PISOS);
        asing.AsingnacionFinal(Recorrido.RECORRIDO1, Horario.HORARIO_2, TipoAsiento.SEMI_CAMA, TipoBus.UNO_PISO);
        // Asignacion a RECORRIDO2
        asing.AsingnacionFinal(Recorrido.RECORRIDO2,Horario.HORARIO_1,TipoAsiento.NORMAL,TipoBus.DOS_PISOS);
        // Asignacion a RECORRIDO3
        asing.AsingnacionFinal(Recorrido.RECORRIDO3, Horario.HORARIO_1, TipoAsiento.SEMI_CAMA, TipoBus.UNO_PISO);
        asing.AsingnacionFinal(Recorrido.RECORRIDO3, Horario.HORARIO_1, TipoAsiento.EJECUTIVO, TipoBus.UNO_PISO);
        // Asignacion a RECORRIDO4
        asing.AsingnacionFinal(Recorrido.RECORRIDO4, Horario.HORARIO_1, TipoAsiento.NORMAL, TipoBus.UNO_PISO);
        asing.AsingnacionFinal(Recorrido.RECORRIDO4, Horario.HORARIO_2, TipoAsiento.SEMI_CAMA, TipoBus.UNO_PISO);
        // Asignacion a RECORRIDO5
        asing.AsingnacionFinal(Recorrido.RECORRIDO5, Horario.HORARIO_1, TipoAsiento.SEMI_CAMA, TipoBus.UNO_PISO);
        asing.AsingnacionFinal(Recorrido.RECORRIDO5, Horario.HORARIO_2, TipoAsiento.NORMAL, TipoBus.DOS_PISOS);
        asing.AsingnacionFinal(Recorrido.RECORRIDO5, Horario.HORARIO_2, TipoAsiento.SEMI_CAMA, TipoBus.UNO_PISO);
    }

    /**
     *
     * @param rec
     * @return
     */
    public List<AsignacionFinal> obtenerAAsignacionFinal(Recorrido rec) {
        return asing.obtenerAsignacionFinal(rec);
    }
}
