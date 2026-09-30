package smartlibrary.prestamos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import smartlibrary.catalogo.Ejemplar;
import smartlibrary.usuarios.Estudiante;

public class Prestamo {
    private final String idPrestamo;
    private final Estudiante estudiante;
    private final Ejemplar ejemplar;
    private final LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private String estado;
    private final List<Renovacion> renovaciones = new ArrayList<>();

    public Prestamo(String idPrestamo, Estudiante estudiante, Ejemplar ejemplar,
                    LocalDate fechaPrestamo, LocalDate fechaDevolucion, String estado) {
        this.idPrestamo = idPrestamo;
        this.estudiante = estudiante;
        this.ejemplar = ejemplar;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
    }

    public String getIdPrestamo() { return idPrestamo; }
    public Estudiante getEstudiante() { return estudiante; }
    public Ejemplar getEjemplar() { return ejemplar; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public LocalDate getFechaDevolucion() { return fechaDevolucion; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public List<Renovacion> getRenovaciones() { return Collections.unmodifiableList(renovaciones); }

    public void renovar(LocalDate nuevaFecha) {
        if (nuevaFecha == null || !nuevaFecha.isAfter(fechaDevolucion)) {
            throw new IllegalArgumentException("La nueva fecha debe ser posterior a la fecha de devolución.");
        }
        renovaciones.add(new Renovacion(fechaDevolucion, nuevaFecha, LocalDate.now()));
        fechaDevolucion = nuevaFecha;
    }
}
