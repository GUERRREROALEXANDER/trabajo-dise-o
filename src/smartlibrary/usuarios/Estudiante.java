package smartlibrary.usuarios;

public class Estudiante extends Usuario implements Notificable {
    private final String codigoEstudiante;
    private final String programa;

    public Estudiante(String id, String nombre, String correo, String codigoEstudiante, String programa) {
        super(id, nombre, correo);
        this.codigoEstudiante = codigoEstudiante;
        this.programa = programa;
    }

    public String getCodigoEstudiante() { return codigoEstudiante; }
    public String getPrograma() { return programa; }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Código: " + codigoEstudiante + " | Programa: " + programa);
    }

    @Override
    public void recibirNotificacion(String mensaje) {
        System.out.println("NOTIFICACIÓN PARA " + getNombre().toUpperCase());
        System.out.println(mensaje);
    }
}
