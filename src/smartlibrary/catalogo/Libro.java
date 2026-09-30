package smartlibrary.catalogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Libro {
    private final String isbn;
    private final String titulo;
    private final String autor;
    private final List<Ejemplar> ejemplares = new ArrayList<>();

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public List<Ejemplar> getEjemplares() { return Collections.unmodifiableList(ejemplares); }

    public void agregarEjemplar(Ejemplar ejemplar) {
        if (ejemplar == null || (ejemplar.getLibro() != null && ejemplar.getLibro() != this)) {
            throw new IllegalArgumentException("El ejemplar debe existir y pertenecer a un solo libro.");
        }
        if (!ejemplares.contains(ejemplar)) {
            ejemplar.asignarLibro(this);
            ejemplares.add(ejemplar);
        }
    }

    public void mostrarEjemplares() {
        for (Ejemplar ejemplar : ejemplares) {
            System.out.println(ejemplar.getCodigoEjemplar());
        }
    }
}
