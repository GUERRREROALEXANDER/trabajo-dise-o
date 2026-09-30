package smartlibrary.prestamos;

import java.time.LocalDate;

public class Renovacion {
    private final LocalDate fechaAnteriorDevolucion;
    private final LocalDate nuevaFechaDevolucion;
    private final LocalDate fechaRenovacion;

    // Se crea únicamente desde Prestamo. Su ciclo de vida pertenece al préstamo.
    Renovacion(LocalDate fechaAnteriorDevolucion, LocalDate nuevaFechaDevolucion, LocalDate fechaRenovacion) {
        this.fechaAnteriorDevolucion = fechaAnteriorDevolucion;
        this.nuevaFechaDevolucion = nuevaFechaDevolucion;
        this.fechaRenovacion = fechaRenovacion;
    }

    public LocalDate getFechaAnteriorDevolucion() { return fechaAnteriorDevolucion; }
    public LocalDate getNuevaFechaDevolucion() { return nuevaFechaDevolucion; }
    public LocalDate getFechaRenovacion() { return fechaRenovacion; }
}
