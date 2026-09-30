package smartlibrary;

import java.time.LocalDate;
import smartlibrary.catalogo.Ejemplar;
import smartlibrary.catalogo.Libro;
import smartlibrary.prestamos.Prestamo;
import smartlibrary.prestamos.Renovacion;
import smartlibrary.reservas.Reserva;
import smartlibrary.usuarios.Bibliotecario;
import smartlibrary.usuarios.Estudiante;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("9780132350884", "Clean Code", "Robert C. Martin");
        Ejemplar primero = new Ejemplar("EJ-001", "Bueno", true);
        Ejemplar segundo = new Ejemplar("EJ-002", "Bueno", true);
        libro.agregarEjemplar(primero);
        libro.agregarEjemplar(segundo);

        Estudiante estudiante = new Estudiante("1001", "Alexander", "alexander@universidad.edu",
                "EST-001", "Ingeniería de Software");
        Bibliotecario bibliotecario = new Bibliotecario("2001", "María", "maria@biblioteca.edu",
                "BIB-001", "Bibliotecaria");

        Prestamo prestamo = new Prestamo("PRE-001", estudiante, primero,
                LocalDate.of(2026, 9, 30), LocalDate.of(2026, 10, 7), "Activo");
        Reserva reserva = new Reserva("RES-001", estudiante, libro, LocalDate.of(2026, 9, 30), "Activa");

        System.out.println("================================");
        System.out.println("       SMARTLIBRARY");
        System.out.println("================================");
        System.out.println("Libro: " + libro.getTitulo() + " (" + libro.getIsbn() + ")");
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Ejemplares registrados:");
        libro.mostrarEjemplares();
        System.out.println("--------------------------------");
        System.out.println("Estudiante:");
        estudiante.mostrarDatos();
        System.out.println("Bibliotecario:");
        bibliotecario.mostrarDatos();
        System.out.println("--------------------------------");
        System.out.println("Préstamo " + prestamo.getIdPrestamo() + " creado para "
                + prestamo.getEstudiante().getNombre() + " con " + prestamo.getEjemplar().getCodigoEjemplar());
        System.out.println("Fecha inicial de devolución: " + prestamo.getFechaDevolucion());
        prestamo.renovar(LocalDate.of(2026, 10, 14));
        Renovacion renovacion = prestamo.getRenovaciones().get(0);
        System.out.println("Renovación registrada:");
        System.out.println("Fecha anterior: " + renovacion.getFechaAnteriorDevolucion());
        System.out.println("Nueva fecha: " + renovacion.getNuevaFechaDevolucion());
        System.out.println("Fecha de renovación: " + renovacion.getFechaRenovacion());
        System.out.println("--------------------------------");
        System.out.println("Reserva " + reserva.getIdReserva() + " creada para "
                + reserva.getEstudiante().getNombre() + ": " + reserva.getLibro().getTitulo());
        System.out.println("--------------------------------");
        estudiante.recibirNotificacion("Su préstamo fue renovado exitosamente.");
        System.out.println("================================");
    }
}
