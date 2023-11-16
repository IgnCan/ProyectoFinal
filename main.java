public class main {
    public static void main(String[] args) {
        Ventana v1 = new Ventana();
        v1.setVisible(true);
        // Crear la instancia del frame en el hilo de despacho de eventos
        javax.swing.SwingUtilities.invokeLater(() -> new Ventana());
    }
}
