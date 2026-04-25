
package com_juanpablo_gestion_biblioteca_juan_pablo;


public class Libro {

    private String titulo;
    private String autor;
    private int yearPublicacion;

    public Libro(String titulo, String autor, int yearPublicacion) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Informaciòn obligatoria");
        }
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("Informaciòn obligatoria");
        }
        if (yearPublicacion <= 0) {
            throw new IllegalArgumentException("Informaciòn obligatoria");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.yearPublicacion = yearPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getYearPublicacion() {
        return yearPublicacion;
    }

    public boolean esAntiguo() {
        return yearPublicacion < 2000;
    }
}