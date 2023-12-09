package Enums;

/**
 * Aca se definira el precio solo por recorrido, es decir, el precio inicial del pasaje al que se le
 * sumará todo lo demas (si es es salon cama, semi cama, bus de uno o dos pisos)
 */
public enum Recorrido {
    RECORRIDO1("Concepcion-Talca", 300),
    RECORRIDO2("Concepcion-Lota", 2000),
    RECORRIDO3("Concepcion-Santiasco", 2000),
    RECORRIDO4("Concepcion-Linares", 2000),
    RECORRIDO5("Concepcion-AntiguaRoma", 99999);
    private final int presio;
    private final String recorrido;
    /**
     * @param recorrido es la id del recorrido.
     * @param precio es el precio por recorrido
     */
    Recorrido(String recorrido, int precio) {
        this.recorrido =recorrido;
        this.presio=precio;
    }
    /**
     * getter de precio.
     */
    public int getPresio() {
        return presio;
    }
    public String getRecorrido() {
        return recorrido;
    }

    public static int getPresioPorID(String id) {
        for (Recorrido ruta : values()) {
            if (ruta.getRecorrido() == id) {
                return ruta.getPresio();
            }
        }
        return 0;
    }
}