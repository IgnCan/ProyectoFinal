/**
 * Aca se definira el precio solo por recorrido, es decir, el precio inicial del pasaje al que se le
 * sumará todo lo demas (si es es salon cama, semi cama, bus de uno o dos pisos)
 */
public enum Recorrido{
    Recorrido1("Concepcion-Talca",300),
    Recorrido2("Concepcion-Lota",2000),
    Recorrido3("Concepcion-Santiasco",2000),
    Recorrido4("Concepcion-Linares",2000),
    Recorrido5("Concepcion-Bulnes",2000),
    Recorrido6("Concepcion-Antartica",2000),
    Recorrido7("Concepcion-Londres",2000),
    Recorrido8("Concepcion-Moscú",2000),
    Recorrido9("Concepcion-Varsovia",4000),
    Recorrido10("Concepcion-AntiguaRoma",99999);
    private final int presio;
    private final String recorrido;
    /**
     * @param i es la id del recorrido.
     * @param precio es el precio por recorrido
     */
    Recorrido(String i, int precio) {
        this.recorrido =i;
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