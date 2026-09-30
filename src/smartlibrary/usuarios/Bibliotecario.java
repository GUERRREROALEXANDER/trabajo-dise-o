package smartlibrary.usuarios;

public class Bibliotecario extends Usuario {
    private final String codigoEmpleado;
    private final String cargo;

    public Bibliotecario(String id, String nombre, String correo, String codigoEmpleado, String cargo) {
        super(id, nombre, correo);
        this.codigoEmpleado = codigoEmpleado;
        this.cargo = cargo;
    }

    public String getCodigoEmpleado() { return codigoEmpleado; }
    public String getCargo() { return cargo; }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Código: " + codigoEmpleado + " | Cargo: " + cargo);
    }
}
