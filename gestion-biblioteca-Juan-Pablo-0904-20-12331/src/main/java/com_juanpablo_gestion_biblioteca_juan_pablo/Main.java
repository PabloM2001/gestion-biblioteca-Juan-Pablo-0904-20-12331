package com_juanpablo_gestion_biblioteca_juan_pablo;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

 
        for (int i = 1; i <= 4; i++) {
            try {
                System.out.println("\nLibro " + i);

                System.out.print("Título: ");
                String titulo = teclado.nextLine();

                System.out.print("Autor: ");
                String autor = teclado.nextLine();

                System.out.print("Año: ");
                int year = Integer.parseInt(teclado.nextLine());

                biblioteca.agregarLibro(new Libro(titulo, autor, year));
                System.out.println("Libro agregado correctamente");

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }


        System.out.println("\nLista de libros:");
        for (Libro libro : biblioteca.obtenerLibros()) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Año: " + libro.getYearPublicacion());
            System.out.println("----------------------");
        }

      
        System.out.print("\nIngrese título a buscar: ");
        String tituloBuscado = teclado.nextLine();

        Libro encontrado = biblioteca.buscarPorTitulo(tituloBuscado);

        if (encontrado != null) {
            System.out.println("Libro encontrado:");
            System.out.println("Título: " + encontrado.getTitulo());
            System.out.println("Autor: " + encontrado.getAutor());
            System.out.println("Año: " + encontrado.getYearPublicacion());
        } else {
            System.out.println("No se encontró el libro.");
        }

        teclado.close();
    }
}