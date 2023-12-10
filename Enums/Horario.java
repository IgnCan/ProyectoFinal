package Enums;

public enum Horario {
    HORARIO_1("8:00 AM"),
    HORARIO_2("10:00 AM");
    // ... otros horarios ...

    private String hora;

    Horario(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }
}