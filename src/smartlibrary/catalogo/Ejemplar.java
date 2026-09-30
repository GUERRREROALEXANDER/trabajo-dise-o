package smartlibrary.catalogo;

public class Ejemplar {
    private final String codigoEjemplar;
    private String estado;
    private boolean disponible;
    private Libro libro;

    public Ejemplar(String codigoEjemplar, String estado, boolean disponible) {
        this.codigoEjemplar = codigoEjemplar;
        this.estado = estado;
        this.disponible = disponible;
    }

    public String getCodigoEjemplar() { return codigoEjemplar; }
    public String getEstado() { return estado; }
    public boolean isDisponible() { return disponible; }
    public Libro getLibro() { return libro; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    // Solo Libro establece esta referencia al agregar el ejemplar.
    void asignarLibro(Libro libro) { this.libro = libro; }
}
