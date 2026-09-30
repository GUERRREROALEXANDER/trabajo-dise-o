package smartlibrary.usuarios;

public abstract class Usuario {
    private final String id;
    private String nombre;
    private String correo;

    protected Usuario(String id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCorreo(String correo) { this.correo = correo; }

    public void mostrarDatos() {
        System.out.println(nombre + " (" + id + ") - " + correo);
    }
}
