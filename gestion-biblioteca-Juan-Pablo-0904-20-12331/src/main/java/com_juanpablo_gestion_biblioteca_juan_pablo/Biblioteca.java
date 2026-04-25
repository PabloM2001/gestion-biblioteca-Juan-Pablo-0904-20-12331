
package com_juanpablo_gestion_biblioteca_juan_pablo;

import java.util.ArrayList;
import java.util.List;

    
public class Biblioteca {

    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        if (libro == null) {
            throw new IllegalArgumentException("Informaciòn obligatoria");
        }
        libros.add(libro);
    }

    public List<Libro> obtenerLibros() {
        return new ArrayList<>(libros); 
    }

    public Libro buscarPorTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Informaciòn obligatoria");
        }

        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null; 
    }
}
    

