package smartlibrary.reservas;

import java.time.LocalDate;
import smartlibrary.catalogo.Libro;
import smartlibrary.usuarios.Estudiante;

public class Reserva {
    private final String idReserva;
    private final Estudiante estudiante;
    private final Libro libro;
    private final LocalDate fechaReserva;
    private String estado;

    public Reserva(String idReserva, Estudiante estudiante, Libro libro, LocalDate fechaReserva, String estado) {
        this.idReserva = idReserva;
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
    }

    public String getIdReserva() { return idReserva; }
    public Estudiante getEstudiante() { return estudiante; }
    public Libro getLibro() { return libro; }
    public LocalDate getFechaReserva() { return fechaReserva; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
