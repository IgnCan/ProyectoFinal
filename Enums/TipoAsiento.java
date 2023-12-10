package Enums;
public enum TipoAsiento {
    SEMI_CAMA("Semi-cama",500),
    NORMAL("Normal",200),
    EJECUTIVO("Pudiente",1000);

    private String nombre;
    private int presio;

    TipoAsiento(String nombre, int presio){
        this.nombre=nombre;
        this.presio=presio;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPresio(){
        return presio;
    }

    public static int getPresioPorNombre(String id) {
        for (TipoAsiento asiento : values()) {
            if (asiento.getNombre() == id) {
                return asiento.getPresio();
            }
        }
        return 0;
    }
}