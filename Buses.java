public enum Buses{
    NORMAL(1,300),
    SALONCAMA(2,2000),
    SEMICAMA(3,600);
    private final int presio;
    private final int id;
    /**
     * @param i es la id del bus.
     * @param precio es el precio del ticket
     */
    Buses(int i, int precio) {
        this.id=i;
        this.presio=precio;
    }
    /**
     * getter de precio.
     */
    public int getPresio() {
        return presio;
    }
    public int getId() {
        return id;
    }

    public static int getPresioPorID(int id) {
        for (Buses bus : values()) {
            if (bus.getId() == id) {
                return bus.getPresio();
            }
        }
        return 0;
    }
}