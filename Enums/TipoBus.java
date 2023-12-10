package Enums;

public enum TipoBus {
    UNO_PISO("Un piso", 100),
    DOS_PISOS("Dos pisos",0);

    private String nombre;
    private int presio;

    TipoBus(String nombre, int presio){
        this.nombre=nombre;
        this.presio=presio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPresio() {
        return presio;
    }

    public static int getPresioPorNombre(String id) {
        for (TipoBus bus : values()) {
            if (bus.getNombre() == id) {
                return bus.getPresio();
            }
        }
        return 0;
    }
}