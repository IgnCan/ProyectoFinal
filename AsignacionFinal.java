import Enums.Horario;
import Enums.Recorrido;
import Enums.TipoAsiento;
import Enums.TipoBus;

public class AsignacionFinal {
    private Horario horario;
    private TipoAsiento tipoAsiento;
    private TipoBus tipoBus;
    private int presioTotal;

    public AsignacionFinal(Recorrido recorrido, Horario horario, TipoAsiento tipoAsiento, TipoBus tipoBus) {
        this.horario = horario;
        this.tipoAsiento = tipoAsiento;
        this.tipoBus = tipoBus;
        this.presioTotal = tipoAsiento.getPresio()+tipoBus.getPresio()+recorrido.getPresio();
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
//    @Override
//    public String toString() {
//        return "Horario: " + horario.getHora() + ", Tipo de Asiento: " + tipoAsiento.getNombre() + ", Tipo de Bus: " + tipoBus.getNombre() + "; Precio del pasaje: "+ presioTotal;
//    }
}