package Enums;

/**
 *Enum con los horarios disponibles, que se le asignara a cada recorrido
 */
public enum Horario {
    HORARIO_1("8:00 AM"),
    HORARIO_2("10:00 AM");
    /**
     * @param hora hg
     */
    private String hora;
    /**
     *  contructor de hora
     */
    Horario(String hora) {
        this.hora = hora;
    }

    /**
     *
     * @return la hora en la que se raliza el recorrido
     */
    public String getHora() {
        return hora;
    }
}