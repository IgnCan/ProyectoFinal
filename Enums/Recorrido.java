package Enums;

/**
 * Aca se definira el precio solo por recorrido, es decir, el precio inicial del pasaje al que se le
 * sumará todo lo demas (si es es salon cama, semi cama, bus de uno o dos pisos)
 */
public enum Recorrido {
    RECORRIDO1("Concepcion-Talca", 300),
    RECORRIDO2("Concepcion-Lota", 500),
    RECORRIDO3("Concepcion-Santiasco", 1000),
    RECORRIDO4("Concepcion-Linares", 2000),
    RECORRIDO5("Concepcion-AntiguaRoma(200ac)", 99999);

    private String recorrido;

    private int presio;

    Recorrido(String descripcion, int presio) {
        this.recorrido = descripcion;
        this.presio=presio;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public int getPresio(){
        return presio;
    }
}